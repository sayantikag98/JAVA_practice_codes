import java.util.*;
public class byye {
    public static void main(String[] args) {
        int [] nums={-2,-1};
        int ans=maxSubArray(nums);
        System.out.println(ans);
    }
    public static int maxSubArray(int[] nums) {
        int maxSum=0;
        List <Integer> jump=new ArrayList<>();
        if(nums.length<2){
            return nums[0];
        }
        for(int a=0;a<nums.length;a++){
            for(int b=a+1;b<nums.length+1;b++){
            int []bump=Arrays.copyOfRange(nums,a,b);
            for(int i:bump) System.out.println(i);
            System.out.println("\n");
            int sum=0;
            sum=sum1(bump);
            System.out.println(sum);
            jump.add(sum);
            
            
            
        }
            
    }
    System.out.println("This is jump\n");
    for(int i:jump)System.out.println(i);
    maxSum=max(jump);
    return maxSum;   
        
    }

    public static int sum1(int [] nums){
        int sum=0;
        if(nums.length<2){
            return nums[0];
        }
        for (int i: nums){
            sum+=i;
        } 
        return sum;
    }

    public static int max(List<Integer> jump){
        int max1=jump.get(0);
        for (int i:jump){
            if(max1<i){
                max1=i;
            }
        }
        return max1;
    }
}
    
