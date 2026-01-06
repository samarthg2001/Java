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
System.out.println(sum);
    }

}
