public class linkednew {
    Node11 head;
    Node11 tail;
    linkednew(){
        this.head=null;
        this.tail=null;
    }

    public void insert(int val){
        Node11 n = new Node11(val);
        
        if (head==null) {
            head=n;
            tail=head;
        }
        else if(head.next==null) {
            head.next=n;
            tail=n;
        }
        else{
            Node11 temp=head;
            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next=n;
            tail=n;
        }
    }
    public void print(){
        if (head==null){
            System.out.println("The list is empty");
        }
        else{
            Node11 temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+" --> ");
                temp=temp.next;
            }
            System.out.println(temp.data+" --> NULL");
        }
    }

    public void delete(int val){
        if(head==null){
            System.out.println("The list is empty. Items cannot be deleted");
        }
        else if(head.next==null && head.data==val){
            head=null;
            tail=null;
        }
        else{
            Node11 temp=head;
            while(temp.next.data!=val){
                temp=temp.next;

            }
            temp.next=temp.next.next;     

        }
    }
    
}
class Node11{
    int data;
    Node11 next=null;

    Node11(int data){
        this.data=data;
    }
}
