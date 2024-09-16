package Assignmentday5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class first {
	public static void main(String[] args) {
		Set<String> st = new HashSet<String>();
		st.add("Aman");
		st.add("Satyam");
		st.add("Panshul");
		st.add("Panshul");
		st.add("Ram");
		
		Iterator<String> i = st.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
