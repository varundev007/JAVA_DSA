package LinkedList;
import java.util.*;
public class LLusingCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("Varun");
        System.out.println(list);
        list.addLast("king");
        System.out.println(list);
        list.add("last"); //default it will add to the last list
        System.out.println(list);
        System.out.println(list.size());
        //printing values of list
//        for(int i=0;i< list.size();i++){
//            System.out.print(list.get(i)+"->");
//        }
        list.remove();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
