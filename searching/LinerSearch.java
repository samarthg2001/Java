import java.util.*;
class LinerSearch{
    public static void main(String arhs[]){
        
        int A[]={10,20,1,5};
        int len=A.length;
        for(int i=0;i<len;i++){
            System.out.println(A[i]);
        }
        Scanner s=new Scanner(System.in);
        int serch=s.nextInt();
        for(int i=0;i<len;i++){
            if(A[i]==serch){
            System.out.print(serch+" found in array index "+ i);
                }
        }
    }


}
