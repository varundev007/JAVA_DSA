package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQinJCF {
    // add()- O(log(n))
    //remove()-O(log(n))
    //peek()-O(1)
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//BY DEFAULT ASECENDING ORDER
        pq.add(3);
        pq.add(2);
        pq.add(6);
        pq.add(8);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
//        TO GET DESCENDING ORDER
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(3);
        pq1.add(2);
        pq1.add(6);
        pq1.add(8);
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
