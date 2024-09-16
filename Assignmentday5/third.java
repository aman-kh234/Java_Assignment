package Assignmentday5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class third {
     public static void main(String[] args) {
    	 Set<Double> st = new HashSet<Double>();
    	 st.add(23.56);
    	 st.add(56.78);
    	 st.add(23.98);
    	 
    	 Iterator<Double> i = st.iterator();
    	 Double val = 0.0;
    	 while(i.hasNext()) {
    		 val+=i.next();
    	 }
    	 System.out.println(val);
     }
}
