package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex4 {
	
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        boolean check = true;
        for (int i = 0; i < j; i++) {
            if (temp[i] == a[n - 1]) {
                check = false;
                break;
            }
        }

        if (check == true) {
            temp[j++] = a[n - 1];
        }

        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
       
        return j;
    }
	
    public static void main(String[] args)
    {
        int a[] = { 12, 1898, 762, 12, 762, 46, 29 };
        int n = a.length;
        Arrays.sort(a);
        
        // Reverse the sorted array manually
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

}
