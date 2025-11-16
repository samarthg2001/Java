package string;

import java.util.Scanner;




 class SearchString {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Question object=new Question();
        System.out.println("Enter the string value");
        String str=sc.next();

        System.out.println("Enter the string chareter to find");
        char findElement=sc.next().charAt(0);

        int count=object.findtheElement(str,findElement);
        System.out.println(count+" the number of "+findElement+" is appering in "+str);
        

    }
}
public class Question{
    public int findtheElement(String x ,char y ){
        int count=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==y){
                count++;
            }
        }

        return count;
    }

}
