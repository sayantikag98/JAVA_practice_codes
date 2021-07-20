public class Binary1 {
    public static void main(String[] args) {
        BinaryTreeInsert bti = new BinaryTreeInsert();
        // Node1 n0=null;
        // Node1 n1=new Node1(9);
        // Node1 n2=new Node1(4);
        // Node1 n3=new Node1(20);
        // Node1 n4=new Node1(1);
        // Node1 n5=new Node1(6);
        // Node1 n6=new Node1(15);
        // Node1 n7=new Node1(170);


        Node1 m=new Node1(9);
        bti.insert(m.data);
        bti.insert(4);
        bti.insert(20);
        bti.insert(1);
        bti.insert(6);
        bti.insert(15);
        bti.insert(170);
        
        // bti.Inorder(bti.insert(9));
        // bti.Inorder(bti.insert(4));
        // bti.Inorder(bti.insert(20));
        // bti.Inorder(bti.insert(1));
        // bti.Inorder(bti.insert(6));
        // bti.Inorder(bti.insert(15));
        // bti.Inorder(bti.insert(170));
        
    }
}
