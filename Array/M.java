import java.util.Scanner;

public  class M {
    {
        System.out.println("M non static method");
        }
            
        static{
            System.out.println("M static method");
        }

    public static void main(String[] args) {
          System.out.println(
        "Main method");  
        InnerM s=new InnerM();
        M ss=new InnerM();
//        InnerM s=new M();
    
    }


}

public class InnerM extends M{
{
    
System.out.println("INnverM non static method");
}
    
static{
    System.out.println("static method of Inner M");
}
}
