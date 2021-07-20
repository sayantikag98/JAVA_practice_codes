import java.util.EmptyStackException;

public class New1 <E>{
    
    Node<E> head;
    Node<E> tail;
    int length;

    static class Node <E>{ // <E> is a generic function
        E data;
        Node<E> next;  // this will be a node
    
        public Node(E data){
            this.data=data;
            next=null;
    
        }
    }
    public void push (E val){
        Node<E> n=new Node<>(val);
        if (head==null){
            head=n;
            tail=head;
            length+=1;
        }
        else{
            Node<E> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            if(temp==tail){
                temp.next=n;
                tail=n;
                length+=1;
                
            }
        }
    }
    public E pop() throws Exception{
        if(head==null){
            System.out.println("Stack is empty. Nothing to pop.");
            throw new EmptyStackException();
        }
        else if(head.next==null){
            E val=head.data;
            head=null;
            length=0;
            return val;
        }
        else{
            Node<E> temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            E val=tail.data;
            tail=temp;
            tail.next=null;
            length-=1;
            return val;

            
        }
    }
    
    
    

    public E peek()throws Exception{
        if(head==null){
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }
        E val=tail.data;
        return val;
        
    }
    public void print(){
        if(head==null){
            System.out.println("Nothing is there in the linked list");
        }
        else{
            Node<E> temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println(tail.data+"-->"+"Null");
        }
        System.out.println("The length is "+length);

    }
    
}
