package methodref;

interface hello4{
	public int func(int s);
}

class s4{
	public int func(int x){
		int val = 1;
		for(int i = 1; i<=x; i++) {
			val*=i;
		}
		return val;
}
}

public class ex4 {
	public static void main(String[] args) {
		s4 obj = new s4();
		hello4 o1 = obj::func;
		
		System.out.println(o1.func(6));
	}
}

