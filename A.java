import java.util.Scanner;

public class A {

    static String palidram(String value){
        int n=value.length();
        String rev="";
       for(int i=n-1;i>=0;i--){
            rev= rev +value.charAt(i);
        System.out.println(value.charAt(i));
        }
        System.out.println(n);
        return rev;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String A="abcd";
        String rev=palidram(input);
System.out.println(rev);

        if(rev.equals(input)){
            System.out.println("It is palidram");
        }
        else{
            System.out.println("It is not palidram");
        }

    }

}
