import java.util.*;
class Fibonacci{

    public static void main(String arhs[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series");
        int num=s.nextInt();
        int first=0,second=1;
        int sum=0;
        ArrayList<String> al = new ArrayList<String>(); 
        al.add(null); 
        System.out.println(al.size());
        for(int i=0;i<=num-1;i++){
             System.out.print(" "+first+" ");
            sum=first+second;
            first=second;
            second=sum;

            // System.out.print(" "+sum+" ");
        }
    }
}