package com.store.retail.rest;

public class BillRequest {

	private Double bill;
	private String userType;
	private String userPurchasePeriod;
	private String shoppingType;
	
	public BillRequest() {
	}
	
	
	public BillRequest(Double bill, String userType, String userPurchasePeriod) {
		super();
		this.bill = bill;
		this.userType = userType;
		this.userPurchasePeriod = userPurchasePeriod;
	}

	
	

	public String getShoppingType() {
		return shoppingType;
	}


	public void setShoppingType(String shoppingType) {
		this.shoppingType = shoppingType;
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
	public String getUserPurchasePeriod() {
		return userPurchasePeriod;
	}
	public void setUserPurchasePeriod(String userPurchasePeriod) {
		this.userPurchasePeriod = userPurchasePeriod;
	}


	@Override
	public String toString() {
		return "BillRequest [bill=" + bill + ", userType=" + userType + ", userPurchasePeriod=" + userPurchasePeriod
				+ "]";
	}
	
	
	
	
	
	
}
