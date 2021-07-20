
import java.util.*;
public class palin {
    public static void main(String[] args) {
        
        String s="      CA    t";
        isPalin(s);
        List <Integer> l=new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(2);
        l.add(1);
        Collections.sort(l);
        System.out.println(l);
        

    }
    public static void isPalin(String s){
        s=s.trim().replaceAll("\\s","").toLowerCase();
        int n=s.length();
        if(n==0){
            System.out.println("The input string is empty");
        }
        else if(n==1){
            System.out.println("Pallindrome");
        }
        else{
            if(s.charAt(0)!=s.charAt(n-1)){
                System.out.println("Not Pallindrome");
                
            }
            else{
                isPalin(s.substring(1,n-1));
            }
        }
    }
    
}