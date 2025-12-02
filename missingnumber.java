public class missingnumber {

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,8,6,7};
        int sum=0;
        int n=arr.length;
        int actualsum=(n*(n+1))/2;
        int missingValue=0;
/*         for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        } */
        
        for(int i:arr){
            sum=sum+i;
        }
        missingValue=actualsum-sum;
        System.out.println("the missing number is "+arr+" is "+ missingValue);
    }
}