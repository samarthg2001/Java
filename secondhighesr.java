public class secondhighesr {
 
    public static void main(String[] args) {
        int arr[]={12,18,36,8,5,0,10,59,6,7,126,125};
   
        int highest=arr[0];
        int secondhighest=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > secondhighest && arr[i]>highest){
                highest=arr[i];
                System.out.println(highest);
            }
            else if(arr[i] >secondhighest && arr[i]!= highest){
                secondhighest=arr[i];
                System.out.println(secondhighest);
            }


        }
        System.out.println(highest+"  2nd highest is "+secondhighest);


    }

}
