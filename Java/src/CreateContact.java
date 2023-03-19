import java.util.Scanner;
class CreateContact extends Phone
{
	long cnumber;
	String cname;
	Scanner s=new Scanner(System.in);
	CreateContact()
	{
		if(getLock()==1)
		{
			unlockPhone();
		}
		if(getLock()==0)
		{
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("Contacts is opened");
		System.out.println("Do you want to create a new contact");
		System.out.println("Enter 1 to create a contact and 0 to abort");
		int j=s.nextInt();
		if(j==1)
		{
		System.out.println("Enter the contact name");
		cname=s.next();
		System.out.println("Enter contact number");
		cnumber=s.nextLong();
		System.out.println(" Contact has been created successfully");
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("The contact name is: "+cname+"\n The contact number is:" +cnumber);
		System.out.println("+++++++++========+++++++========");
		if(getPassword()==0)
			{
			setLock(0);
			}
		else
		setLock(1);
		}
		else
		System.out.println("You can use other features of your phone");
	}
	}

	public void unlockPhone()
	{
		int pw;
		System.out.println("Enter the password to unlock the phone");
		pw=s.nextInt();
		if(getPassword()==pw)
		{
			System.out.println("Phone is unlocked");
			setLock(0);
		}
		else
			System.out.println("Enter the correct password");
	}
}
