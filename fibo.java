import java.util.Scanner;

public class fibo {

 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=0;
    int j=1;
    int values=0;
 
    for(int k=0;k<=n;k++){
        System.out.print(i + " " );
        values=i+j;
        i=j; 
        j=values;
    }
 }   
}