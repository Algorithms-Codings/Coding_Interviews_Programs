package skyline;

import java.util.Scanner;

public class UnqChar {

	public static void main(String[] args)
	{
		System.out.println("Enter the String: " );
		Scanner in=new Scanner(System.in);
		String sValue=in.nextLine();
		if(isUnqChar(sValue))
		{
			System.out.println(sValue + " :  All charactes are unique");
		}
		else
		{
			System.out.println(sValue + " : All charactes are  not unique");
		}
		System.out.println(inUnqChar_Boolean(sValue));
	}
	public static boolean isUnqChar(String sValue)
	{
		boolean[] bChar=new boolean[256];
		for(int i=0;i<sValue.length();i++)
		{
			int k=sValue.charAt(i);
			if(bChar[k]==true) return false;
			bChar[k]=true;
		}
		return true;
	}
	
	public static boolean inUnqChar_Boolean(String sValue)
	{
		int checker =0;
		for(int i=0;i<sValue.length();i++)
		{
			int val=sValue.charAt(i)-'a';
			System.out.println(val);
			System.out.println(1<<val);
			if((checker & (1<<val)) >0) return false;
			checker |=(1<<val);
			System.out.println("checker: " + checker);
				
		}
		return true;
	}
}
