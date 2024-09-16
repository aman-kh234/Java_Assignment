package day1;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		divisible obj = new divisible();
		System.out.println(obj.calculateSum(n));
	}

}
