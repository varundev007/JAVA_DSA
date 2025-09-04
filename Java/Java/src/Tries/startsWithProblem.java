package Tries;

public class startsWithProblem {
    public static void main(String[] args) {
        String words[]= {"apple", "app", "mango", "man", "woman"};
        for(int i = 0; i < words.length ; i++){
            insert(words[i]);
        }
        String word1= "app";//true
        String word2= "women";//false
        System.out.println(isPrefixOfAny(word1));
        System.out.println(isPrefixOfAny(word2));
    }
    static class Node{
        Node children[] =new Node[26];
        boolean endOfWord= false;
        public Node(){
            for(int i = 0 ; i < 26 ; i++){
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String str){
        Node curr= root;
        for(int i =  0 ; i< str.length() ;  i++){
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }
    public static boolean isPrefixOfAny(String word){
        Node curr = root;
        for(int i=0 ; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
}
