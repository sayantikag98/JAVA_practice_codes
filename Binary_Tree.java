
import java.util.*;
public class Binary_Tree {
    
    
    public Node_Tree create(){
        Node_Tree root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data");
        int val=sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node_Tree(val);
        System.out.println("Left");
        root.left=create();
        System.out.println("Right");
        root.right=create();
        return root;
    }

       
      



    public void InOrder(Node_Tree root){
        
        if(root==null){
            return;
        }
        else{
            InOrder(root.left);
            System.out.print(root.data+"  ");
            InOrder(root.right);

        }
    }
    
    
    public void PreOrder(Node_Tree root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.data+"  ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }


    public void PostOrder(Node_Tree root){
        if (root==null){
            return;
        }
        else{
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+"  ");
        }
    }
}
