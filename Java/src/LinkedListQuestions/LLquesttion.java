package LinkedListQuestions;

public class LLquesttion {
    public static void main(String[] args) {
        LLquesttion list=new LLquesttion();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
    }
    node head;
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        node newNode= new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList(){
        node curr=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }


}
