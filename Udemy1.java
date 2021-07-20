import java.util.*;
public class Udemy1 {
    public static void main(String[] args) {
        // String s="    My     name is Sayantika Ghosh     ";
        // String reverseString=reverse(s);
        // System.out.println(reverseString);
        int [] a={5,10,90};
        int [] b={4,7,9,10};
        List <Integer> l1=new ArrayList<>(); 
        l1=mergeSorted(a,b);
        System.out.println(l1);
        Map <Integer,Integer> se=new HashMap<>();
        se.put(4,6);
        se.putIfAbsent(4,7);
        se.put(6,9);
        se.put(7,8);
        System.out.println(se.get(4));
        System.out.println(se.get(1));
        System.out.println(se.containsKey(4));
        System.out.println(se.containsValue(10));
        se.replace(4,10);
        System.out.println(se.containsValue(10));
        System.out.println(se.keySet());
        System.out.println(se.values());
        System.out.println(se.entrySet());
        int [] new1={1,2,3,4,5};
        int [] new2=Arrays.copyOfRange(new1,1,4);
        for( int i:new2){
            System.out.println(i);
        }

        
    }
    public static String reverse (String s){
        if (s.length()<2 && s instanceof String==false){
            return s;

        }
        
        char [] ch=s.toCharArray();
        // String [] sa=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(ch[i]);
        }
        // for(int i=sa.length-1;i>=0;i--){
        //     sb.append(sa[i]);
        // }
        return sb.toString();
    

    }
    public static List<Integer> mergeSorted(int [] a,int [] b){
        List<Integer> l=new ArrayList<>();
        Stack<Integer> q=new Stack<>();
        Stack<Integer> q1=new Stack<>();
        if(a.length==0 && b.length==0){
            return l;
        }
        for(int i=a.length-1;i>=0;i--){
            q.push(a[i]);
        }
        for(int i=b.length-1;i>=0;i--){
            q1.push(b[i]);
        }
        while (q.isEmpty()==false && q1.isEmpty()==false){
            if(q.peek()<q1.peek()){
                l.add(q.pop());
            }
            else{
                l.add(q1.pop());

            }
    } 
        while (q.isEmpty()==true && q1.isEmpty()==false){
            l.add(q1.pop());
        }
        while (q.isEmpty()==false && q1.isEmpty()==true){
            l.add(q.pop());
        }
        return l;
    }
    
}