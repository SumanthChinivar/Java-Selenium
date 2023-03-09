package number;

public class PetersonNumber {
	public static void main(String[] args) {
		if(isPeterson(22))
		{
			System.out.println("Is a peterson number");
		}
		else
			System.out.println("Is not a peterson number");
	}
	
	public static boolean isPeterson(int num)
	{
		int a=num;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(a==sum)
		{
			return true;
		}
		return false;
	}
}
