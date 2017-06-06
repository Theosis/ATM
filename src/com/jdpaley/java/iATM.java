package com.jdpaley.java;

public interface iATM {
	//
	public boolean validPIN();
	public int validAcct(); //returns 0 if invalid, 1 if valid, 2 if pin-frozen
	
	public void clearScreen();
	public String welcomeUser();
	public long inputAcctNum();
	public boolean inputPin();
	public void freezeAcct();
	//public void makeUser();
	public int inputMenu();
	public void makeDeposit();
	public void makeWithdrawal();
	public void checkBalance();
	public void displayBalance();
	public void printReceipt();

}
