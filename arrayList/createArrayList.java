
import java.util.ArrayList;
import java.util.Collection;

class createArrayList {

    public static void main(String[] args) {
        Collection <String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for(String name:list){
            System.out.println(name);
        }




    }
}