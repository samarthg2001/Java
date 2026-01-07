import java.util.Scanner;

class arrat{

static void reverse(int arr[]){
    int n=arr.length;
    int temp;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
     temp=0;
    for(int i=0;i<=n/2;i++){
        temp=arr[n-i-1];
        arr[n-i-1]=arr[i];
        arr[i]=temp;
       

    }

    for(int i:arr)
    System.out.println(i);
}








    public static void main (String arh[]){
        Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
     //   System.out.println(num);
        int [] arr={63,1,60};
        int [] arr1={1,2,3,4,5,6};
        reverse(arr);
        reverse(arr1);
        reverse(arr1);

 
    }
}