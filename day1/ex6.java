package day1;

import java.util.Scanner;

public class ex6 {
	static int square(int n) {
		return (int) Math.pow(((n*(n+1))/2),2);
	}
	public static void main(String[] args) {
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum+=i*i;
		}
		
		System.out.println(ex6.square(n)-sum);
	}

}
