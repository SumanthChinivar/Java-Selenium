import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
public static void main(String[] args) throws IOException {
	System.out.println("Enter the path");
	Scanner s=new Scanner(System.in);
	String path=s.next();
	FileInputStream fin=new FileInputStream(path);
	int data=fin.read();
	while(data!=-1) {
		System.out.print((char)data);
		data=fin.read();
	}
}
}
