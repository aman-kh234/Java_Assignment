package day2;

import java.util.Arrays;

public class ex2 {
	static void sortStrings(String[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		if(n%2==1) {
		for(int i = 0; i<n; i++) {
			if(i<=(n/2))
				arr[i] = arr[i].toUpperCase();
			else
				arr[i] = arr[i].toLowerCase();
			
			System.out.println(arr[i]);
		}
		
		}
		else {
			for(int i = 0; i<n; i++) {
				if(i<(n/2))
					arr[i] = arr[i].toUpperCase();
				else
					arr[i] = arr[i].toLowerCase();
				
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"aman","keshav","hello","akbar"};
		
		ex2.sortStrings(arr);
	}

}
