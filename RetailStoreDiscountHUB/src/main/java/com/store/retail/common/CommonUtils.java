package com.store.retail.common;

public class CommonUtils {

	public static boolean isNotNullAndEmpty(String str) 
	{
		
		if(str != null && !str.trim().isEmpty())
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isNotNull(Object obj) 
	{
		
		if(obj != null )
		{
			return true;
		}
		
		return false;
	}
	public static boolean isNotNullAndEmptyEqualIngoreCase(String str1, String str2) 
	{
		
		if(isNotNullAndEmpty(str1) && isNotNullAndEmpty(str2) && str1.trim().equalsIgnoreCase(str2))
		{
			return true;
		}
		
		return false;
	}
}
