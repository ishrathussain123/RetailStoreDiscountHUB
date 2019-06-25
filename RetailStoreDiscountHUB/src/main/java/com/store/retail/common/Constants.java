package com.store.retail.common;

public class Constants {

	public static String SOMETHING_WENT_WRONG_ERROR_CODE = "-1";
	public static String SOMETHING_WENT_WRONG_ERROR_MESSAGE = "Something just went wrong, we're currently working hard to fix the problem";
	
	public static String INVALID_REQ_PARAM_ERROR_CODE = "-2";
	public static String INVALID_REQ_PARAM_ERROR_MESSAGE = "Invalid request parameters";
	
	public static String SUCCESS_ERROR_CODE = "00";
	public static String SUCCESS_ERROR_MESSAGE = "Congratulations, you got {{percentage}}% discount on bill.";
	
	public static String NO_DISCOUNT_ERROR_CODE = "01";
	public static String NO_DISCOUNT_ERROR_MESSAGE = "Sorry you're not applicable for any discount.";
	
	public static String USER_SHOPPING_TYPE_GROC = "GROC";
	public static String USER_SHOPPING_TYPE_OTH = "OTH";
	
	public static String USER_TYPE_EMPLOYEE = "EMP";
	public static Double USER_TYPE_EMPLOYEE_DISCOUNT_PERC = 30.0;
	
	public static String USER_TYPE_AFFILATED_TO_STORE = "AFF";
	public static Double USER_TYPE_AFFILATED_TO_STORE_DISCOUNT_PERC = 10.0;


	public static String USER_TYPE_CUSTOMER_OVER_2_YEARS = "O2Y";
	public static Double USER_TYPE_CUSTOMER_OVER_2_YEARS_DISCOUNT_PERC = 5.0;

	public static Double BILL_MORE_THAN_100 = 100.0;
	public static Double BILL_MORE_THAN_100_DISCOUNT_PERC = 5.0;

}
