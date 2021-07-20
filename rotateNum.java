import java.util.*;

public class rotateNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n = sc.nextInt();
        int count=5;
        for (int i=1; i<=(n+1)/2; i++){
            for(int j=n-1; j>i; j--){
                System.out.print("*\t");
            }
            
            for (int j=count; j<=n; j++){
                System.out.print("\t");
            }
            count-=2;
            
            for (int j=i+2; j<=n; j++){
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
            
        }
        
        count=3;
        for (int i=((n+1)/2)+1; i<=n; i++){
            for(int j=(n+1)/2; j<=i; j++){
                System.out.print("*\t");
            }
            
            for (int j=count; j>=1; j--){
                System.out.print("\t");
            }
            count-=2;
            
            for (int j=(n+1)/2; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
            
        }
        

    }
}