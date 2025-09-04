package Stacks;

import java.util.*;

public class removeOutermostParaenthasis {
    public static void main(String[] args) {
        String s="()((()()))";
        System.out.println(remove(s));

    }
    public static String remove(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();


    }
}
