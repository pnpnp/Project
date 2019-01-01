package com.project1;

import java.io.Serializable;

public class Account implements Serializable{
	
	String account_id;
	String account_type;
	double account_balance;
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
//	public Account() {
//		super();
//	}
	
	
	
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_type=" + account_type + ", account_balance="
				+ account_balance + "]";
	}
	public Account(String account_id, String account_type, double account_balance) {
		super();
		this.account_id = account_id;
		this.account_type = account_type;
		this.account_balance = account_balance;
	}
	
	
	
	
}
