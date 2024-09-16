package lambdaassignment;

public class ex4 {
	public static void main(String[] args) {
		ex4interface obj = (x)->{
			int val = 1;
			for(int i = 1; i<=x; i++) {
				val*=i;
			}
			return val;
		};
		
		System.out.println(obj.factorial(6));
	}
}
