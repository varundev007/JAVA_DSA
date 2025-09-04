package Striver_3_Kunal_LinkedList;

import java.util.List;

public class _1_Singlely_LL {

    private Node head;
    private Node tail; // for better time complextity while inserting element at last
    private int size;
    private _1_Singlely_LL(){
        this.size=0;
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val= val;
            this.next =next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if ( tail == null){
            tail =head;
        }
        size++;
      //  System.out.println(size);
    }
    public void insertLast(int val){
        //constant time complexity that is why we created tail with head
        Node node = new Node(val);
        if (tail == null){
            insertFirst(val);
            return;
        }
        tail.next= node;
        tail=node;
        size++;
     //   System.out.println(size);
    }
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        if (index > size){
            System.out.println("Excced the size");
            return;
        }
        Node temp = head;
        for (int i = 1 ; i<index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next =node;
        size++;
       // System.out.println(size);
    }

    public void deleteFirst(){
        if (size == 0){
            System.out.println("Nothing to delete");
            return;
        }
        if (size == 1){
            head = null;
            tail= null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if (size == 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1 ; i<size-1 ;i++){
            temp = temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }
    public void delete(int index){
        if (size <= 1){
            deleteFirst();
            return;
        }
        if (index == (size - 1)){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int  i =1 ; i<index ; i++){
            temp =  temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        Node temp = head;
        if (tail== null){
            System.out.println("LL is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.val + "->" );
            temp = temp.next;
        }
        System.out.println("END");
    }
    //leetcode -> given that elements are sorted
    public void removeDuplicates(){
        Node curr = head;
        while (curr.next != null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
                size--;
            }
            else {
                curr = curr.next;
            }
        }
        tail =curr;
        tail.next = null;
    }
  //  public static int getSize()
    public void bubbleSortLL(){
        if(head == null && head.next == null){
            return;
        }
        for (int i =0 ;i< size-1 ; i++){
            Node curr = head;
            while (curr.next != null){
                if (curr.val >curr.next.val){
                    //swap
                    int temp = curr.val;
                    curr.val= curr.next.val;
                    curr.next.val= temp;
                }
                curr= curr.next;
            }
        }
    }

    public static _1_Singlely_LL Merge(_1_Singlely_LL List1, _1_Singlely_LL List2){
        _1_Singlely_LL ans = new _1_Singlely_LL();
        Node first = List1.head;
        Node second = List2.head;
        while (first != null && second != null){
            if (first.val < second.val){
                ans.insertLast(first.val);
                first = first.next;
            }
            else{
                ans.insertLast(second.val);
                second = second.next;
            }
        }
        while (first != null){
            ans.insertLast(first.val);
            first = first.next;
        }
        while (second != null){
            ans.insertLast(second.val);
            second = second.next;
        }
        return ans;
    }

    public static void main(String[] args) {
     //   _1_Singlely_LL Llist = new _1_Singlely_LL();
       // Llist.deleteFirst();
//
   //     Llist.insertLast(4);
//        Llist.insertFirst(3);
//        Llist.insertLast(3);
//        Llist.insertLast(3);
//        Llist.insertLast(4);
//        Llist.insertLast(4);


        //Llist.insert(22,2);
       // Llist.deleteFirst();
       // Llist.display();
       // Llist.deleteLast();
//        Llist.display();
//        Llist.removeDuplicates();
//        //Llist.delete(2);
//        Llist.display();
        _1_Singlely_LL List1 = new _1_Singlely_LL();
        _1_Singlely_LL List2 = new _1_Singlely_LL();
        List1.insertLast(1);
        List1.insertLast(5);
        List1.insertLast(4);
        List1.insertLast(2);
       // List2.insertLast(2);
        //List2.insertLast(133);
       // List2.insertLast(10);
       // _1_Singlely_LL Ans = _1_Singlely_LL.Merge(List1,List2);
        List1.display();
        List1.bubbleSortLL();
        List1.display();

    }
}
