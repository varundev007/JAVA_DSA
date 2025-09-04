package Tries;
// UNIQUE SUBSTRING = ALL UNIQUE PREFIXS OF ALL SUFFIX  =  ALL UNIQUE SUFFIXS OF ALL PREFIXS
// UNIQUE PREFIXS = COUNT OF NODE OF THE TRIE
// LOGIC
// 1-> FIND ALL SUFIX
// 2-> CREATE TREIS FOR THEM
// 3-> FIND TOTAL NUMBER OF NODES = TOTAL NUMBER OF UNIQUE SUBSTRINGS
public class countUniqueSubstring {
    public static void main(String[] args) {
        String str = "ababa"; //ans- 10
        //INSERTING SUFFIX IN TRIES
        for(int i=0 ; i< str.length() ; i++){
            insert(str.substring(i));
        }
        System.out.print("Count of unique sub strings are- ");
        System.out.println(countNode(root));;
    }
    static class Node{
        Node children[]= new Node[26];
        boolean endOfWord= false;
        public Node(){
            for(int i = 0 ; i< 26 ; i++){
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String str){
        Node curr=root;
        for(int i=0 ; i<str.length(); i++){
            int idx = str.charAt(i)- 'a';
            if(curr.children[idx]== null){
                curr.children[idx]= new Node();
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }
    public static int countNode(Node root){
        Node curr = root;
        int count=0;
        if (root==null){
            return 0;
        }
        for(int i= 0; i< 26 ; i++ ){
           if(curr.children[i] != null){
               count = count + countNode(curr.children[i]);
           }
        }
        return count+1;
    }
}

