import java.util.*;
class BinerySearch{

// {
//     System.out.pritln("non static method");
// }
// static {
//     System.out.pritln("static method");
// }



public static void binery(int arr[],int target){
    int low=0;
    int high=arr.length-1;
    boolean flag=false;
    int mid=0;
    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]==target){
            flag=true;
            break;
        }
        else if(arr[mid]>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        
    }
    if(flag){
            System.out.print("element found in array");
        }
        else{
            System.out.println("element not found in array");
        }
}

public static int  countodd(int arr[]){
    int oddcount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            oddcount+=1;
        }
    }
    return oddcount;
}

public static int counteven(int arr[]){
    int evencount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            evencount+=1;
        }
    }
    return evencount;
}





    public static void main (String  argsp[]){






        
        int arr[]={10,20,3,5,8,0,15,0};
        int n=arr.length;
        try{
            int temp=0;
            for (int i=0;i<n;i++){
            // System.out.println(arr[i]);
            
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
            }
for(int i=0;i<n;i++){System.out.print(arr[i]+" ");}
binery(arr,2055);
int odd=countodd(arr);
int even=counteven(arr);
System.out.print(odd+" "+even);

        }
        catch(Exception e){
            System.out.println(e);
            
        }
        System.out.println("hello world");
    }
}