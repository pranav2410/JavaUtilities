package com.java.utility;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Formatter;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
	 * @param pEncodedData - Base64 encoded data
	 * @param pOutputStringEncoding - Encoding for output String
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String decodeBase64(String pEncodedData, String pOutputStringEncoding) throws UnsupportedEncodingException {
		String lstrStringEncoding = isStringEmpty(pOutputStringEncoding) ? "UTF-8": pOutputStringEncoding; 
		byte[] lbarrDecodedData =  Base64.getDecoder().decode(pEncodedData);
		String lstrDecodedData =  new String(lbarrDecodedData, lstrStringEncoding);
		return lstrDecodedData;
	}
	
	/**
	 * get JSON string for the Map passed.<br>
	 * No Class Level annotations required to be provided. <br>Keys provided in map or internal maps should be <b>String</b>. These keys would be used as keys in JSON string
	 * @param pParams
	 * @param pFQClassName - Fully Qualified name of Class to which object belongs
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static String getJSONFromObject(HashMap<String, Object> pParams) throws ClassNotFoundException{
		assert pParams != null && !pParams.isEmpty();
		
		JSONObject lObject = new JSONObject();
		lObject.putAll(pParams);
		return lObject.toJSONString();
	}
	
	/**
	 * Get a Object from valid JSON String passed.<br>
	 * Return java.lang.Object, cast it to desired object
	 * @param pJSONString
	 * @param pFQClassName
	 * @return
	 * @throws ParseException
	 * @throws ClassNotFoundException
	 */
	public static Object getObjectFromJSONString(String pJSONString, String pFQClassName) throws ParseException, ClassNotFoundException{
		assert !isStringEmpty(pJSONString) && !isStringEmpty(pFQClassName);
		
		JSONParser lParser = new JSONParser();
		Object lObject = lParser.parse(pJSONString);
		return lObject;
	}	
	
	public static String toHexString(byte[] pData) {
		Formatter lFormatter =  new Formatter();
		for(byte lbyte: pData) {
			lFormatter.format("%20x", lbyte);
		}
		String lHexString = lFormatter.toString();

		lFormatter.close();
		lFormatter = null;
		return lHexString;	
	}
	
	public static String generateRandomString(int pLength, boolean pCaps, boolean pAlphaNumeric) {
		// generate a random String of length pLength
		// with 
	
		return null;
	}
	
	
	
}