package String;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("D:\\Maroon.");
		int ch=fin.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fin.read();
		}
	}
}
