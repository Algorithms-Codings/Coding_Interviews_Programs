import java.util.HashMap;
import java.util.Scanner;

public class CountAlphabets {

	public static void main(String[] args)
	{
		System.out.println("Enter the String: ");
		Scanner in=new Scanner(System.in);
		String svalue=in.nextLine();
		HashMap<Character,Integer> hashtable=new HashMap<Character,Integer>();
		Character c;
		for(int i=0;i<svalue.length();i++)
		{
			c=svalue.charAt(i);
			if(Character.isAlphabetic(c) || Character.isDigit(c))
			{
			if(hashtable.containsKey(Character.toLowerCase(c)))
			{
				hashtable.put(Character.toLowerCase(c), hashtable.get(c)+1);
				
			}
			else
			{
				hashtable.put(Character.toLowerCase(c), 1);
			}
			}
		}
		for(Character key:hashtable.keySet())
		{
			System.out.println(key + "=" + hashtable.get(key));
		}
	}
}
