import java.util.*;
public class New {
    public static void main(String [] args){
        try{
        List<String> al=new ArrayList<>();
        al.add("My");
        al.add("name");
        al.add("is");
        al.add("Sayantika");
        al.add("Ghosh");
        New1<String> ne1=new New1<>();
        //New1.Node n=ne1.new Node(90);  // if non-static nested class then need to make an object of the outer class first

        for (int i=0;i<al.size();i++){
            ne1.push(al.get(i));
        }
        ne1.print();
    
        String popped=ne1.pop();
        String popped1=ne1.pop();

        System.out.println("The element popped is "+popped1);
        ne1.print();
        String peeked=ne1.peek();
        System.out.println("The element at the top is "+peeked);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    String s="Sayantika";
    System.out.println(s.substring(0,5));

    }
    
}