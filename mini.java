public class mini {
    public static void main(String[] args) {
        int [] a=new int []{4, 3, 1, 2};
        for(int i=0;i<a.length;i++){
            int index=mi(a,i);
            // System.out.println(index);
        }
        
        
    }
    public static int mi (int [] a, int b){
        int index=b;
       
        for(int i=b;i<a.length;i++){
            // System.out.println(i);
            // System.out.println("\n");
            System.out.print(a[i]+"  ");
            // System.out.println("\n");
            if(a[index]>a[i]){
                index=i;
            }
        }
       
        return index;
    }
}
