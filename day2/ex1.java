package day2;

public class ex1 {
	
	static int getSecondSmallest(int arr[]) {
		int x = 0;
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		int arr[]= {3,1,8,9,2};
		if(arr.length <=1)
			System.out.println("array length less than 2");
		else
			System.out.println(ex1.getSecondSmallest(arr));
	}
}
