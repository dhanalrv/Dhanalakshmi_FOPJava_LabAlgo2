package com.gl.paymoney;

import java.util.Scanner;

public class Transaction {
	public static int getNoOfTransactions(int[] transaction,int n ,int targetValue) {
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(sum>= targetValue) {
				return i;
			}
			sum+= transaction[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int noOfTargets,target,result;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of transaction array :");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Size of the array cannot be 0 or negative value !!!");
		} else {

			System.out.println("Enter the values of array");
			int[] transactionArray = new int[n];
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				while(x<=0) {
					System.out.println("System does not accept o or negative transactions !!!");
					return;
				}

				transactionArray[i]=x;	
			}
			System.out.println("Enter the total number of targets that needs to be achieved :");
			noOfTargets = sc.nextInt();
			while(noOfTargets>0) {
				System.out.println("Enter the value of target :");
				target = sc.nextInt();
				result = getNoOfTransactions(transactionArray,n,target);
				if(result == -1) {
					System.out.println("Given target is not achieved !!");
				} else {
					System.out.println("Target achieved after "+result+" Transactions");
				}
				noOfTargets--;
			}
			sc.close();
		}
	}
}
