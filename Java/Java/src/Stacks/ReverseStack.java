package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    reverse(s);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
}
    public static void pushAtButtom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtButtom(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        int top= s.pop();
        if(s.isEmpty()){
            pushAtButtom(s,top);
            return;
        }
        reverse(s);
        pushAtButtom(s,top);
    }


}
