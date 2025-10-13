import java.util.Scanner;
class PrimeNumber{

    public static void main(String arhs[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=s.nextInt();
        if(isprime(num)){
            System.out.println(num+" is prime number");
        }
        else{
                        System.out.println(num+ " is not prime number");

        }
    }
   public static boolean isprime(int num){
    for(int i=2;i<=num-1;i++){
        if(num%i==0){
            return false ;
        }
            }
            return true;

   
   }

}