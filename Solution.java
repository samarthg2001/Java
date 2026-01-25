import java.util.*;

class Solution {

    public static int removeDuplicates(int[] nums) {
     boolean flag=false;
     int unique=0;
     for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                        {
                            flag=true;
                            System.out.println(nums[j]);
                            break;
                        }     

                    }
            if(flag==true)
                {continue;}
            unique++;
            System.out.println(unique);    
        }   
            return unique;
        } 
    
      
        public static int removeDuplicates1(int[] nums){
            int highest=nums[0];
            for(int i:nums){
                if(i>highest){
                    highest=i;
                }
            }
            if(nums[0]==0){
                highest++;
            }
            return highest;
        }




        public static  int[] intersection(int[] nums1, int[] nums2) {
            int n=nums1.length;
            int m=nums2.length;
            int o=0;
            if(m>n){o=m;}
            else{o=n;}
            int [] res=new int[o];
            int left=0;
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    res[left++]=nums1[i];
                    break; 
                }
            }    
            }
    
            Set<Integer> set = new HashSet<>();
    for (int num : res) {
        set.add(num);
    }
    for(int i:set){System.out.println(i);}
    
    int[] arr1 = new int[set.size()];
    int ii = 0;
    
    for (int num : set) {
        arr1[ii++] = num;
    }
    return arr1;
    
        }

public static void main(String[] args) {
    int[] nums = {1,1,1,2,2,3,3,4}; 
    int[] nums2={1,2,2,2};
//int res=removeDuplicates1(nums);
int [] res=intersection(nums, nums2);
for(int i:res){System.out.println(i);}
// System.out.println(res);

}
}
