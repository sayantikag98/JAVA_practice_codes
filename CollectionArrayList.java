import java.util.*;
public class CollectionArrayList {
    public static void main(String[] args) {
        List<String> al= new ArrayList <>();  //List also works but need to import java.util.List
        al.add("Sayantika");
        al.add("Ghosh");
        al.add(1,"Kumari");
        System.out.println(al);
        Pair <Integer,Integer> pa=new Pair <> (21,01);
        pa.printList();
        List<Integer> al1 = new ArrayList <>(); // List is recommended
        al1.add(23);
        al1.add(78);
        al1.add(45);
        List<String> al2=new ArrayList <>();
        al2.add("My");
        al2.add("Name");
        al2.add("Licy");

        al.addAll(al2);
        al.set(1,"Wohla");
        System.out.println(al);
        System.out.println(al.size());

        String [] st= new String [al.size()];
        al.toArray(st);
        for(String name:st){
            System.out.println(name);
        }

        
        // Integer is the wrapper class
        // int is the primitive datatype

    }
    
}