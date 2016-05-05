import java.util.Arrays;

public class Marathan {
 

	public static void main(String[] args)
	{
		int input1=7;
		int[] input2={12,11,5,2,7,5,11};
		int[] input3={12,11,2,5,5,7,11};
		System.out.println(collegecomparison(input1,input2,input3));
	}
	    public static String collegecomparison(int input1,int[] input2,int[] input3)
	    {
	    	if(input2.length!=input3.length)
	    		return "Invalid";
	    	if(input2.length!= input1 && input3.length!=input1)
	    		return "Invalid";
	    	Arrays.sort(input2);
	    	Arrays.sort(input3);
	    	if(Arrays.equals(input2,input3))
	    		return "Valid";
	    	else
	    		return "Invalid";
	    	
	    }
	
}
