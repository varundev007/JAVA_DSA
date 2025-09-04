package BinarySearchTree;

import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void getInOrder(node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInOrder(root.left,inorder);
        inorder.add(root.data);
        getInOrder(root.right,inorder);
    }
     public static node createBalBST(ArrayList<Integer> indorder,int s,int e){
        if (s>e){
            return null;
        }
        int mid=(s+e)/2;
        node root=new node(indorder.get(mid));
        root.left=createBalBST(indorder,s,mid-1);
        root.right=createBalBST(indorder,mid+1,e);
        return root;
    }
    public static node converToBalBST(node root){
        //inorder sequence
        ArrayList<Integer> inorder=new ArrayList<>();
        getInOrder(root,inorder);
        //inorder to balamced bst
        root=createBalBST(inorder,0,inorder.size()-1);
        return  root;
    }
    public static void main(String[] args) {
//                      8
//                     / \
//                    6   10
//                   /     \
//                  5       11
//                 /         \
//                3           12
        node root= new node(8);
        root.left=new node(6);
        root.left.left=new node(5);
        root.left.left.left=new node(3);

        root.right=new node(10);
        root.right.right= new node(11);
        root.right.right.right=new node(12);

        root=converToBalBST(root);
        preOrder(root);




    }
}
