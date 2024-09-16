package day1;

import java.util.Scanner;

public class ex4 {
	static boolean func(int n) {
		if(n<=1)
			return false;
		
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(ex4.func(i))
				System.out.println(i);
		}
	}
}
