package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class allmethod {
public static void main(String[] args) {
    



    Collection <String> list=new ArrayList<>();
    List<String> list1=new ArrayList<>();
    List<Integer> list2=new ArrayList<>();

for(char c='a';c<='z';c++){
    list1.add(String.valueOf(c));}


for(int k=0;k<=100;k++){
    list2.add(k);}    


for(String A:list1){
    System.out.println(A);
}
for(Integer s:list2){
    System.out.println(s);
}


}
}