package listassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		List<Integer>li = new ArrayList<Integer>();
		li.addAll(Arrays.asList(34,45,67,90,3,23,56,43,12,87));
		
		for(int i : li) {
			if((i%2)==1)
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		Collections.sort(li);
		
		System.out.println(li.get(0));
		
		Collections.sort(li, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return (b-a);
			}
		});
		for(int i : li) {
			System.out.print(i+" ");
		}
	}

}
