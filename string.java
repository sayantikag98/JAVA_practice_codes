import java.util.*;
public class string {
    public static void main(String[] args) {
    //    String s="   My  ";
    //    boolean uni=unique(s);
    //    if (uni==true) System.out.println("this is unique");
    //    else System.out.println("this is not unique");
    //    String a="234";
    //    String b="423   ";
    //    int equal=permute(a,b);
    //    if (equal==1){
    //        System.out.println("One string is the permutation of the other");

    //    }else if (equal==2) System.out.println("No the strings are not the permutation of each other");
    //    else System.out.println("The strings are empty");
    //    String s1="Mr. John    Smith    ";
       String s1="    Mr.  John Smith   ";
       s1=urlify(s1);
       if(s1.isEmpty()==true){
           System.out.println("String is empty");
       }
       else System.out.println(s1);
      
    }
    public static boolean unique (String s){
        boolean isUnique=false;
        s=s.trim().replaceAll(" +"," ");
        if (s.isEmpty()==true){
            return isUnique;
        }
        else{
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(c[i]==c[j]){
                    return isUnique;
                }
            }
        }
        isUnique=true;
        return isUnique;
    }

    }

    public static int permute (String a, String b){
        int isequal=0;
        a=a.trim().replaceAll(" +"," ").toLowerCase();
        b=b.trim().replaceAll(" +"," ").toLowerCase();
        if (a.isEmpty() == true || b.isEmpty()== true){
            return isequal;
        }
        else{
            char [] a1=a.toCharArray();
            char [] b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            // StringBuilder sb=new StringBuilder();
            // StringBuilder sb1=new StringBuilder();
            // for (char c: a1){
            //     sb.append(c);
            // }
            // for (char c: b1){
            //     sb1.append(c);
            // }
            String s=new String(a1);
            String s1=new String(b1);
            if (s.equals(s1)){
                isequal=1;
                System.out.println("permute");
            }
            else isequal=2;

        }
        return isequal;
    }
    public static String urlify(String s){
        s=s.trim();
        if(s.isEmpty()==false){
            // s=s.replaceAll(" +","%20");
            char [] c=s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c1:c){
                if (c1==' '){
                    sb.append("%20");
                }else{
                    sb.append(c1);
                }
            }
            s=sb.toString();
        }
        return s;
    }

    
}