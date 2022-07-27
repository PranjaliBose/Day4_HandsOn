import java.util.Scanner;
public class StringHalf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=sc.next();
		if(s.length()%2==0)
		{
			System.out.println("First half of the string : ");
			System.out.println(s.substring(0,s.length()/2));
		}
		else
		{
			System.out.println("Null");
		}
		
	}

}
