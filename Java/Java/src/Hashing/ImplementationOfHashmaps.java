package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfHashmaps {
    static class HashMap<K,V>{ //K,V ->generic variable
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // n - total number of nodes in hashmaps
        private int N;
        private LinkedList<Node> buckets[]; // N-> buckets.length
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N =4;//
            this.buckets=new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>();
            }
        }


        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0 ; i <ll.size();i++){
                Node node= ll.get(i);
                if(node.key==key){
                    return di;
                }
                else{
                    di++;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets= new LinkedList[2*N];
            N=2*N;
            for(int i=0; i<buckets.length; i++){
                buckets[i]= new LinkedList<>();
            }
            // moving nodes to new bucket
            for(int i=0; i< oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j< ll.size();j++){
                    Node node= ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key); // bi - bucketIndex -> 0 to size-1
            int di = searchInLL(key,bi);  // data index in a ll, it is either exist or not exist
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value=value;
            }
            else {
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double Lambda= (double)n/N;
            if(Lambda > 2.0){ // 2.0 is threshold
                rehash();  //To optimise hash
            }
        }

        public boolean containsKeys(K key){
            int bi = hashFunction(key); // bi - bucketIndex -> 0 to size-1
            int di = searchInLL(key,bi);  // data index in a ll, it is either exist or not exist
            if(di != -1){
                return true;
            }
            else {
               return false;
            }

        }
        public V remove(K key){
            int bi = hashFunction(key); // bi - bucketIndex -> 0 to size-1
            int di = searchInLL(key,bi);  // data index in a ll, it is either exist or not exist
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else {
                return null;
            }
        }
        public V get(K key){
            int bi = hashFunction(key); // bi - bucketIndex -> 0 to size-1
            int di = searchInLL(key,bi);  // data index in a ll, it is either exist or not exist
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else {
                return null;
            }
        }
        public ArrayList<K> keyset(){
            ArrayList<K> keys= new ArrayList<>();
            for (int i=0; i<buckets.length;i++){
                LinkedList<Node> ll= buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;// total number 0
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        hm.put("India",150);
        hm.put("China",140);
        hm.put("Nepal",10);
        hm.put("Itlay",20);
        ArrayList<String> keys= hm.keyset();
        for(String k : keys){
            System.out.println(k);
        }
        System.out.println(hm.get("India"));;

    }
}
