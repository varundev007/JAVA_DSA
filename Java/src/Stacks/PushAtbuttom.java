package Stacks;

import java.util.Stack;

public class PushAtbuttom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtButttton(s,5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void pushAtButttton(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtButttton(s,data);
        s.push(top);
    }

}
