package string;

import java.util.Scanner;

public class Long {
 
        public static void main(String[] args) {
            String s="asdhfkjdasjfdhsavhddxcgfhjklbc";
            System.out.println(s.length());
            for(int i=0;i<s.length();i++){
                System.out.println(s.charAt(i));
            }

            Scanner sa =new Scanner(System.in);
        char w = sa.next().charAt(0);
boolean flag=false;
  
int count=0;
for(int i=0;i<s.length();i++){
            char w1=s.charAt(i);
            if(w1==w){
                flag=true;   
                count++;
            }
        }
if(!flag){
    System.out.println(w+" "+ "is not present in word "+s  );
}
else{

    System.out.println(w+" "+ "is  present in word "+s + "world count is  " + count);
}







        }
}
