package com.store.retail.rest.controller;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.store.retail.common.CommonUtils;
import com.store.retail.common.Constants;
import com.store.retail.rest.BillRequest;
import com.store.retail.rest.BillResponse;
import com.store.retail.rest.dto.BillDTO;
import com.store.retail.rest.service.BillService;

@RestController()
public class BillController {

	@Autowired
	private BillService billService;

	@RequestMapping(method = RequestMethod.POST, value = "/bill/discount")
	public BillResponse getBillDetails(@RequestBody BillRequest billRequest) {

		try {
			
			if(!CommonUtils.isNotNullAndEmpty(billRequest.getUserType()) 
					||
				!CommonUtils.isNotNullAndEmpty(billRequest.getShoppingType())
				|| 
				
				!CommonUtils.isNotNull(billRequest.getBill())
				||
				(billRequest.getBill()<=0)
						
				){
				
				return new BillResponse(null, Constants.INVALID_REQ_PARAM_ERROR_CODE,
						Constants.INVALID_REQ_PARAM_ERROR_MESSAGE);
				
			}
			
			BillDTO billDTO = new BillDTO();
			billDTO.setBill(billRequest.getBill());
			billDTO.setUserType(billRequest.getUserType());
			billService.getDiscountedPrice(billDTO);

			if (!CommonUtils.isNotNullAndEmptyEqualIngoreCase(billRequest.getShoppingType(), Constants.USER_SHOPPING_TYPE_GROC) &&  CommonUtils.isNotNullAndEmptyEqualIngoreCase(billDTO.getErroCode(),Constants.SUCCESS_ERROR_CODE)) {

				return new BillResponse(billDTO.getNetPayableAmount(), billDTO.getErroCode(),
						billDTO.getErrorMessage());
			} else {
				return new BillResponse(billRequest.getBill(), Constants.NO_DISCOUNT_ERROR_CODE,
						Constants.NO_DISCOUNT_ERROR_MESSAGE);

			}

			
		} catch (Exception e) {
			return new BillResponse(null, Constants.SOMETHING_WENT_WRONG_ERROR_CODE,
					Constants.SOMETHING_WENT_WRONG_ERROR_MESSAGE);

		}
		

	}
	
	
}
