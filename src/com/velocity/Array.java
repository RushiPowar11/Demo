package com.velocity;

public class Array {
	
	// Sum of array

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i <= a.length; i++ ) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
