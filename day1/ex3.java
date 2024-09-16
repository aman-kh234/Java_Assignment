package day1;

import java.util.Scanner;

public class ex3 {
	public int recu(int n) {
		if(n<=1)
			return n;
		return recu(n-1)+recu(n-2);
	}
	public static void main(String[] args) {
		ex3 obj = new ex3();
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		//recursive
		System.out.println(obj.recu(k));
		
		// without recursive
		
		int a = 1, b = 1;
		if(k<=2)
			System.out.println(1);
		else {
			for(int i = 3; i<=k; i++) {
				int temp = b;
				b=a+b;
				a=temp;
			}
			System.out.println(b);
		}
		
	}

}
