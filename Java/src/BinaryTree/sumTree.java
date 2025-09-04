package BinaryTree;

public class sumTree {
    static class node{
        int data;
        node left,right;
        public  node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sumTreee(node root){
        if(root==null){
            return 0;
        }
        int leftchild=sumTreee(root.left);
        int righchlid= sumTreee(root.right);
        int data= root.data;
        int newLeft= root.left==null ? 0 :root.left.data;
        int newright= root.right==null? 0 :root.right.data;
        root.data=leftchild+newLeft+righchlid+newright;
        return data;
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
       sumTreee(root);
       preorder(root);
    }
}
