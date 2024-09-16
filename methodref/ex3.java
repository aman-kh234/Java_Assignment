package methodref;

import java.util.Scanner;

interface hello1{
	public boolean func(String s,String pass);
}

class s3{
	public boolean func(String name,String pass){
		if(name.equals("aman") && pass.equals("1234"))
			return true;
	
			return false;
	}
}

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String s = sc.next();
		System.out.println("Enter Password :");
		String s1 = sc.next();
		
		s3 obj = new s3();
		hello1 o1 = obj::func;
		
		boolean b= o1.func(s,s1);
		System.out.println(b);
	}
}

