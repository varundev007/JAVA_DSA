package BinarySearchTree;

public class SortedArrayToBalBST {
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
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static node createBalBST(int[] arr,int s,int e){
        if (s>e){
            return null;
        }
        int mid=(s+e)/2;
        node root=new node(arr[mid]);
        root.left=createBalBST(arr,s,mid-1);
        root.right=createBalBST(arr,mid+1,e);
        return root;
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,8,10,11,12};
        node root = createBalBST(arr,0, arr.length-1);
        preOrder(root);
    }
}
