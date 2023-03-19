import java.util.Scanner;
class Calci extends Phone
{
	double a;
	double b;
	Scanner s=new Scanner(System.in);
	Calci()
	{
		int choice;
		if(getLock()==1)
		{
			unlockPhone();
		}
		if(getLock()==0)
		{
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("The options are:");
		System.out.println("1.Add\t 2.Subtract\t 3.Multiplication\t 4.Division");
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("Enter your choice");
		choice=s.nextInt();
		System.out.println("Enter the first number");
		a=s.nextDouble();
		System.out.println("Enter the second number");
		b=s.nextDouble();
		switch(choice)
		{
			case 1: 
				System.out.println("The sum is:  " +(a+b));
			System.out.println("++++++++++++++=============++++++++++++++");
			break;
			case 2:
					System.out.println("The  difference is: "+(a-b));
			System.out.println("++++++++++++++=============++++++++++++++");
						break;		
			case 3:
					System.out.println("The product is: "+(a*b));
			System.out.println("++++++++++++++=============++++++++++++++");
			break;
			case 4:
					System.out.println("The  quotient is: "+(a/b));
			System.out.println("++++++++++++++=============++++++++++++++");
		break;	
			default: System.out.println("Enter correct choice");
			break;
		}
		if(getPassword()==0)
			{
			setLock(0);
			}
		else
		setLock(1);
		}
	}
	

		public void unlockPhone()
	{
		int p;
		System.out.println("Enter the password to unlock the phone");
		p=s.nextInt();
		if(getPassword()==p)
		{
			System.out.println("Phone is unlocked");
			setLock(0);
		}
		else
			System.out.println("Enter the correct password");
	}
}