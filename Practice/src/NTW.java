
public class NTW {

	public static void main(String[] args) 
	{
		convert("1221".toCharArray());
	}
	
	public static void convert(char[] num)
	{
		int len=num.length;
		String[] singledigits= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens_multiple= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String[] tens_power= {"hundred","thousand"};
		String[] twodigits= {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		System.out.print(String.valueOf(num)+":");
		if(num.length==0)
		{
			System.out.println("Empty string");
		}
		if(num.length>4)
		{
			System.out.println("Length is greater than 4");
		}
		if(num.length==1) 
		{
			System.out.print(singledigits[num[0]-'0']);
		}
		int x=0;
		while(x<num.length)
		{
			if(len>=3)
			{
				if(num[x]-'0'!=0)
				{
					System.out.print(singledigits[num[x]-'0']+" ");
					System.out.print(tens_power[len-3]+" ");
				}
				--len;
			}
			else
			{
				if(num[x]-'0'==1)
				{
					int sum=num[x]-'0' +num[x+1]-'0';
					System.out.print(twodigits[sum]+" ");
					return;
				}
				else if(num[x]-'0'==2 && num[x+1]-'0'==0)
				{
					System.out.print("twenty");
					return;
				}
				else
				{
					int i=(num[x]-'0');
					if(i>0)
					{
						System.out.print(tens_multiple[i]+" ");
					}
					else
					{
						System.out.print(" ");
					}
					++x;
					if(num[x]-'0'!=0)
					{
						System.out.print(singledigits[num[x]-'0']);
					}
				}
			}
			++x;
		}
	}
}
