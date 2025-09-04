package Stacks;

import java.util.Stack;

public class validParaString {
    public static void main(String[] args) {
        String s="(*)(";
        System.out.println(checkValidString(s));

    }
    public static boolean checkValidString(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> star= new Stack<>();
        for(int i =0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open.push(i);
            } else if (ch=='*') {
                star.push(i);
            }
            else{
                if(!open.isEmpty()){
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        while (!open.isEmpty()){
            if(star.empty()){
                return false;
            }
            else{
                if(open.peek()<star.peek()){
                    open.pop();
                    star.pop();
                }
                else
                    return false;
            }
        }
        return true;

    }
}
