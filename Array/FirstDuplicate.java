import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
 Scanner s= new Scanner(System.in);
 System.out.println("enter the size of Array");
/*  int size=s.nextInt();

 int arr[]=new int[size];
    
 for(int i=0;i<size;i++){
    arr[i]=s.nextInt();
 }


 System.out.println(" the Array");
 for(int i=0;i<size;i++){   
System.out.print(arr[i]+" "); 
}
*/


int []arr1={10,2,6,3,110,3};
int size=arr1.length;
System.out.println();
for(int i=0;i<size;i++){
    for(int j=i+1;i<size;i++){
        if(arr1[i]==arr1[j]){
            System.out.println(arr1[i]+" is Duplicate data in the Array");
        }
    }
}



minmax(arr1);
duplicate(arr1);
 }  
 

static void minmax(int arr[]){
int min=arr[0],max=arr[0];
for(int i:arr){
    if(min>i){
        min=i;
    }
    if(max<i){
        max=i;
    }
}
System.out.println("in the array min value is "+min+" and max value is "+max);
}

static void duplicate(int arr[]){
    int arrlength=arr.length;
    int FirstDuplicate=0;
    boolean flag=false;
    for(int i=0;i<arrlength;i++){
    for(int j=0;j<arrlength;j++){
        if(i !=j&&arr[i]==arr[j]){
            FirstDuplicate=arr[j];
           flag=true; 
            break;
        }
    }
}
if(flag != false){
    System.out.println("The duplicate element is "+FirstDuplicate);
}
else{
    System.out.println("no duplicate found in the array");
}

}


}
