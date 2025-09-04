package heaps;

import java.util.PriorityQueue;

public class NearByCars {
    static class points implements Comparable<points>{
        int x;
        int y;
        int disSq;
        int idx;
        public points(int x,int y,int disSq, int idx){
            this.x=x;
            this.y=y;
            this.disSq=disSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(points p2){
            return this.disSq- p2.disSq;//asecnding order
        }
    }

    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2; //Need to find pts of nearest two cars
        PriorityQueue<points> pq=new PriorityQueue<>();
        for (int i=0 ; i< pts.length;i++){
            pq.add(new points(pts[i][0], pts[i][1], pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1] , i ));
        }
        for(int i=0; i<k; i++){
            System.out.println("C ->"+ pq.remove().idx);
        }
    }
}
