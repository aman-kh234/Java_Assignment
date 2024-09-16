package lambdaassignment;

public class ex2 {
	public static void main(String[] args) {
		ex2interface obj = (s)->{
			for(int i = 0; i<s.length(); i++)
				System.out.print(s.charAt(i)+"\t");
			};
		obj.func("aman");
	}
}
