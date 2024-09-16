package Ioassignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ex2 {
	private static String getFileExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex > 0 && lastIndex < fileName.length() - 1) {
            return fileName.substring(lastIndex + 1);
        }
        return ""; 
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		try {
		File f = new File(x);
		
		if(f.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exist");
		}
		
		if(f.canRead()) {
			System.out.println("File is readable");
		}
		else {
			System.out.println("File is not readable");
		}
		
		if(f.canWrite()) {
			System.out.println("File is writeable");
		}
		else {
			System.out.println("File is not writeable");
		}
		
		if (f.exists() && f.isFile()) {
            String fileName = f.getName();
            String fileType = getFileExtension(fileName);

            if (!fileType.isEmpty()) {
                System.out.println("The file type is: " + fileType);
            } else {
                System.out.println("The file has no extension.");
            }
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
