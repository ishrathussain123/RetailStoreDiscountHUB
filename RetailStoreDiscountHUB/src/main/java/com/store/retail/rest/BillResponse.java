package com.store.retail.rest;

public class BillResponse {

	private Double netPayableAmount;
	private String erroCode;
	private String errorMessage;

	public BillResponse() {
	}

	public BillResponse(Double netPayableAmount, String erroCode, String errorMessage) {
		this.netPayableAmount = netPayableAmount;
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
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

	@Override
	public String toString() {
		return "BillResponse [netPayableAmount=" + netPayableAmount + ", erroCode=" + erroCode + ", errorMessage="
				+ errorMessage + "]";
	}
	
	

}
