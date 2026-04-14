package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection <String> list =new ArrayList<>();

        for(char c='A';c<='Z';c++ ){
            list.add(String.valueOf(c));
        }

        Iterator<String> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
