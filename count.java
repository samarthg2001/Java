import java.util.Scanner;

public class count {
   public static void main(String[] args) {
   
   
   Scanner sc =new Scanner(System.in);
    String sentence="asdfdasfkjbfihewvasfnvTTTTiewftbT";
    
    System.out.println("please enter charter ");

    char s=sc.next().charAt(0);

    int count=0;
    for(int i=0;i<sentence.length();i++){
        if(sentence.charAt(i)==s){
            count++;
        }
    }


    System.out.println(" in the string of "+sentence+" is letter "+s+" is appered" + count);
   } 
}
