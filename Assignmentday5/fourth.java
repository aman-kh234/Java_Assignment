// Create your own HashSet object with initial capacity of 5. Add the following objects to the newly created HashSet object:  
//2 String objects. 
//2 MyOwnClass object. (You will have to create MyOwnClass.java first) 
//3 Integer objects.  
//Display the HashSet object.  

package Assignmentday5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class fourth {

	public static void main(String[] args) {
		Set st = new HashSet<>(5);
//		System.out.println(st.size());
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

	}

}
