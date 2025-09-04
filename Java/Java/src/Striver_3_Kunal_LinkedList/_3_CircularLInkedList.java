package Striver_3_Kunal_LinkedList;

public class _3_CircularLInkedList {
    private Node head;
    private Node tail;
    private int size;

    public _3_CircularLInkedList() {
        this.size = 0;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if (head==null){
            head = node;
            tail = node;
            node.next=head;
            return;
        }
        tail.next =node;
        node.next =head;
        tail=node;
        size++;
    }
    public void display(){
        if (head == null){
            System.out.println("No data");
            return;
        }
        Node temp = head;
        while (temp.next != head){
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println(temp.val+ " <-> ");
    }
    public void delete(int num){
        if (head == null){
            System.out.println("Nothing to delete");
            return;
        }
        if (head.val == num){
            if (head.next == head){
                head = null;
                tail = null;
                return;
            }
            head = head .next;
            tail.next= head;
            return;
        }
        Node prev = head;
        Node temp = head.next;
        while (temp.val != num){
            temp= temp.next;
            prev=prev.next;
            if (temp.next == head){
                System.out.println("Number not found");
                return;
            }
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        _3_CircularLInkedList list = new _3_CircularLInkedList();
        list.insertLast(3);
        list.insertLast(7);
        list.insertLast(5);
        list.display();
        list.delete(9);
        list.display();
    }
}
