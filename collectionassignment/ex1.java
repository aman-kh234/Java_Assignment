package collectionassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.addAll(Arrays.asList(1,7,3,6,5,6));
		
		ArrayList<Integer> prefix = new ArrayList<Integer>();
		int cnt = 0;
		prefix.add(0);
		for(int i: li) {
			cnt+=i;
			prefix.add(cnt);
		}
		
		int n = prefix.size();
		
		for(int i = 1; i<n; i++) {
			int k1 = prefix.get(i-1);
			int k2 = prefix.get(i);
			if((k1)==(prefix.getLast()-k2)) {
//				System.out.println(k1);
				System.out.println(i-1);
			}
		}
	}
}
