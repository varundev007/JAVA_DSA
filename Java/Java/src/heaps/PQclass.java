package heaps;

import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class PQclass {
    static class student implements Comparable <student>{
        String name;
        int rank;
        student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        //REMEMBER SYNTAX
        @Override
        public int compareTo(student s2){
            return this.rank- s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        pq.add(new student("A",4));
        pq.add(new student("C",6));
        pq.add(new student("B",2));
        pq.add(new student("D",7));
        pq.add(new student("E",1));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }

    }
}
