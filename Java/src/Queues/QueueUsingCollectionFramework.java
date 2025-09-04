package Queues;


import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // becoz ll is classs and queue is interface we also use arraydeque class
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
