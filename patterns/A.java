import java.util.*;
class B{
    public static void Trangle(int n){
        for(int i=0 ; i<=n ;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}

class A {

        public void box(int n){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of start ");
        int num=s.nextInt();
        A a=new A();
        B b=new B();
        a.box(num);
        b.Trangle(num);
    }

}


