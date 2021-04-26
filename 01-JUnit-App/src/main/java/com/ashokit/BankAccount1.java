package com.ashokit;

public class BankAccount1 {

	
	
	  private String accountID;
	   private double balance;
	  

	   /**
	   Constructs a bank account with a zero balance
	   @param accountID - ID of the Account
	   */
	   public BankAccount1(String accountID)
	   {   
	   balance = 0;
	   this.accountID = accountID;
	   }

	   /**
	   Constructs a bank account with a given balance
	   @param initialBalance the initial balance
	   @param accountID - ID of the Account
	   */
	   public BankAccount1(double initialBalance, String accountID)
	   {   

	           this.accountID = accountID;
	           balance = initialBalance;
	   }
	     
	   /**
	       * Returns the Account ID
	       * @return the accountID
	       */
	       public String getAccountID() {
	           return accountID;
	       }
	      
	       /**
	       * Sets the Account ID
	       * @param accountID
	       */
	       public void setAccountID(String accountID) {
	           this.accountID = accountID;
	       }

	   /**
	   Deposits money into the bank account.
	   @param amount the amount to deposit
	   */
	   public void deposit(double amount)
	   {

	           balance += amount;
	   }

	   /**
	   Withdraws money from the bank account.
	   @param amount the amount to withdraw
	   @return true if allowed to withdraw
	   */
	   public boolean withdraw(double amount)
	   {   
	       boolean isAllowed = balance >= amount;
	       if (isAllowed)
	           balance -= amount;
	       return isAllowed;
	   }

	   /**
	   Gets the current balance of the bank account.
	   @return the current balance
	   */
	   public double getBalance()
	   {   
	   return balance;
	   }
	  
	
	
	
	
}
