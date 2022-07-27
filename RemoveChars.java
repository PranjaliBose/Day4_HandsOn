import java.util.Scanner;
public class RemoveChars
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=sc.next();
		String result="";
		for (int i = 0; i <s.length(); i++) 
		{
		    if (i == 0 && s.charAt(i) != '*')
		      result += s.charAt(i);
		    if (i > 0 && s.charAt(i) != '*' && s.charAt(i-1) != '*')
		      result += s.charAt(i);
		    if (i > 0 && s.charAt(i) == '*' && s.charAt(i-1) != '*')
		      result = result.substring(0,result.length()-1);
		 }
		 System.out.println(result);

	}

}
