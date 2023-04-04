package com.gl.currencydenominations;
import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] currencyDenoms = new int[size];
		for ( int i=0;i<size;i++) {
			currencyDenoms[i]=sc.nextInt();	
		}
		System.out.println("Enter the amount you need to pay");
		int amount = sc.nextInt();

		CurrencySorting.sort(currencyDenoms);

		System.out.println("Your payment approach in order to give min no of notes will be");
		int[] noOfNotes = new int[size];

		for(int i=0;i<size;i++) {

			while(amount>=currencyDenoms[i]) {
				noOfNotes[i]=amount/currencyDenoms[i];
				amount = amount - (currencyDenoms[i] * noOfNotes[i]);
				 
			}
			if(noOfNotes[i]!=0) {
				System.out.println(currencyDenoms[i]+":"+noOfNotes[i]);
			}
		}

	}



}
