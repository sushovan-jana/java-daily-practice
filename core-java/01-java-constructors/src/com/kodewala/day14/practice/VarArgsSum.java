package com.kodewala.day14.practice;

public class VarArgsSum {
	
	public int sum(int... numbers) {
		System.out.println(" Your entered numbers count is : " + numbers.length);
		
		int count = 0;
		for (int x : numbers) {
			count += x;
		}
		
		return count;
	}

	public static void main(String args[]) {
		VarArgsSum vas1 = new VarArgsSum();
		int sum = vas1.sum(10, 20, 30);
		System.out.println(" The sum is : " + sum);
	}
}
