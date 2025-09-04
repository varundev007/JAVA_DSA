package BinarySearchTree;

public class sizeOfBinaryTreeInBT {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info{
        boolean isValid;
        int size,min,max;
        public info(boolean isValid,int size,int max,int min){
            this.isValid=isValid;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBST=0;
    public static info largestBST(node root){
        if(root==null){
            return new info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        info leftInfo=largestBST(root.left);
        info rightInfo=largestBST(root.right);
        int size= leftInfo.size+rightInfo.size+1;
        int min= Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max= Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        //Validate
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new info(false,size,min,max );
        }
        if(leftInfo.isValid && rightInfo.isValid){
            maxBST=Math.max(maxBST,size);
            return  new info(true,size,min,max);
        }
        return new info(false,size,min,max);
    }

    public static void main(String[] args) {
//
//                50
//              /    \
//             30      60
//           /  \     /  \
//          5    20  45   70
//                        /  \
//                       65   80
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);
        root.right=new node(60);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);
        info infor=largestBST(root);
        System.out.println("Size of Largest BST of a BT-"+maxBST);
    }
}
