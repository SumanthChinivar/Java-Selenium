//s su sum u um m
public class FileOutput {
public static void main(String[] args) {
	System.out.println("Enter the path");
	String s="sum";
	String op="";
	for(int i=0;i<s.length()*2;i++)
	{
		if(i<s.length()) {
			op=op+s.charAt(i);
			System.out.print(op+ " ");
		}
		else if(i==s.length())
		{
			System.out.print(s.charAt(s.length()/2)+" ");
		}
		else if(i>s.length())
		{
			System.out.print(s.substring(i-s.length(),s.length())+ " ");
		}
		
	}
}
}
