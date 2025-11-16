package string;
import java.util.*;

public class count {

   static int countVowels(String s){
        String vowels[]={"a","e","i","o","u"};
        String x="aeiou";
        String compare=s.toLowerCase();
        int vowel=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j< vowels.length;j++){
                if(compare.charAt(i) == vowels[j].charAt(0)){
                 //    compare.charAt(i) == x.charAt(i)
                    vowel++;
                }

            }
        }

        return vowel;
    }


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");


        String a=sc.next();
 

        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }

        int vowelscount=countVowels(a);
        
        int n=a.length();

        if(n==vowelscount)
        System.out.println("the number vouwels count in "+a+ " is  "+vowelscount);
        else
        System.out.println("the number vouwels count in "+a+ " is  "+vowelscount+" constant count is "+(n-vowelscount) );




    }
}



