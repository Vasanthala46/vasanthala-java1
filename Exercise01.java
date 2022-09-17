package com.exercise.demo;

import java.util.ArrayList;

public class Exercise01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
			
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			numbers.add(4);
			numbers.add(5);
			numbers.add(6);
			numbers.add(7);
			numbers.add(8);
			numbers.add(9);
			numbers.add(10);
			
			int evenSum = findSum(numbers);
			System.out.println("Even Sum : " + evenSum);
		
	}
	
	public static int findSum(ArrayList<Integer> numbers) {
		
		int evenSum = 0;
	
	    for(int i=0; i<numbers.size(); i++) {
		int n = numbers.get(i);
		
		if(n%2==0) 
			evenSum = evenSum + n;
		}
		
		return evenSum;
	}
	    
}

