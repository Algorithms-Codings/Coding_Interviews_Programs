
public class SpecialMultiplication {
public static void main(String[] args)
{
	int[] numbers={1,2,3,0,4};
	//System.out.println("hello");
	//int[] results=new int[numbers.length];
	int value=1;
	for(int i=0;i<numbers.length;i++)
		
	{
		if(numbers[i]!=0)
		{
				value=value*numbers[i];
		}
	}
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]!=0)
		{
			System.out.println(value/numbers[i]);
		}
		else
		{
			System.out.println(value);
		}
	}
}
}
