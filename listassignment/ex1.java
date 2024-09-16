package listassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ex1 {
	public static void main(String[] args) {
		Student st1 = new Student(170,"Satyam");
		Student st2 = new Student(150,"Aman");
		Student st3 = new Student(350,"Raghav");
		
		ArrayList<Student> arr = new ArrayList<>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		Collections.sort(arr, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return (b.getMarks()-a.getMarks());
			}
		});
		
		for(int i = 0; i<=2; i++)
			System.out.println(Integer.toString(arr.get(i).getMarks())+"\t"+(String)arr.get(i).getName());
	}
}
