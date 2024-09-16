package collectionassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int n,k;
		System.out.println("Enter n :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		List<Integer> li = new ArrayList<Integer>();
		System.out.println("Enter n array values :");
		for(int i = 0; i<n; i++) {
			li.add(sc.nextInt());
		}
		System.out.println("Enter k :");
		k = sc.nextInt();
		
		Collections.sort(li);
		int ans = li.get(n-1)-li.get(0);
		for(int i = 0; i<n; i++) {
			if((li.get(i)-k)<0)
				continue;
			
			int t1 = Math.min(li.get(0)+k,li.get(i)-k);
			int t2 = Math.max(li.get(i-1)+k,li.get(n-1)-k);
			ans=Math.min(ans,t2-t1);
		}
		System.out.println(ans);
	}

}
