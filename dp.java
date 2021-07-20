import java.util.*;
public class dp {
    public static void main(String[] args) {
        int n=6;
        int [] a=new int [n+1];
        Arrays.fill(a,-1);
        a[0]=0;
        a[1]=1;
        dynamic(a,n);
        
    }
    public static int dynamic(int [] a,int n){
       
        if(a[n]==-1){
            a[n]=dynamic(a,n-1)+dynamic(a,n-2);
            
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                return a[i];
            }
        }
        return a[n];


    }
}
