package day1;

public class divisible {
	public int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if((i%3==0) || (i%5==0))
				sum+=i;
		}
		return sum;
	}
}
