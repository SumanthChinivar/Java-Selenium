package number;

public class AutomorphicNumber {
	public static void main(String[] args) {
		int num=4;
		int square=num*num;
		while(num>0)
		{
			if(num%10!=square%10)
			{
				System.out.println("Not an automorphic number");
				break;
			}
			num=num/10;
			square=square/10;
		}
		if(num==0)
		{
			System.out.println("Is an automorphic number");
		}
		
	}
}
