package com.ashokit;

public class Money {
	
	private int cAmount;
	private String cCurrency;
	// constructor for creating a money object
	public Money(int amount, String currency) {
	cAmount = amount;
	cCurrency = currency;
	}

	// set money
	public int getAmount() {
	return cAmount;
	}

	// get money
	public String getCurrency() {
	return cCurrency;
	}

	public Money add(Money m) throws Exception {
	   if (m.getAmount()<0) {
	   throw new Exception("Money cannot be negative");
	   }else {
	   return new Money(cAmount - m.getAmount(), getCurrency());
	   }
	   
	}

	   @Override
	   public boolean equals(Object anObject) {
	   if (anObject instanceof Money) {
	   Money passedMoney = (Money) anObject;
	   if (this.cAmount == passedMoney.getAmount()
	       && this.cCurrency.equals(passedMoney.getCurrency()))
	       return true;
	          }
	          return false;
	       }
	}
	

