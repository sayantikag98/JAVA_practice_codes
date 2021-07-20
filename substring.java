import java.util.*;
public class substring {
    public static void main(String[] args) {
        String s="Sayantika";
        Set <String> l= new TreeSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                l.add(s.substring(i,j));
            }
        }
        for(String s1:l) {
            System.out.println(s1);
        }

    }
    
}