import java.util.Arrays;

public class SortRandomIntegers {
public static void main(String[] args)
{
	int numIntegers=1000;
	int[] group=new int[numIntegers];
	for(int i=0;i<numIntegers;i++)
	{
		group[i]=(int)(Math.random()*numIntegers);
	}
	Arrays.sort(group);
	for(int i=0;i<numIntegers;i++)
	{
		System.out.println(group[i]);
	}
}
}
