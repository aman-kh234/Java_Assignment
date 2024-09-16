package lambdaassignment;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		ex3interface obj = (name,pass)->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name :");
			String s = sc.next();
			System.out.println("Enter Password :");
			String s1 = sc.next();
			
			if(name.equals(s) && pass.equals(s1))
				return true;
			else
				return false;
		};
		System.out.println(obj.func("aman","1234"));
	}

}
