package com.gl.currencydenominations;

public class CurrencySorting {

	public static void sort(int[] arr) {
		int size = arr.length;
		int temp;
		for(int i = 0;i<size;i++) {
			for(int j=1;j<size-i;j++) {
				if(arr[j]>arr[j-1]) {
					temp =arr[j-1];
					arr[j-1]= arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
