
public class MyStack
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public MyStack(int s)
	{
		this.maxSize=s;
		top=-1;
		stackArray=new long[s];
	}
	
	public void push(long i)
	{
		
		stackArray[++top]=i;
	}
	public long pop()
	{
		return stackArray[top--];
	}
	
	public long peek()
	{
		return stackArray[top];
	}
	
	public boolean isempty()
	{
		return(top==-1);
	}
	public boolean isFull()
	{
		return(top==(maxSize-1));
	}
	public static void main(String[] args)
	{
		MyStack stack=new MyStack(5);
		for(int i=0,j=10;i<5;i++,j=j*2)
		{
			System.out.println(j);
			stack.push(j);
		}
		while(!stack.isempty())
		{
			long value=stack.pop();
			System.out.print(value + ",");
		}
	}
}