package String;
//sum
//s su sum um m
import java.util.Scanner;

public class PrintSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word");
		String ip=s.next();
		String op="";
		for(int i=0;i<ip.length()*2;i++)
		{
			if(i<ip.length()) {
				op=op+ip.charAt(i);
				System.out.print(op+ " ");
			}
			else if(i==ip.length())
				continue;
			else
		    	System.out.print(ip.substring((i-ip.length()),ip.length())+" ");
		}
	}
}
