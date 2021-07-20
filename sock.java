import java.util.*;
public class sock {
    public static void main(String[] args) {
        int arr[]={10,20,20,10,10,30,50,10,20};
        int n=arr.length;
        int pair=sockMerchant(n,arr);
        System.out.println(pair);

        
    }
    

static int sockMerchant(int n, int[] ar) {
    Arrays.sort(ar);
    int val=ar[0];
    int count=0;
    int item=0;
    Arrays.sort(ar);
    List<Integer> al=new ArrayList<>();
    int pair=0;
    for(int i=0;i<n;i++){
        if(ar[i]==val){
            item++;
            //al.set(count,item);
            System.out.println(i);

        }
        else{
            System.out.println(i);
            val=ar[i];
            count+=1;
            item=1;
            //al.set(count,item);
            
        }
    }
    // for (int i=0;i<al.size();i++){
    //     al.set(i,(al.get(i))/2);
    //     pair+=al.get(i);
    // }

    return pair;

}
}
