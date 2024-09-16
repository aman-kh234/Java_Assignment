package Assignmentday5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class fifth {

	public static void main(String[] args) {
		Set st = new HashSet<>(4);

		st.add(new fourthone(1001,"Aman1"));
		st.add(new fourthone(1002,"Aman2"));
		String s1 = "rahul";
		String s2 = "rohit";
		st.add(s1);
		st.add(s2);
		Integer x = 4;
		Integer y = 5;
		Integer z = 6;
		
		st.add(x);
		st.add(y);
		st.add(z);
		
		Iterator i = st.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n");
		
		
		//ArrayList
		List lt = new ArrayList<>(4);

		lt.add(new fourthone(1001,"Aman1"));
		lt.add(new fourthone(1002,"Aman2"));
		String s11 = "rahul";
		String s12 = "rohit";
		lt.add(s11);
		lt.add(s12);
		Integer x1 = 4;
		Integer y1 = 5;
		Integer z1 = 6;
		
		lt.add(x1);
		lt.add(y1);
		lt.add(z1);
		
		Iterator i1 = lt.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("\n");
		
		
		//LinkedHashSet
		
		Set st3 = new LinkedHashSet<>(4);

		st3.add(new fourthone(1001,"Aman1"));
		st3.add(new fourthone(1002,"Aman2"));
		String s21 = "rahul";
		String s22 = "rohit";
		st3.add(s21);
		st3.add(s22);
		Integer x2 = 4;
		Integer y2 = 5;
		Integer z2 = 6;
		
		st3.add(x2);
		st3.add(y2);
		st3.add(z2);
		
		Iterator i3 = st3.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		}

}
