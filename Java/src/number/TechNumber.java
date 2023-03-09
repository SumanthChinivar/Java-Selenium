package number;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to ceck if it is a tech number");
	String num=s.next();
	int size=num.length()/2;
	int a=Integer.parseInt(num.substring(0,size));
	int b=Integer.parseInt(num.substring(size,num.length()));
	
	int sum=a+b;
	int square=sum*sum;
	if(square==Integer.parseInt(num))
	{
		System.out.println("Tech number");
	}
	else 
	{
		System.out.println("Not a tech number");
	}
	}
}
