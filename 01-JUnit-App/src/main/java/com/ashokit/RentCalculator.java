package com.ashokit;

import java.util.Date;

public class RentCalculator {

	
	private double utilitiesChare;
	private int numberOfMonth;
	private double rentAmount;
	private Date loanDate;
	
	public RentCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public RentCalculator(double utilitiesChare, int numberOfMonth, double rentAmount) {
		super();
		this.utilitiesChare = utilitiesChare;
		this.numberOfMonth = numberOfMonth;
		this.rentAmount = rentAmount;
	}


	
	
	
	public double getUtilitiesChare() {
		return utilitiesChare;
	}


	public void setUtilitiesChare(double utilitiesChare) {
		this.utilitiesChare = utilitiesChare;
	}


	public int getNumberOfMonth() {
		return numberOfMonth;
	}


	public void setNumberOfMonth(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}


	public double getRentAmount() {
		return rentAmount;
	}


	public void setRentAmount(double rentAmount)  throws Exception{

		if(rentAmount<0)
				throw new Exception("Money Can not negative");
		
		
		this.rentAmount = rentAmount;
	}

	
	public double getTotalRentPayment() {
		
	double totalPayment=	(rentAmount+utilitiesChare)*numberOfMonth;
		
	return totalPayment;
	}
	

	public Date getLoanDate() {
		return loanDate;
	}


	
	
	
	
	
	
	
}
