import java.util.*;

class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("input: ");
		String s= sc.next();
		
		Boolean isPalindrome=true;
		
		for(int i=0; i<s.length()/2; i++)
		{
			if(s.charAt(i)!= s.charAt(s.length()-1-i))
			{
				isPalindrome= false;
				break;
			}
		}
		System.out.println(isPalindrome);
	}
}