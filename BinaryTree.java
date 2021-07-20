import java.util.*;
public class BinaryTree {
    public static void main(String[] args) {
        System.out.println("Enter the value of the root node");
        createTree(); // calling the function for creating nodes
       


        }
    public static Node createTree(){
        Scanner sc=new Scanner(System.in);
        
        int val=sc.nextInt();
        if(val==-1){        // if there is no value enter -1 and then it will return null
            System.out.println("entered null");
            return null;
        }
        Node root=new Node(val);      // assigns the value for the root node
        System.out.println("Enter the value for the left node of "+ val);
        root.left=createTree();      // recursive call for the left subtree 
        System.out.println("Enter the value for the right node of "+ val);
        root.right=createTree();     // recursive call for the right subtree
        return root;       // returns the root node
        }    
    }

class Node{      //Node class
    int data;
    Node left;      // two attributes - left and right
    Node right;


    public Node(int data){    // constructor for initializing the values of the node
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
