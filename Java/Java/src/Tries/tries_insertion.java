package Tries;

public class tries_insertion {
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        //Search

        for(int i = 0 ; i< words.length ; i++){
            insert(words[i]);
        }
        String key = "thee";
        System.out.println(isExist(key));
    }
    static class Node{
        Node children[]=new Node[26];
        boolean EndOfWord= false;
        Node(){
            for(int i=0; i<26; i++){
                children[i]= null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String words ){//O(L)
        Node curr = root;
        for(int level=0 ; level< words.length() ; level++){
            int idx=words.charAt(level) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr=curr.children[idx];
        }
        curr.EndOfWord=true;
    }
    public static boolean isExist(String key){
        Node curr = root;
        for(int level = 0 ; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.EndOfWord==true;
    }
}
