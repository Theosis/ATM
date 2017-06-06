package com.jdpaley.java;

public interface iATM {
	//
	public boolean validPIN();
	public int validAcct(); //returns 0 if invalid, 1 if valid, 2 if pin-frozen
	

}
