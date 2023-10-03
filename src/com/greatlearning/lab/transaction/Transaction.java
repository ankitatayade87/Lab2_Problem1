package com.greatlearning.lab.transaction;

public class Transaction {
	int transactionSize;
	int target, sum;
	int []transactionArray;
	
	Transaction(int transactionSize)
	{
		this.transactionSize = transactionSize;
		transactionArray = new int[this.transactionSize];
	}
	
	
	public int TransactionCheck(int []transaction, int target)
	{
		for(int i=0; i<transaction.length; i++)
		{
			sum += transaction[i];
			if(sum >= target)
			{
				return i;
			}
		}
		return -1;
	
	}

}
