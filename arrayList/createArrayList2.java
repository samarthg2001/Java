package arrayList;

import java.util.ArrayList;
import java.util.Collection;

public class createArrayList2 {

    public static void main(String[] args) {
        Collection <String> list=new ArrayList<>();

        for(char i='A';i<='z';i++){
            list.add(String.valueOf(i));

        }
for(String c:list){
    System.out.println(c);
}
        
    }
}
