import java.util.Scanner;
class SetPassword extends Phone
{
	SetPassword()
	{
		if(getPassword()==0)
		{ 
			System.out.println("Enter old password");
			int pass=s.nextInt();
			if(getPassword()==pass)
			{
			setPassword();
			}
			else
				System.out.println("Password cannot be changed");
		}
		else
		{
		if(getLock()==1)
		{
			unlockPhone();
		}
		if(getLock()==0)
		{
			
		System.out.println("Enter the current password");
		int pass=s.nextInt();
		if(pass==getPassword())
		{
		setPassword();
		setLock(1);
		}
		else
			System.out.println("Enter the correct password");
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
