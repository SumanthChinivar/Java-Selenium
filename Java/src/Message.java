import java.util.Scanner;
class Message extends Phone
{
	String msg;
	int i;
	Scanner s=new Scanner(System.in);
	Message()
	{
		if(getLock()==1)
		{
			unlockPhone();
		}
		if(getLock()==0)
		{
		System.out.println("++++++++++++++=============++++++++++++++");
		System.out.println("Messages has been opened");
		System.out.println(" Do you want to create a message");
		System.out.println("Enter 1 to create a message and 0 to abort");
		i=s.nextInt();
		if(i==1)
		{
		System.out.println("Enter the message to be sent");
		msg=s.next();
		System.out.println("Message has been sent");
		System.out.println("++++++++++++++=============++++++++++++++");
		if(getPassword()==0)
			{
			setLock(0);
			}
		else
		setLock(1);
		}
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