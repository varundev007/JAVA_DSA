package Striver_3_Kunal_LinkedList;

public class _2_Doublely_LL {
    int size;
    private _2_Doublely_LL(){
        this.size=0;
    }
    Node head;

    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev =null;
        if (head != null){
            head.prev =node;
        }
        head = node;
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val, null,null);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next=node;
        node.prev = temp;
        size++;
    }
    public void insert(int after, int val){
        Node node = new Node(val);
        Node temp = head;
        while (temp.val != after){
            if (temp.next == null){
                System.out.println("No element found");
                return;
            }
            temp = temp.next;
        }
   //     Node node = new Node(val);
        Node nextNode = temp.next; // Save the original next node

        node.next = nextNode;
        node.prev = temp;
        temp.next = node;

        if (nextNode != null){
            nextNode.prev = node; // Fix the next node's previous pointer
        }
        size++;
    }
    public void display(){
        Node temp = head;
        Node last = null;//getting last node to print LL in reserve order
        while(temp!=null){
            last = temp;
            System.out.print(temp.val + "<->");
            temp = temp.next;
        }
        System.out.println("END");
        while (last!=null){
            System.out.print(last.val + "<->");
            last = last.prev;
        }
        System.out.println("START");
    }
    public static void main(String[] args) {
        _2_Doublely_LL list =new _2_Doublely_LL();
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(5);
    //    list.display();
        list.insertLast(20);
//        list.display();
        list.insert(3,22);
   //     list.insert(44,32);
        list.display();
    }
}
