package day1;

public class Traffic {
	public void func(String s) {
		if(s.equals("red"))
			System.out.println("Stop");
		else if(s.equals("yellow"))
			System.out.println("Ready");
		else if(s.equals("green"))
			System.out.println("Go");
	}
}
