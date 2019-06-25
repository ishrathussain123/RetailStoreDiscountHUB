package com.store.retail.rest.service;

import org.springframework.stereotype.Service;

import com.store.retail.common.CommonUtils;
import com.store.retail.common.Constants;
import com.store.retail.rest.dto.BillDTO;

@Service
public class BillService {


	public BillDTO getDiscountedPrice(BillDTO billDTO) throws Exception
	{
		
		if(CommonUtils.isNotNullAndEmptyEqualIngoreCase(billDTO.getUserType(),Constants.USER_TYPE_EMPLOYEE))
		{
			billDTO.setDiscountPerc(Constants.USER_TYPE_EMPLOYEE_DISCOUNT_PERC);
			getNetPayableAmount(billDTO);
			
			
		}
		else if(CommonUtils.isNotNullAndEmptyEqualIngoreCase(billDTO.getUserType(),Constants.USER_TYPE_AFFILATED_TO_STORE))
		{
			billDTO.setDiscountPerc(Constants.USER_TYPE_AFFILATED_TO_STORE_DISCOUNT_PERC);
			
			getNetPayableAmount(billDTO);
			
		}else if(CommonUtils.isNotNullAndEmptyEqualIngoreCase(billDTO.getUserType(),Constants.USER_TYPE_CUSTOMER_OVER_2_YEARS))
		{
			billDTO.setDiscountPerc(Constants.USER_TYPE_CUSTOMER_OVER_2_YEARS_DISCOUNT_PERC);
			
			getNetPayableAmount(billDTO);
			
		}		else if(billDTO.getBill()!= null && billDTO.getBill() > Constants.BILL_MORE_THAN_100)
		{
			billDTO.setSecondBill(100.0*(billDTO.getBill().intValue()/100));
			billDTO.setDiscountPerc(Constants.BILL_MORE_THAN_100_DISCOUNT_PERC);
			getNetPayableAmount(billDTO);
			
		}				
		
		return billDTO;
	}
	private void getNetPayableAmount(BillDTO billDTO) throws Exception {
		
		
		billDTO.setNetPayableAmount(billDTO.getBill() - ((billDTO.getBill()*billDTO.getDiscountPerc())/100));
		if(billDTO.getSecondBill() != null)
		{
			
			billDTO.setNetPayableAmount(billDTO.getBill() - ((billDTO.getSecondBill()*billDTO.getDiscountPerc())/100));
				
		}
		
		billDTO.setErroCode(Constants.SUCCESS_ERROR_CODE);
		
		billDTO.setErrorMessage(Constants.SUCCESS_ERROR_MESSAGE.replace("{{percentage}}",billDTO.getDiscountPerc().toString()));
	}
	
	
	
	
}
