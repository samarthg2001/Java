import java.util.Arrays;

public class singleNumber {

     public static int singleNumbr(int[] nums) {
     Arrays.sort(nums);
    int n=nums.length;
     for(int i=0;i<n-1;i++){
        if(nums[i] !=nums[i+1]  ){
            return nums[i];
        }   
         }  
    return nums[n-1];
    }
    public static void main(String[] args) {
            
        int [] arr={4,1,2,1,2};

            int res=singleNumbr(arr);

        System.out.println(res);

    }
}
