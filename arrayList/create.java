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
                System.out.print(value+" ");
                value=a+b;
                a=b;
                b=value;
                n--;
            }

            
        }
    public static void main(String [] args){
ReverseString("MADA");
fibonacciSeries(15);
    }
    
}
