public class BinaryTreeInsert{    // binary tree class creation
    Node1 root;     // object of class Node1 created
    BinaryTreeInsert(){     //constructor
        this.root=null;
    }

    public Node1 insert(int val){       //insert method
        Node1 n=new Node1(val);         // node class object created with value val 
        Node1 currentNode=root;       
        if(root==null){
            // System.out.println("Tree is empty");     // checking if root node is empty or not
            root=n;     // then assign the passed node as the root node
        }
        else if(currentNode.data<n.data){      // else check if the node's value is greater or not
            if(currentNode.right==null){
                currentNode.right=n;
            }
            else{
                currentNode=currentNode.right;
                currentNode.insert(val);

            }   // then recursively call the insert method and assign it to the right node
        }
        else if (currentNode.data>n.data){      // else check if the node's value is lesser or not
            if(currentNode.left==null) currentNode.left=n;
            else currentNode.left.insert(val);    // then recursively call the insert method and assign it to the left node
        }
        Inorder(root);
        System.out.println("\n");
        System.out.println("\n");
        return root;
        
    }
    public void Inorder(Node1 root){
        if(root==null){
            // System.out.println("Tree is empty");
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);

    }
}  
class Node1 extends BinaryTreeInsert{
    int data;      // node class created
    Node1 left;
    Node1 right;

    Node1(int data){    //constructor
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
