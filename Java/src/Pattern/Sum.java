package Pattern;

public class Sum {
public static void main(String[] args) {
	String pat="India";
	int k=0;
	for(int i=0;i<(pat.length()*2);i++)
	{
		if(i<pat.length())
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(pat.charAt(j));
			}
		}
		else
		{
			for(int j=0;j<pat.length();j++)
			{
				if(k>=j) 
				{
					System.out.print(" ");
				}
				else
					System.out.print(pat.charAt(j));
			}
			k++;
		}
		
		System.out.println();
	}
}
}
