package com.project1;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("1","loan",1000);
		//Customer cust = new Customer("pratik", null, null, null, null, null, null, 0, null, acc);
		//cust.setCustomer_fname("Pratik");
		//Customer cust = new Customer("Pratik", acc);
		
		Loan loan = new Loan("123",LoanType.Salary,50000);
		
		Customer cust = new Customer();
		cust.setCustomer_fname("Pratik") ;
		cust.setAccount(acc);
		cust.setLoan(loan);
		System.out.println(cust);
		
		
		
		
		
				

	}

}
