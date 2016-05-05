import java.util.Scanner;

public class LinkedListProblems {
public static void main(String[] args)
{
    int i=1;
    System.out.println("Enter the number of element: ");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    LNode RootNode = null;
    LNode prev = null;
    while(i<=n)
    {
        System.out.print("Enter the value " + i + ":");
        int k=in.nextInt();
        if(i==1)
        {
        RootNode=new LNode(k);
        prev=RootNode;
        }
        else
        {
         LNode node=new LNode(k);
         prev.next=node;
         prev=node;	
        }
        i=i+1;
    }
   traverseNode(RootNode);
   System.out.println();
   System.out.println("************************************");
  // removeDuplicateNode(RootNode);
   //traverseNode(RootNode);
   LNode res=findNthElementFromLast(RootNode,5);
   System.out.println(res.value);
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


public static void removeDuplicateNode(LNode head)
{
	if(head==null) return;
	LNode previous=head;
	LNode current=previous.next;
	while(current!=null)
	{
		LNode runner=head;
		while(runner!=current)
		{
			if(runner.value==current.value)
			{
				//remove current
				LNode tmp=current.next;
				previous.next=tmp;
				current=tmp;
				
				break;
			}
			runner=runner.next;
		}
		
		if(runner==current)
		{
		previous=current;
		current=current.next;
		}
	}
}
public static LNode findNthElementFromLast(LNode head, int n)
{
	LNode p1=head;
	LNode p2=head;
	int count=1;
	while(p2.next!=null)
	{
		if(count==(n-1))
		{
			if(p2.next==null)
			{
				return p2;
			}		
		}
		else if(count>(n-1))
		{
			p1=p1.next;
		}
		
		count=count+1;
		p2=p2.next;
		
	}
	return p1;
	
}
}


class LNode
{
	int value;
	LNode next;
	public LNode(int value)
	{
		this.value=value;
		this.next=null;
	}
}
