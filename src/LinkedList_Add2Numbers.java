	import java.util.Scanner;
public class LinkedList_Add2Numbers {


	public static void main(String[] args)
	{
	    int i=1;
	    System.out.println("Enter the number of digits for 1st num: ");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    LNode RootNodeNum1 = null;
	    LNode prev = null;
	    while(i<=n)
	    {
	        System.out.print("Enter the value " + i + ":");
	        int k=in.nextInt();
	        if(k>10)
	        {
	        	System.out.println("Error");
	        	System.exit(0);
	        }
	        if(i==1)
	        {
	        RootNodeNum1=new LNode(k);
	        prev=RootNodeNum1;
	        }
	        else
	        {
	         LNode node=new LNode(k);
	         prev.next=node;
	         prev=node;	
	        }
	        i=i+1;
	    }
	   traverseNode(RootNodeNum1);
	   System.out.println();
	   System.out.println("************************************");
	//  traverseNode(RootNodeNum1);
	    i=1;
	    System.out.println("Enter the number of digits for 2nd num: ");
	    n=in.nextInt();
	    LNode RootNodeNum2 = null;
	    prev = null;
	    while(i<=n)
	    {
	        System.out.print("Enter the value " + i + ":");
	        int k=in.nextInt();
	        if(k>10)
	        {
	        	System.out.println("Error");
	        	System.exit(0);
	        }
	        if(i==1)
	        {
	        RootNodeNum2=new LNode(k);
	        prev=RootNodeNum2;
	        }
	        else
	        {
	         LNode node=new LNode(k);
	         prev.next=node;
	         prev=node;	
	        }
	        i=i+1;
	    }
	   traverseNode(RootNodeNum2);
	   System.out.println();
	   System.out.println("************************************");
	   LNode rNode=addNumber(RootNodeNum1,RootNodeNum2,0);
	   traverseNode(rNode);
	}
	public static void traverseNode(LNode rootNode)
	{
		LNode temp=rootNode;
		
		do
		{
			System.out.print(temp.value + ",");
			temp=temp.next;
		}while(temp!=null);
	}
    
	public static LNode addNumber(LNode node1,LNode node2,int carry)
	{
		if(node1==null && node2==null && carry==0)
		{
			return null;
		}
		int value=carry;
		if(node1!=null)
		{
			value+=node1.value;
		}
		if(node2!=null)
		{
			value+=node2.value;
		}
		LNode Result=new LNode(value%10);
		LNode more=addNumber(node1==null?null:node1.next,node2==null?null:node2.next,value>9?1:0);
		Result.next=more;
		return Result;
		
	}


}
