import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Write anything: ");
		String s= sc.nextLine();
		
		String reversed="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			reversed += s.charAt(i);
		}
		System.out.println("your anything in reverse order: "+reversed);
		
	}
}