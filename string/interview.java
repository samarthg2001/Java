package string;

public class interview {

    public static void main(String[] args) {
        
        String s="ABCnkdfashfsf";
        String New="";
        String besa="";
        for(int i=0;i<s.length();i++){
            
            if(i%2==0){
                New=New+s.charAt(i) + " ";
            }
            else{
             besa=besa+s.charAt(i) + " ";
            }
        }

        System.out.println("all odd values are "+besa+" "+"and all even are "+ New );

    }
}
