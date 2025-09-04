package Hashing;

import java.util.HashSet;
import java.util.Iterator;

// using iterator
// using advanced for loop
public class iterationOnHashset {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("kol");
        city.add("bang");
//        Iterator it = city.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for (String s : city){
            System.out.println(s);
        }

    }

}
