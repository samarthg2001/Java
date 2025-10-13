import java.util.Scanner;
class OddEven{

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number");
        int number=s.nextInt();
        if(number%2==0){
            System.out.print(number +" is the Even number");
        }
        else{
            System.out.print(number +" is Odd numbers");
        }


    }
}