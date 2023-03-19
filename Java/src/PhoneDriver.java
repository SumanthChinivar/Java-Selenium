import java.util.Scanner;
class  PhoneDriver
{
	public static void main(String[] args) 
	{
     	int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the owner name ");
		String ownername=s.next();
		while(i==1)
		{
		System.out.println("Welcome "+ownername);
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println(" The options available are:");
		System.out.println(" 1.CreateContact\t 2.Message\t 3.Calci\t 4.SetPassword");
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("Enter your choice");
		 int choice=s.nextInt();
		 Phone p;
			switch(choice)
		{
				case 1:
				p=new CreateContact();
				break;
			case 2:
				p=new Message();
			break;
			case 3:
				p=new Calci();
			break;
			case 4:
				p=new SetPassword();
			break;
			
			default:System.out.println("Enter the correct choice");
			break;
		}
		}
	}
}
