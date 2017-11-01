package com.java.crypto;

public enum KeyLength {
	
	
	KEY_SIZE_128(128),
	
	KEY_SIZE_256(256);

	private int miKeySize;
	
	KeyLength(int pKeySize) {
		this.miKeySize = pKeySize;
	}
	
	public int getKeySiz() {
		return this.miKeySize;
	}
	
}
