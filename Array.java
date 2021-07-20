import java.util.*;
public class Array {
    public static void main(String[] args) {
        int [] [] arr =new int [] []{{-9, -9, -9,  1, 1, 1 },{0, -9,  0,  4, 3, 2},{-9, -9, -9,  1, 2, 3},{0,  0,  8,  6, 6, 0},{0,  0,  0, -2, 0, 0},{ 0,  0,  1,  2, 4, 0}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("\n");
        int num=hourglassSum(arr);
        System.out.println(num);
    }
    



    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
        List<Integer> suml=new ArrayList<>();
        
        int rowLength=arr.length;
        int columnLength=arr[0].length;
        int x1=0;
        int x2=2;
        int y1=0;
        int y2=2;

        while (x2<=columnLength-1){
            y1=0;
            y2=2;
            while(y2<=rowLength-1){
                suml=func(arr,suml,x1,x2,y1,y2);
                y1+=1;
                y2+=1;
            }
            x1+=1;
            x2+=1;
        }
        
        int [] gh=new int []{1,8,6,4,5};

        System.out.println(Arrays.asList(gh).indexOf(8));
        List<Integer> lo=new ArrayList<>();
        lo.add(2);
        lo.add(5);
        System.out.println(1);


        return (Collections.max(suml));

        

    }
    public static List<Integer> func(int[][] arr,List<Integer> suml,int x1,int x2,int y1,int y2){
        int [][] a=new int [3][3];

        
        int sum=0;
        int index=y1;
        int subindex1=0;
        int subindex2=0;
        while(x1<=x2 && subindex1<=2){
            y1=index;
            subindex2=0;
            while(y1<=y2 && subindex2<=2){
                
                if(subindex1==1 && subindex2==0){
                    a[subindex1][subindex2]=0;
                }
                else if(subindex1==1 && subindex2==2){
                    a[subindex1][subindex2]=0;
                }
                else{
                a[subindex1][subindex2]=arr[x1][y1];}
                
                sum+=a[subindex1][subindex2];
                
                y1++;
                subindex2++;
            }
            x1++;
            subindex1++;
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("\n");

        suml.add(sum);
        return suml;
    }
}
