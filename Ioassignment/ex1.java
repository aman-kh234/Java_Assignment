package Ioassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class ex1 {
	public static void main(String[] args) {
	try {
//		File f = new File("excercise.txt");
//		if(f.createNewFile()) {
//			System.out.println("File created");
//		}
//		else {
//			System.out.println("File already exist");
//		}
		
//		FileWriter fw = new FileWriter("exercise.txt",true);
//		fw.write("Hello");
//		fw.close();
//		fw.flush();
		
		FileReader fr = new FileReader("exercise.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		int cnt = 0;
		while((str=br.readLine())!=null) {
			cnt++;
			System.out.print(cnt);
			System.out.println(str);
		}
//		while((data=fr.read())!=-1)
//			System.out.print((char)data);
//		
//		fr.close();
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
