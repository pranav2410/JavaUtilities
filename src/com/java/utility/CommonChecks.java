package com.java.utility;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

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
	
	/**
	 * Encode passed Byte array in Base64 format. java.util.Base64 class is used for Encoding Data
	 * @param pPlainData
	 * @return String of Base64 encoded Data
	 */
	public static String encodeBase64(byte[] pPlainData) {
		String lstrEncodedData = Base64.getEncoder().encodeToString(pPlainData);
		return lstrEncodedData;
	}
	
	/**
	 * Decodes Base64 encoded data and returns String based on String encoding passed. 
	 * <br>If pOutputStringEncoding is passed null or empty default encoding UTF-8 is used.
	 * @param pEncodedData
	 * @param pOutputStringEncoding
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String decodeBase64(String pEncodedData, String pOutputStringEncoding) throws UnsupportedEncodingException {
		String lstrStringEncoding = isStringEmpty(pOutputStringEncoding) ? "UTF-8": pOutputStringEncoding; 
		byte[] lbarrDecodedData =  Base64.getDecoder().decode(pEncodedData);
		String lstrDecodedData =  new String(lbarrDecodedData, lstrStringEncoding);
		return lstrDecodedData;
	}
}