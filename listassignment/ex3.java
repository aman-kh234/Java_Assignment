package listassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ex3 {
	public static void main(String[] args) {
		String[] arr = {"a","b","a","k","c","k","c","a","b","d"};
		int n = 3;
		
		Map<String,Integer> mp = new HashMap<String,Integer>();
		
		for(String i : arr) {
			mp.put(i,mp.getOrDefault(i,0)+1);
		}
		
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        pq.addAll(mp.keySet());
        
        String[] s = new String[n];
        int i = 0;
        
        while(n>0) {
        	s[i++]=pq.poll();
        	n--;
        }
        
        for(String i1: s)
        	System.out.println(i1);
	}
}
