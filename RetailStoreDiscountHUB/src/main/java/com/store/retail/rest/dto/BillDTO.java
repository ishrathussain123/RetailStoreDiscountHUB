package com.store.retail.rest.dto;

/**
 * @author ishrat.hussain
 *
 */
public class BillDTO {

	private Double bill;
	private Double secondBill;
	private String userType;
	private Double netPayableAmount;
	private Double discountPerc;
	private String erroCode;
	private String errorMessage;
	
	public BillDTO() {
	
	}
	
	

	public BillDTO(Double bill, String userType, String userPurchasePeriod, Double netPayableAmount, String erroCode,
			String errorMessage) {
		this.bill = bill;
		this.userType = userType;
		this.netPayableAmount = netPayableAmount;
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}

	
	
	
	


	public Double getSecondBill() {
		return secondBill;
	}



	public void setSecondBill(Double secondBill) {
		this.secondBill = secondBill;
	}



	public Double getDiscountPerc() {
		return discountPerc;
	}



	public void setDiscountPerc(Double discountPerc) {
		this.discountPerc = discountPerc;
	}



	public Double getBill() {
		return bill;
	}
	public void setBill(Double bill) {
		this.bill = bill;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public Double getNetPayableAmount() {
		return netPayableAmount;
	}
	public void setNetPayableAmount(Double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}
	public String getErroCode() {
		return erroCode;
	}
	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	
	public String toString() {
		return "BillDTO [bill=" + bill + ", userType=" + userType + ", netPayableAmount=" + netPayableAmount
				+ ", discountPerc=" + discountPerc + ", erroCode=" + erroCode + ", errorMessage=" + errorMessage + "]";
	}


	
	
	
	
	
}
