package arrayList;

public class create {

        public static void  ReverseString(String str){
            String value=str;
            int len=str.length();
            String newstr="";
            for(int i=len-1;i>=0;i--){
                newstr+=value.charAt(i);
            }
            if(newstr.equals(value)){
                System.out.println(str+" and "+ value +" are same");
            }
            else{
                System.out.println(str+" and "+ value +" are not same");
            }

        }


        public static void fibonacciSeries(int n){

            int a=0,b=1;
            int i=0;
            int value=0;
            while(i<n){
                System.out.print(a+" ");
                value=a+b;
                a=b;
                b=value;
                n--;
            }
        }



        public static void primeNumber(int n){
            if(n<=1){
                System.out.println(n+" is not a prime number");
            }
             for(int i=2;i<=n;i++){
                if(n%i==0)
     {System.out.println(n +" is  prime number");}



            }

        }


        public static void secondHighest(int arr[]){
            int len=arr.length;
            int highest=0;
            int secondHighest=0;
            int thridhighest=0;
            if(len<3){
System.out.println("less then three number are there");
            }

            for(int i=0;i<=len-1;i++){

                if(highest<arr[i]){
                    thridhighest=secondHighest;
                    secondHighest=highest;
                    highest=arr[i];
                }
                else if(secondHighest<arr[i] ){
                    thridhighest=secondHighest;
                    secondHighest=arr[i];
                }
                else if (thridhighest<arr[i]) {
                    thridhighest=arr[i];
                }
            }

System.out.println(highest+" is highest"+secondHighest+" is secondhighest"+thridhighest+" is thirdhighest");

        }

        public static void findDuplicate(int arr[]){
            for(int i=0;i<=arr.length-1;i++){
                for(int j=i+1;i<=arr.length-1;i++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[j]+" is a duplicate value");
                        break;
                    }
                }
                break;

            }
        }



    public static void main(String [] args){
ReverseString("MADA");
fibonacciSeries(15);
System.out.println();
// primeNumber(15);
    int [] arr={11,1,1,2,3,6,4,5,8,9,7,4,4,55,2,0,3,5,66,9,50};
secondHighest(arr);
findDuplicate(arr);

}
    
}
