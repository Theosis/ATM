package com.jdpaley.java;

import java.math.BigDecimal;

public class Account {
	//Privately manages accts via getters/setters.
	private long acctNum;
	private String userName;
	private BigDecimal balance;
	private String pin;
	private int pinAttempts;
	private String acctStatus; // "normal", "FROZEN (too many attempts at PIN entry)" //, "OVERDRAFT"
	
	protected long getAcctNum() {
		return acctNum;
	}
	
	protected void setAcctNum(long acctNum) {
		this.acctNum = acctNum;
	}
	
	protected String getUserName() {
		return userName;
	}
	
	protected void setUserName(String userName) {
		this.userName = userName;
	}
	
	protected BigDecimal getBalance() {
		return balance;
	}
	
	protected void setBalance(BigDecimal balance) {
		this.balance = balance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
	
	protected String getPin() {
		return pin;
	}
	
	protected void setPin(String pin) {
		this.pin = pin;
	}
	
	protected int getPinAttempts() {
		return pinAttempts;
	}
	
	protected void setPinAttempts(int pinAttempts) {
		this.pinAttempts = pinAttempts;
	}
	
	protected String getAcctStatus() {
		return acctStatus;
	}
	
	protected void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	
	protected BigDecimal deposit(BigDecimal amt) {
		BigDecimal balance = this.getBalance();
		balance = balance.add(amt);
		this.setBalance(balance);
		return balance;		
	}
	
	protected BigDecimal withdraw(BigDecimal amt) {
		BigDecimal balance = this.getBalance();
		balance = balance.subtract(amt);
		this.setBalance(balance);
		return balance;		
	}

}
