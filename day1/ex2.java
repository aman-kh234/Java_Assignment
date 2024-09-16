package day1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		System.out.println("Enter Traffic Light Color" );
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		System.out.println(s);
		Traffic obj = new Traffic();
		obj.func(s);
	}

}
