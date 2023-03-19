import java.util.Scanner;
abstract class Phone
{
	Scanner s=new Scanner(System.in);
	private String ownername;
	private int lock=0;
	private static int password;
 
	Phone()
	{
	}
	Phone(String owner)
	{
		this.ownername=owner;
	}

	public void setOwner(String owner)
	{
		this.ownername=owner;
	}
	public String getOwner()
	{
		return ownername;
	}
	public void setPassword()
	{
			System.out.println("=====================================");
			System.out.println("Enter the new password");
			int pass1=s.nextInt();
			password=pass1;
			System.out.println("Your phone has been locked");
			System.out.println("Your password has been set successfully");
			System.out.println("=====================================");
	}
	public int getPassword()
	{
		return password;
	}

	public void setLock(int k)
	{
		if(k>0)
			lock=1;
		else
			lock=0;
	}

	public int getLock()
	{
		return lock;
	}
	
abstract void unlockPhone();
	
}