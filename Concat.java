import java.util.Scanner;
public class Concat
{

	public static void main(String[] args) 
	{
		
		/*String s1="Mark";
		String s2="Kate";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		StringBuffer sc=new StringBuffer();
		sc.append(s1);
		if(s1.charAt(s1.length()-1)==s2.charAt(0));
		{
			sc.append(s2.substring(1,s2.length()));
			
		}
		else
		{
			sc.append(s2);
		}
		System.out.println(sc);
		sc.append(s1);*/
		
		String str1 = "Mark";
		String str2 = "Kate";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		
		System.out.println(sb);		
		
		sb.append(str1);
		
		
		

	}

}
