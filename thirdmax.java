import java.util.Arrays;

class thirdmax {


    public static void maxmin(int [] nums){
        int n=nums.length;
        int i=0;
        int min=nums[0],max=nums[0];
        while (i<n) {
         if(nums[i]>max){
            max=nums[i];
         }
         if(min>nums[i]){
            min=nums[i];
         }
            i++;
        }
        System.out.println(min+ " "+max);
    }



    public  static int  removeElement(int[] nums, int val) {
        int count=0;
        for(int i:nums){
            if(val==i){
                count++;
          System.out.println("count is "+ count);
            }
            System.out.print(i);
        }
    return nums.length-count;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,56,3,8,5,6,98,125};
        int [] arr1={1,1,2,2,3,3,4};
        int [] arr2={3,2,2,3};
//        int res=thirdMax(arr1);
        //maxmin(arr);
//        int res=removeElement(arr2,3);
 //       System.out.println(res+" ");
int value=4-3;
 System.out.println(value);
    }
}