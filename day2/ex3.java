package day2;

import java.util.Arrays;

public class ex3 {
	
	static String reverse(String x) {
		int n = x.length();
		String s = "";
		for(int i = n-1; i>=0; i--) {
			s+=x.charAt(i);
		}
		return s;
	}
	
	static void getSorted(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			String s1 = ex3.reverse(Integer.toString(arr[i]));
			arr[i]= Integer.parseInt(s1);
		}
		Arrays.sort(arr);
		
		//Print the elements
		for(int i: arr)
			System.out.print(i+"\t");
	}
	
	public static void main(String[] args) {
		int[] arr= {45,89,264,86,890};
		
		ex3.getSorted(arr);
	}

}
