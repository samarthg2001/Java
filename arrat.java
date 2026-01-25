class arrat{
    static int secondHighest(int [] arr){
       int n =arr.length;
    int temp;
        int highest=arr[0],secondhighest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>highest){
                temp=highest;
                highest=arr[i];
               secondhighest=temp;
            }
            if(arr[i]>secondhighest){
                if(arr[i]<highest){
                secondhighest=arr[i];
                     }
            }

        }

return secondhighest;

    }
    public static void main(String[] args) {
     int []  three={9,100, 98, 10, 97, 96, 99}; 
          int [] four={-6, -20, -30, -5, -5, -15};
     int thr=secondHighest(four);
    System.out.println(thr);
    }
}