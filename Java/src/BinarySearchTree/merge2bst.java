package BinarySearchTree;

import java.util.ArrayList;

public class merge2bst {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.left=left;
            this.right= right;
        }
    }
    public static void inOrder(node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);
    }
    public static node createBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr.get(mid));
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    public static node mergeBSTs(node root1, node root2){
        //SORTING 1ST ARRAY
        ArrayList<Integer> arr1=new ArrayList<>();
        inOrder(root1, arr1);

        //SORTING 2ND ARRAY
        ArrayList<Integer> arr2= new ArrayList<>();
        inOrder(root2,arr2);

        //MERGING TWO SORTED ARRAY INTO SORTED ARRAY
        ArrayList<Integer> finalArr= new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBST(finalArr,0,finalArr.size()-1);
    }
    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
//               BST 1
//                2
//               / \
//              1   4
        node root1=new node(2);
        root1.left=new node(1);
        root1.right=new node(4);
//               BST 2
//                9
//               / \
//              3   12
        node root2=new node(9);
        root2.left=new node(3);
        root2.right=new node(12);
//                final answer
//                     3
//                   /   \
//                 1      9
//                  \    /  \
//                   2  4    12
        node root=mergeBSTs(root1,root2);
        preOrder(root);

    }
}
