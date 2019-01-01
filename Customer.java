package com.project1;

import java.util.Date;

public class Customer {
	String customer_fname;
	String customer_mname;
	String customer_lname;
	String customer_email;
	String customer_phoneno; //string coz phone no sometimes have +91 etc
	Date customer_dob; //here java.util is imported and not java.sql..doubt
	String customer_gender; //type casting required coz in html it will be radio button? 
	double customer_adhaar;
	String customer_panno;
	//String customer_accountno;
	Account account;
	public String getCustomer_fname() {
		return customer_fname;
	}
	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}
	public String getCustomer_mname() {
		return customer_mname;
	}
	public void setCustomer_mname(String customer_mname) {
		this.customer_mname = customer_mname;
	}
	public String getCustomer_lname() {
		return customer_lname;
	}
	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_phoneno() {
		return customer_phoneno;
	}
	public void setCustomer_phoneno(String customer_phoneno) {
		this.customer_phoneno = customer_phoneno;
	}
	public Date getCustomer_dob() {
		return customer_dob;
	}
	public void setCustomer_dob(Date customer_dob) {
		this.customer_dob = customer_dob;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	public double getCustomer_adhaar() {
		return customer_adhaar;
	}
	public void setCustomer_adhaar(double customer_adhaar) {
		this.customer_adhaar = customer_adhaar;
	}
	public String getCustomer_panno() {
		return customer_panno;
	}
	public void setCustomer_panno(String customer_panno) {
		this.customer_panno = customer_panno;
	}

	//setter getter for accounts
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [customer_fname=" + customer_fname + ", customer_mname=" + customer_mname + ", customer_lname="
				+ customer_lname + ", customer_email=" + customer_email + ", customer_phoneno=" + customer_phoneno
				+ ", customer_dob=" + customer_dob + ", customer_gender=" + customer_gender + ", customer_adhaar="
				+ customer_adhaar + ", customer_panno=" + customer_panno + ", account=" + account + "]";
	}
//	public Customer(String customer_fname, String customer_mname, String customer_lname, String customer_email,
//			String customer_phoneno, Date customer_dob, String customer_gender, double customer_adhaar,
//			String customer_panno, Account account) {
//		super();
//		this.customer_fname = customer_fname;
//		this.customer_mname = customer_mname;
//		this.customer_lname = customer_lname;
//		this.customer_email = customer_email;
//		this.customer_phoneno = customer_phoneno;
//		this.customer_dob = customer_dob;
//		this.customer_gender = customer_gender;
//		this.customer_adhaar = customer_adhaar;
//		this.customer_panno = customer_panno;
//		this.account = account;
//	}
	
	

	
	
	public Customer() {
		super();
		this.customer_fname = customer_fname;
		
		this.account = account;
	}
	
	
	
}
