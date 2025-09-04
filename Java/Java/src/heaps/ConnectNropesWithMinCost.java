package heaps;

import java.util.PriorityQueue;

public class ConnectNropesWithMinCost {
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i< ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while (pq.size()>1){
            int min1st= pq.remove();
            int min2nd= pq.remove();
            cost+=min1st+min2nd;
            pq.add(min1st+min2nd);
        }
        System.out.println("Minimum cost is "+cost );

    }
}
