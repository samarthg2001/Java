import java.util.Scanner;

public class PrimeNumber {
  public static boolean isprime(int n){
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int next=sc.nextInt();

        if(isprime(next)){
System.out.println(next+ " is the prime number");
        }
        else{
            System.out.println(next+ " is the not prime number");

        }
    }
}
