import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args)
	{
		System.out.println("Enter the Strings: ");
		Scanner in =new Scanner(System.in);
		String sValue=in.nextLine();
		Character c;
		HashMap<Character,Integer> hashtable=new HashMap<Character,Integer>();
		for(int i=0;i<sValue.length();i++)
		{
			c=sValue.charAt(i);
			if(hashtable.containsKey(c))
			{
				hashtable.put(c, hashtable.get(c)+1);
			}
			else
			{
				hashtable.put(c, 1);
			}
			
		}
		Character NonRepChar=null;
		for(int i=0;i<sValue.length();i++)
		{
			c=sValue.charAt(i);
			if(hashtable.get(c)==1)
			{
				NonRepChar=c;
				break;
			}
		}
		System.out.println("First Non Repeated character: " + NonRepChar);
	}
}
