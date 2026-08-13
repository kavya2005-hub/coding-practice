import java.util.*;
public class countthenode
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(root.left==null)
        {
            root.left=new Node(data);
        }
        else if(root.right==null)
        {
            root.right=new Node(data);

        }
        else
        {
            insert(root.left,data);
        }
        return root;
    }
    static int count=0;
    static int count(Node root)
    {
        if(root==null)
        return 0 ;
    return 1+count(root.left)+count(root.right);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        System.out.println(count(root));
        
    }
}