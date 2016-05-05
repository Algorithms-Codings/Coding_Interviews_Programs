
public class singleLinkedList
{
	public static void main(String args[])
	{
		Node rootnode=new Node();
		rootnode.data=0;
		rootnode.nextNode=null;
		int i=1;
		Node pNode=new Node();
		pNode=rootnode;
		do
		{
       
			Node temp=new Node(null,i);
		
			pNode.nextNode=temp;
			pNode=temp;
			i=i+1;


		}while(i<=5);
		
		rootnode.traverseNode(rootnode);
		rootnode.addNode(rootnode.nextNode.nextNode, 100);
		rootnode.traverseNode(rootnode);
	}
	
}		


class Node
{
	Node nextNode;
	int data;
	
	public Node(Node nextNode,int data)
	{
		this.nextNode=nextNode;
		this.data=data;
	}
	
	public Node()
	{
		
	}
	public  void traverseNode(Node rootNode)
	{
		Node temp=new Node();
		temp=rootNode;
		do
		{
			System.out.println(temp.data);
			temp=temp.nextNode;
		}while(temp!=null);
	}
	public Node addNode(Node nNode,int newNodeData)
	{
		Node temp=new Node();
		temp.nextNode=nNode.nextNode;
		temp.data=newNodeData;
		nNode.nextNode=temp;
		return temp;
	}
	public void deleteNode(Node nNode,Node dNode)
	{
		nNode.nextNode=dNode.nextNode;
		
	}

	
}