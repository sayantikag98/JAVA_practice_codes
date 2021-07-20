public class smax {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int [] a={5,3,7,9,1,10};
        int max=-1;
        int semax=-1;

        for (int i=0;i<a.length;i++){
            if(max<a[i]) max=a[i];

        }
        for ( int i=0;i<a.length;i++){
            if(semax<a[i]) {
                if(a[i]!=max) semax=a[i];}
        }
        System.out.println(max);
        System.out.println(semax);
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        


    } 
}