package Java.src.LinkedList;

public class LinkedLST {
    public static void main(String[] args) {
        LinkedLST list=new LinkedLST();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("5");
        list.printList();
       // list.ReverseList();
        list.head=list.reverserRecurssion(list.head);
        list.printList();
//        list.addFirst("VD");
//        list.addLast("is");
//        list.addLast("king");
//        list.printList();
//        System.out.println(list.getSize());
//        list.deleteFirst();
//        list.printList();
//        list.addFirst("Varun");
//        list.printList();
//        list.deleteLast();
//        list.printList();
//        System.out.println(list.getSize());

    }
    //node creation
    private int size;
    LinkedLST() {
        this.size=0;
    }
    node head;//
    class node{
        String data;
        node next;
        node(String data){//node type ka contructor
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add at first
    public void addFirst(String data){
        node newNode= new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add last
    public void addLast(String data){
        node newNode= new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node CurrNode=head;
        while(CurrNode.next!=null){
            CurrNode=CurrNode.next;
        }
        CurrNode.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null) {
            head=null;
            return;
        }
        node secondLast=head;
        node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        node CurrNode=head;
        while(CurrNode!=null){
            System.out.print(CurrNode.data + "->");
            CurrNode=CurrNode.next;
        }
        System.out.println("Null");

    }
    public int getSize(){
        return  size;
    }
    public void ReverseList(){
        if(head==null || head.next==null){ //if list is empty or contain only one node
            return;
        }
        node prevNode=head;
        node currNode=head.next;
        while(currNode!=null){
            node nextNode= currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public node reverserRecurssion(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newHead=reverserRecurssion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

}
