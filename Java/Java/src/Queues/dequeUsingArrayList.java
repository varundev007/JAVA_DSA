package Queues;

import java.util.ArrayList;

public class dequeUsingArrayList {
    public static void main(String[] args) {

    }
    static class circularDeque{
        static ArrayList<Integer> arr;
        static int size;
        circularDeque(int k){
            arr=new ArrayList<>();
            size=k;
        }
        public static boolean isEmpty(){
            return arr.size()==0;
        }
        public static boolean isFull(){
            return arr.size()==size;
        }
        public static boolean insertFront(int value) {
            if(arr.size()==size){
                return false;
            }
            arr.add(0,value);
            return true;
        }
        public static boolean insertLast(int value) {
            if(arr.size()==size){
                return false;
            }
            arr.add(value);
            return true;
        }
        public static boolean deleteFront() {
            if(arr.size()==0){
                return false;
            }
            arr.remove(0);
            return true;
        }
        public static boolean deleteLast() {
            if(arr.size()==0){
                return false;
            }
            arr.remove(arr.size()-1);
            return true;
        }
        public static int getFront() {
            if(arr.size()==0){
                return -1;
            }
            return arr.get(0);
        }
        public static int getRear() {
            if(arr.size()==0){
                return -1;
            }
            return arr.get(arr.size()-1);

        }
    }
}
