import java.util.Scanner;

public class RotatedString {

	public static void main(String[] args)
	{
		System.out.println("Enter the String1: ");
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		System.out.println("Enter the String2: ");
		String str2=in.nextLine();
		boolean flag=isRotate(str1,str2);
		System.out.println(flag);
		
	}
	public static boolean isRotate(String str1,String str2)
	{
		String mergedString;
		mergedString=str2.concat(str2);
		if(str1.length()==0 || str2.length()==0) return false;
		if(str1.length()!=str2.length()) return false;
		
		if(mergedString.contains(str1))
		{
			return true;
		}
		else
		{
			return false;
		}
	  
	}
}
