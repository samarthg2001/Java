import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        
        int []arr={1,3,5,6,8,4,5,6,9,2,2};
        List<Integer> lst=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            lst.add(arr[i]);
       count++;
        }

        for(Integer i:lst){
            System.out.println(i);
        }
System.out.println("Total count is "+ count);
        Set<Integer> uni=new HashSet<>();
        Set<Integer> dup=new HashSet<>();
        for(Integer i: lst){
            if(!uni.add(i)){
                dup.add(i);
            }
        }

        System.out.println("unique value");

        for(Integer i:uni){
            System.out.print(i);
        }
System.out.println();
        System.out.println("duplicate value ");

        for(Integer i:dup){
            System.out.print(i);
        }


        
    }
}
