import java.util.*;
public class HighestLowest {


    public static void main(String args[]){

        int [] arr={1213,51,562,1,023,50,5,011111,3265,125,5545,15612};
        int highestValue=arr[0],lowestValue=arr[0];
        int n=arr.length;
        try{
        for(int i=0;i<=n-1;i++){
            if(arr[i]>highestValue){
                highestValue=arr[i];
            }
            else if(arr[i]<lowestValue){
                lowestValue=arr[i];
            }
            else{
                // continue;
            }

        }
    }
    catch(Exception e){
        System.out.print(e);

    }
    System.out.print(highestValue+" "+lowestValue);

    }
}
