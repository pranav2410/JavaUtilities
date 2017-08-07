package com.java.utility;

/**
 * Class contains Common checks we perform on day to day basis. Code that we write repeatedly in a jar!
 */
public class CommonChecks {

	/**
	 * check is the two Strings are equal
	 * @param pStringOne
	 * @param pStringTwo
	 * @param pCaseSensitive -  for matching Cases too
	 * @return Returns true if both Strings are empty or null or Equal, else false
	 */
	public static boolean isEqualStrings(String pStringOne, String pStringTwo, boolean pCaseSensitive){
		if(isStringEmpty(pStringOne) && isStringEmpty(pStringTwo))		{
			return true;
		}
		if(pCaseSensitive) {
			return pStringOne.equals(pStringTwo);
		} else {
			return pStringOne.equalsIgnoreCase(pStringTwo);
		}
		
	}
	
	/**
	 * checks if given String is empty
	 * @param pStringToCheck
	 * @return Returns true if String null or empty, else false
	 */
	public static boolean isStringEmpty(String pStringToCheck){
		if(pStringToCheck == null || pStringToCheck.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
}
