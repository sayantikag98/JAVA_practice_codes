import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(modify(s));
        System.out.println(modify1(s));

        System.out.println(compress1(s));

        System.out.println(compress2(s));
    }


    static String modify(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch>'a' && ch<'z'){
                ch=(char)(ch-'a'+'A');

            }
            else{
                ch=(char)(ch-'A'+'a');
            }
            sb.setCharAt(i,ch);
        }
        return(sb.toString());

    }



    static String modify1 (String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length()-1; i++){
            sb.append(s.charAt(i));
            int d=s.charAt(i+1)-s.charAt(i);
            sb.append(d);

        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    } 



    static String compress1 (String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }



    static String compress2 (String s){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0; i<s.length()-1; i++){
            
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
    
        }
        sb.append(s.charAt(s.length()-1));
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }
}
