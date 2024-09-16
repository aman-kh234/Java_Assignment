package day1;

import java.util.Scanner;

public class ex7 {
	static void func(int n) {
		int prev = 0;
		while(n>0) {
			prev = n%10;
			n/=10;
			if((n>0) && (n%10)>prev)
			{
				System.out.println("Not increasing Number");
				return;
			}
		}
		System.out.println("Increaing Number");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ex7.func(n);
	}

}
