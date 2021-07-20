import java.util.*;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(4);
        q1.add(7);
        q1.add(90);
        q1.add(88);
        q1.add(78);
        System.out.println(q1);
        q1.remove();
        q1.remove();
        q1.element();
        System.out.println(q1.poll());
    }

    
}