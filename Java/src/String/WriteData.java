package String;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//South paw in the northern durby--input

public class WriteData {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("D:\\Maroon.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data");
		String src=s.nextLine();
		for(int i=0;i<src.length();i++)
		{
			fout.write(src.charAt(i));
		}
	}
}
