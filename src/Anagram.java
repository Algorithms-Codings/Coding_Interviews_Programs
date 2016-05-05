import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args)
  {
	  System.out.println("Enter the string1:");
	  Scanner in=new Scanner(System.in);
	  char[] str1=in.nextLine().toCharArray();
	  System.out.println("Enter the string2:");
	  //String s=in.nextLine();
	  
	  char[] str2=in.nextLine().toCharArray();
	  System.out.println(String.valueOf(str1) + "=" + String.valueOf(str2));
	  boolean bAnagram=isAnagram(str1,str2);
	  System.out.println(bAnagram);
	  bAnagram=isAnagramUsingCount(str1,str2);
	  System.out.println(bAnagram);
	  System.out.println(String.valueOf(str1) + "=" + String.valueOf(str2));

  }
  public static boolean isAnagram(char[] str1,char[] str2)
  {
	  char[] tempstr1=str1.clone();
	  char[] tempstr2=str2.clone();	  
	  Arrays.sort(tempstr1);
	  Arrays.sort(tempstr2);
	  if(Arrays.equals(tempstr1,tempstr2))
	  {	  return true;}
	  else { return false;}
		  
  }
  public static boolean isAnagramUsingCount(char[] str1,char[] str2)
  {
	  char[] tempstr1=str1.clone();
	  char[] tempstr2=str2.clone();	
	  if(tempstr1.length!=tempstr2.length) return false;
	  HashMap<Character,Integer> scountstr1=new HashMap<Character,Integer>();
	  HashMap<Character,Integer> scountstr2=new HashMap<Character,Integer>();

	  for(int i=0;i<tempstr1.length;i++)
	  {
		  if(scountstr1.containsKey(tempstr1[i]))
		  {scountstr1.put(tempstr1[i],scountstr1.get(tempstr1[i])+1);}
		  else
		  {scountstr2.put(tempstr2[i],1);}
		  if(scountstr2.containsKey(tempstr2[i]))
		  {scountstr2.put(tempstr2[i],scountstr2.get(tempstr2[i])+1);}
		  else
		  {scountstr2.put(tempstr2[i],1);}
		  
	  }
	  if(scountstr2.equals(scountstr1))
	  {return true;}
	  else
	  {return false;}
  }

}
