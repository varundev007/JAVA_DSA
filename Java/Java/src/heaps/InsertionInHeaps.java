package heaps;

import java.util.ArrayList;

public class InsertionInHeaps { ///min heap
    static class heaps{
        ArrayList<Integer> arr= new ArrayList<>();
        public void add(int data){
            //insert data at end of the arr
            arr.add(data);
            int x= arr.size()-1;  //index xof child       parent index i->  left-> 2i+1  Right ->2i+2
            int par=(x-1)/2;   //Index of parent
            while(arr.get(x) < arr.get(par)){       // while loop - O(log(n))
                //SWAP
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        //peek
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){               ////O(log n)
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left< arr.size() && arr.get(left)<arr.get(i)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(i) ){
                minIdx=right;
            }
            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
        }
        public int remove(){
            int data= arr.get(0);
            //Step-1 SWAP first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //Delete last
            arr.remove(arr.size()-1);
            // heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        heaps h = new heaps();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        }
    }

