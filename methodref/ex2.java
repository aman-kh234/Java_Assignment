package methodref;

interface hello{
	public void func(String s);
}

class s1{
	public void func(String s){
		for(int i = 0; i<s.length(); i++)
			System.out.print(s.charAt(i)+"\t");
		};
}

public class ex2 {
	public static void main(String[] args) {
		s1 obj = new s1();
		hello o1 = obj::func;
		
		o1.func("aman");
	}
}
