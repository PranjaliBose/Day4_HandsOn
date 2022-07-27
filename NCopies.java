import java.util.Scanner;
public class NCopies {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String word="";
		System.out.println("Enter a string : ");
		String s=sc.nextLine();
		if(s.length()<=1)
		{
			word=s;
		}
		for(int i=0;i<s.length();i++)
		{
			word=word+s.charAt(0)+s.charAt(1);
		}
		System.out.println(word);

	}

}
