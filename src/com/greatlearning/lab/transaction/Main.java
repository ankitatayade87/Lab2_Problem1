package com.greatlearning.lab.transaction;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Transaction Array");
		int transactionSize = sc.nextInt();
		
		Transaction obj = new Transaction(transactionSize);
	
		System.out.println("Enter the value of array");

		for(int i=0; i<obj.transactionSize; i++)
		{			

			obj.transactionArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value of Target");
		
		obj.target = sc.nextInt();
		
		int index = obj.TransactionCheck(obj.transactionArray, obj.target);
		
		if(index <= 0)
		{
			System.out.println("Target cannot be acheived");
		}
		else
		{
			System.out.println("Target can be acheived after "+(index+1)+" transaction");
		}
		
		sc.close();
	
	}
}
