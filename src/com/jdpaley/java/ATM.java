package com.jdpaley.java;
//*** ATM ***
//This will eventually be used to CRUD users & accts, persist in SQL DB, access via Web.

public class ATM implements iATM {
	//Core Biz Functions
	
	@Override
	public boolean validPIN() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int validAcct() {
		// TODO Auto-generated method stub
		int validCode =0; // 0 -> invalid acct, 1 -> valid acct, 2 -> PIN-frozen acct
		
		return validCode;
	}
	
	

}
