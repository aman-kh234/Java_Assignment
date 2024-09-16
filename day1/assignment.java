package day1;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a value");
		 int n = sc.nextInt();
		 long sum = 0;
		 while(n>0) {
			 int k = n%10;
			 sum+=(k*k*k*1L);
			 n/=10;
		 }
		 System.out.println(sum);
	}

}
