package skyline;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Skyline {
 public static Collection<Building> retrieveInput(InputStream is)
 {
	 ArrayList<Building> buildings=new ArrayList<Building>();
	Scanner sc=new Scanner(is);
	 while(sc.hasNextLine())
	 {	
		 String s=sc.nextLine();
		 if(s.equals("")) {break;}
		 try
		 {
			 StringTokenizer st=new StringTokenizer(s);
			int left=Integer.valueOf(st.nextToken());
			int right=Integer.valueOf(st.nextToken());
			int height=Integer.valueOf(st.nextToken());
			Building b= new Building(left,right,height);
			//System.out.println(left + "," + right + "," + height);
			buildings.add(b);
		
			
		 }
		 catch (NumberFormatException e)
		 {
			 System.err.println("******** Ignoring " + s + ": all value must be integers.");
		 }
		 catch(Exception e)
		 {
			 System.err.println("Ignoring " + s + ":" + e.getMessage());
		 }
	 }
	return buildings;
 }
 
 public static void main(String[] args)
 {
	 Collection<Building> buildings=retrieveInput(System.in);
	 for(Building b:buildings)
			 {
		 		System.out.println("[" + b.left + "," + b.right + "]@" + b.height);
		 
			 }
 }
}
