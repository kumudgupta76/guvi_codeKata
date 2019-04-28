package set4;

import java.util.*;
//A Binary Tree node
class Node
{
 int data;
 Node left, right;
 Node(int item)
 {
     data = item;
     left = right = null;
 }
}
class Mirror_Tree
{
	 void inOrder(Node node) {
     if (node == null) {
         return;
     }

     inOrder(node.left);
     System.out.print(node.data + " ");

     inOrder(node.right);
 }
}
public class _6 {
	void mirror(Node node)
    {
	// Your code here
	if(node==null)
	    return ;
	else
	{
	    Node temp=node.left;
	    node.left=node.right;
	    node.right=temp;
    }
    //System.out.println(node.data);
    mirror(node.left);
    mirror(node.right);
    }
	public static void main(String args[])
	 {
	     Scanner sc = new Scanner(System.in);
			Mirror_Tree mt = new Mirror_Tree();
	     int t = sc.nextInt();
	     while (t > 0)
	     {
	         HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
	         int n = sc.nextInt();
	         Node root = null;
	         while (n > 0)
	         {
	             int n1 = sc.nextInt();
	             int n2 = sc.nextInt();
	             char lr = sc.next().charAt(0);
	             //  cout << n1 << " " << n2 << " " << (char)lr << endl;
	             Node parent = m.get(n1);
	             if (parent == null)
	             {
	                 parent = new Node(n1);
	                 m.put(n1, parent);
	                 if (root == null)
	                     root = parent;
	             }
	             Node child = new Node(n2);
	             if (lr == 'L')
	                 parent.left = child;
	             else
	                 parent.right = child;
	             m.put(n2, child);
	             n--;
	         }
	         _6 g = new _6();
	         g.mirror(root);
				mt.inOrder(root);
				System.out.println();
	         t--;
	     }
	 }
}
