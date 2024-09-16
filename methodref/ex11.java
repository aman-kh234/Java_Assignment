package methodref;

public class ex11 {

	public static void main(String[] args) {
		ex1 obj = new ex1();
		exi o = obj :: display; 
		
		System.out.println(o.power(3, 4));
	}

}
