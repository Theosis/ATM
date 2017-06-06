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

	@Override
	public void clearScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String welcomeUser() {
		// TODO Auto-generated method stub
		return "Welcome!";
	}

	@Override
	public long inputAcctNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean inputPin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void freezeAcct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void makeDeposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeWithdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		
	}
	
	

}
