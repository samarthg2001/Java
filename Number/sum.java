public class sum {
    public static void main(String args[]){
        int num=123456;
        int sum=0;
        int single=0;
        while(num>0){
            single=num%10;
            sum=single+sum;
            num=num/10;

        }
        boolean value=armstrong(372);
System.out.println(sum+ ""+value);
    }



    static boolean armstrong( int num){
    boolean flag=false;
    int sum=0,value=0;
    int digit=String.valueOf(num).length();
        int a=num;
    while(num>0){
        value=num%10;
        sum+=Math.pow(value,digit);
        // sum=sum+(value*value*value);
        num=num/10;
        }    
if(sum==a){
    flag=true;
}

        return flag;        
    }
}
