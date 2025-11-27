import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int value=sc.nextInt();
int fact=1;
        for(int i=1;i<=value;i++){
            fact*=i;
            System.out.println(fact);
        }
 System.out.println(value+" factorial is "+ fact);
    }
    
}




