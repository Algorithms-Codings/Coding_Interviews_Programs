import java.io.InputStream;
import java.util.Scanner;

public class TreeTraversal extends TreeNode 
{
	static TreeNode rootnode;
	public static void main(String[] args)
	{
		TreeTraversal Tree=new TreeTraversal();
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the rootnode: ");
		  String s=sc.nextLine();
		  TreeNode pnode=Tree.addRootNode(s);
		  rootnode=pnode;
//	      AddTreeNodes(Tree,rootnode);
		 TreeNode bnode=Tree.addLeftNode(pnode, "B");
		  TreeNode gnode=Tree.addRightNode(pnode, "G");
		  TreeNode anode=Tree.addLeftNode(bnode, "A");
		  TreeNode dnode=Tree.addRightNode(bnode, "D");
		  TreeNode cnode=Tree.addLeftNode(dnode, "C");
		  TreeNode enode=Tree.addRightNode(dnode, "E");
		  TreeNode inode=Tree.addRightNode(gnode, "I");
		  TreeNode hnode=Tree.addLeftNode(inode, "H");
		  System.out.println("******* In Order Travasal");
		  Tree.inOrderTravasal(rootnode);
		  System.out.println("******* Post Order Travasal");
		  Tree.postOrderTravasal(rootnode);
		  System.out.println("******* Pre Order Travasal");
		  Tree.preOrderTravasal(rootnode);
	}
	
	public static void AddTreeNodes(TreeNode  Tree,TreeNode pnode)
	{
	   Scanner sc=new Scanner(System.in);
	   String s;

	 
		  System.out.print("Enter the LeftNode for  " + pnode.value + ":");
		  s=sc.nextLine();
		  TreeNode lnode = null;
		  TreeNode rnode=null;
		  if(!s.equals("x")) { 
			  lnode=Tree.addLeftNode(pnode, s);
			  
		  }
		  else
		  {
			  lnode=pnode.ParentNode.RightNode;
		  }
		  
		  
		  AddTreeNodes(Tree,lnode);

		  System.out.print("Enter the RightNode for " + pnode.value + ":");
		  s=sc.nextLine();
		  if(!s.equals("x")) { 
			   rnode=Tree.addRightNode(pnode, s);
			  
		   }
		  else
		  {
			  rnode=pnode.ParentNode.ParentNode.ParentNode;
		  }
		  AddTreeNodes(Tree,rnode);
		  
	  
	}

}

class TreeNode
{
	TreeNode ParentNode;
	TreeNode LeftNode;
	TreeNode RightNode;
	String value;
	public TreeNode(TreeNode pnode,TreeNode lnode,TreeNode rnode,String value)
	{
		this.ParentNode=pnode;
		this.LeftNode=lnode;
		this.RightNode=rnode;
		this.value=value;
	}
	
	public TreeNode()
	{
		
	}
	public TreeNode(String value)
	{
		this.ParentNode=null;
		this.LeftNode=null;
		this.RightNode=null;
		this.value=value;
	}
	
	public TreeNode addLeftNode(TreeNode pnode,String nodevalue)
	{
		TreeNode node;
	
			node=new TreeNode(nodevalue);
			pnode.LeftNode=node;
			node.ParentNode=pnode;			
			//node.RightNode=null;
			return node;
	}
	public TreeNode addRightNode(TreeNode pnode,String nodevalue)
	{
			TreeNode node;
			
			node=new TreeNode(nodevalue);
			node.ParentNode=pnode;
			pnode.RightNode=node;
			//pnode.LeftNode=null;
			return node;
	}
	public TreeNode addRootNode(String nodevalue)
		
	{
	     TreeNode node=new TreeNode(nodevalue);			
	    return node;
	}
	
	public void preOrderTravasal(TreeNode node)
	{
		if(node==null)
			return;
		System.out.print(node.value + ",");
		preOrderTravasal(node.LeftNode);
		preOrderTravasal(node.RightNode);
		
	}
	
	public void inOrderTravasal(TreeNode node)
	{
		if(node==null)
			{return;}
		inOrderTravasal(node.LeftNode);
		System.out.print(node.value + ",");
		inOrderTravasal(node.RightNode);
	}
	public void postOrderTravasal(TreeNode node)
	{
		if(node==null)
			return;
		postOrderTravasal(node.LeftNode);
		postOrderTravasal(node.RightNode);
		System.out.print(node.value + ",");
	}
}
