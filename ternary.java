import java.util.*;
public class ternary{
    public static void main(String[] args) {
        String s="aabbcc";

        Map <Character,Integer> map=new HashMap<Character,Integer>();
        char [] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            map.putIfAbsent(c[i], 1);
        }
        Set <Character> li=map.keySet();
        



        
    }
}
