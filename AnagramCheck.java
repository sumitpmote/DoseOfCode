public class AnagramCheck
{
	public static void main(String args[])
	{
		String s= "silent";
		String p= "Listen";
		
		s=s.toLowerCase();
		p=p.toLowerCase();
		
		System.out.println(isAnagram(s,p));
	}
	public static boolean isAnagram(String s, String p)
	{
		if(s.length()!= p.length())
			return false;
		
		else
		{
			int count[]= new int[26];
			for(int i=0; i<s.length(); i++)
			{
				count[s.charAt(i)- 'a']++;
			}
			for(int i=0; i<p.length(); i++)
			{
				count[p.charAt(i)-'a']--;
			}
			for(int i=0; i<count.length;i++)
			{
				if(count[i]!=0)
					return false;
			}
			return true;
		}
	}
}