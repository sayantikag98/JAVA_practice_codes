
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        List<Character> l=new ArrayList<>();
        char [] ch=A.toCharArray();
        char [] ch_rev=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            ch_rev[i]=(ch[ch.length-1-i]);


        }
        String is_Pallindrome="Yes";
        for (int i=0;i<ch.length;i++){
            if(ch[i]!=ch_rev[i]){
                is_Pallindrome="No";
                break;

            }
        }
        System.out.println(is_Pallindrome);
        
    }
}






