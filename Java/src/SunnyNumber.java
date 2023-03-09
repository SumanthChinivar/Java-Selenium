import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(squareroot(num+1))
		{
			System.out.println("Sunny number");
		}
		else
			System.out.println("Not a sunny number");
		
	}
	
	public static boolean squareroot(int num)
	{
		for(int i=1;i<(num/2);i++)
		{
			if(num==i*i)
			{
				return true;
			}
		}
		return false;
	}
}
