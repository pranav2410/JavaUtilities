package com.java.crypto;

public interface CryptoInterface {

	/**
	 * This method accepts Key for encryption, key size and block-length, and data to be encrypted. <br> 
	 * This method will use dofinal() for any implementing Encryption Algorithm.<br>
	 * Block-length should be equal or more than key size 
	 * @param pKey
	 * @param pBlockLength
	 * @param pPlainData
	 * @return
	 */
	public byte[] encrypt(String pKey, int pBlockLength, byte[] pPlainData)throws Exception;
	
	/**
	 * This method accepts Key for decryption, key size and block-length, and data to be decrypted. <br> 
	 * This method will use dofinal() for any implementing Encryption Algorithm.<br>
	 * Block-length should be equal or more than key size 
	 * @param pKey
	 * @param pBlockLength
	 * @param pEncryptedData
	 * @return
	 * @throws Exception 
	 */
	public byte[] decrypt(String pKey, int pBlockLength, byte[] pEncryptedData) throws Exception;
}
