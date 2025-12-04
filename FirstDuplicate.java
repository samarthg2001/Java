import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string ");
        String input=s.nextLine();
        
        char res=FirstDuplicatevalue(input);
        if(res !='\0'){
System.out.println(input+" string first duplicate value is "+ res);
        }
        else{
            System.out.println(input+" string no duplicate value is ");

        }

    }
   static char FirstDuplicatevalue(String s){
        
        int stringLenght=s.length();
        
        for(int i=0;i<stringLenght;i++){
            for(int j=i+1;j<stringLenght;j++){
            if(s.charAt(i)==s.charAt(j)){
                return s.charAt(i);
             
            }
            }
            
        }
        return '\0';
    }

}
