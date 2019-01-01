package com.project1;

public class Loan {

	String loan_id;
	LoanType loan_type;
	double loan_amount;
	public String getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(String loan_id) {
		this.loan_id = loan_id;
	}
	public LoanType getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(LoanType loan_type) {
		this.loan_type = loan_type;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	public Loan(String loan_id, LoanType loan_type, double loan_amount) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
	}
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loan_type=" + loan_type + ", loan_amount=" + loan_amount + "]";
	}
	
	
}
