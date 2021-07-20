public class Binary_Tree_Main {
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        Node_Tree root=bt.create();
        System.out.println("\nThe inorder traversal is\n");
        bt.InOrder(root);
        System.out.println("\nThe preorder traversal is\n");
        bt.PreOrder(root);
        System.out.println("\nThe postorder traversal is\n");
        bt.PostOrder(root);

    }
    
}
