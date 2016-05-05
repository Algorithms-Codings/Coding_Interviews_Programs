import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHN09 {
public static void main(String[] args) throws NumberFormatException, IOException
{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       for(int i=0;i<T;i++)
       {
    	   String rcolors=br.readLine();
    	   int acount=0;
    	   int bcount=0;
           for(int j=0;j<rcolors.length();j++)
           {
        	   if(rcolors.charAt(j)=='a')
        		   acount=acount+1;
        	   else
        		   bcount=bcount+1;        	  
           }
           System.out.println(Math.min(acount, bcount));
       }

}
}
