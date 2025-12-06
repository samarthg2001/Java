
import java.util.Scanner;

public class nornRepeating {
public static void main(String[] args) {
    System.out.println("Enter the string value");
    Scanner s=new Scanner(System.in);
    String input=s.nextLine();
    char res=Nonrepating(input);

    if(res!='\0'){
        System.out.println(res+" is not repeating charecter in this "+input+ "  string");
    }
    else{
        System.out.println("all charecter are reapting in "+input+ " string");
    }
}   
    static char Nonrepating(String value){
    int n=value.length();
    for(int i=0;i<n;i++){
    Boolean flag=false;
        for(int j=0;j<n;j++){
            if(i!=j&&value.charAt(i)==value.charAt(j)){
                flag=true;
                break;
            }
        }
        if(flag !=true){
            return value.charAt(i);
        }
        else{
            flag=false;
        }

    }
    return '\0';
    }


}
