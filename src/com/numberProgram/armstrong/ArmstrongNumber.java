package com.numberProgram.armstrong;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int temp = num;
		
		int length = 0;
		
		while (num != 0) {
			
			length = length + 1;
			
			num = num / 10;
			
		}
		
		num = temp;
		
		int sum = 0;
		
		while (num != 0) {
			
			int ld = num % 10;
			
			double power = Math.pow(ld, length);
			
			sum = sum + (int)power;
			
			num = num / 10;
			
		}
		
		if (temp == sum) {
			
			System.out.println("armstrong");
			
		} else {
			
			System.out.println("not arstrong");
			
		}

	}

}
