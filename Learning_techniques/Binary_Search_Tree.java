// Binary Search Tree

import java.util.Scanner;
public class Binary_Search_Tree
{
    static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(root.data<data)
        {
            root.right=insert(root.right, data);
        }
        else
            root.left=insert(root.left, data);
        return root;
    }
    // Inorder Traversal (L -> N -> R)
    static void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // Pre Order Traversa; (N -> L -> R)
    static void preOrder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    // Post Order Traversal (L -> R -> N)
    static void postOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }
    // Searching
    static boolean search(Node root,int target)
    {
        if(root==null) return false;
        if(root.data==target) return true;
        if(root.data<target) return search(root.right, target);
        else return search(root.left, target);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit of the Array: ");    
        int n=sc.nextInt();

        Node root=null;

        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
        {
            int value=sc.nextInt();
            root=insert(root, value);
        }

        inOrder(root);
        System.out.println();

        preOrder(root);
        System.out.println();

        int se=0;
        while(true)
        {
            System.out.print("Enter a element to search: ");
            se=sc.nextInt();
            if(se==-1)
            {
                System.out.println("Recieved Exit code.");
                break;
            }
            System.out.println(search(root, se));
        }
        sc.close();
    }    
}

class Node
{
    int data;
    Node left,right;
    Node(int val)
    {
        data=val;
        left=right=null;
    }
}
