package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        static class binaryTree{
            static int idx=-1;
            public static node builtTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1) {
                    return null;
                }
                node newNode= new node(nodes[idx]);
                newNode.left=builtTree(nodes);
                newNode.right=builtTree(nodes);
                return newNode;
            }
    }
    //Preorder traversal
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    //LEVEL ORDER TRAVERSAL
    public static void levelOrder(node root){
        if(root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        node root =tree.builtTree(nodes);
        //System.out.println(root.data);
//        System.out.println(root.left.data);
       // preorder(root);
        // inorder(root);
       // postorder(root);
        levelOrder(root);
    }
}
