package com.jdpaley.java;

public class ATMapp {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public void main(String[] args) {
		// USER & ACCT handling (through Account class)
		//
		//PLAN:
		//Welcome user, request acctNum -> validAcct, then pin -> validPin.
		//(if pin fails 3 times, freeze acct)
		//instantiate userAcct
		//Offer menu: Deposit, Withdrawal, Check Balance.
		//Perform operation and print receipt. In any case, display remaining balance.
		//
		//Let's have fun - this is what we have:
		ATM atm = new ATM();
//			public boolean validPIN();
//			public int validAcct(); //returns 0 if invalid, 1 if valid, 2 if pin-frozen
//			
//			public void clearScreen();
	println( ATM.welcomeUser() );
//			public long inputAcctNum();
//			public boolean inputPin();
//			public void freezeAcct();
//			//public void makeUser();
//			public int inputMenu();
//			public void makeDeposit();
//			public void makeWithdrawal();
//			public void checkBalance();
//			public void displayBalance();
	println(Receipt.TransactionSummary());
		 
	

	}

	private static void print(String msg) {
		System.out.print(msg);
	}
	private static void println(String msg) {
		System.out.println(msg);
	}
}
