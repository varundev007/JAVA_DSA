package Tries;

public class prefixProblem {
    public static void main(String[] args) {
        String arr[]={"zebra","dog", "duck","dove"};
        //answer {"z", "dog", "duck", "dove"}
        for(int i = 0 ; i< arr.length ; i++){
            insert(arr[i]);
        }
        root.freq=-1;
        String ans="";
        findPrefix(root, ans);
    }
    static class Node{
        Node chilred[]=new Node[26];
        boolean endOfWord = false;
        int freq;
        public Node(){
            for (int i = 0 ; i < 26 ; i ++){
                chilred[i]= null;
            }
            freq=1;
        }
    }
    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        for (int i = 0 ; i < str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(curr.chilred[idx] == null){
                curr.chilred[idx] = new Node();
            }
            else{
                curr.chilred[idx].freq++;
            }
            curr=curr.chilred[idx];
        }
        curr.endOfWord = true;
    }
    public static void findPrefix(Node root, String ans){
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        if(root==null){
            return;
        }
        for (int i= 0 ; i < 26 ; i++){
            if(root.chilred[i] != null){
                findPrefix(root.chilred[i], ans+(char)(i+'a'));
            }
        }
    }
}
