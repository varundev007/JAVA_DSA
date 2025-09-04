package BinarySearchTree;

import java.util.ArrayList;

public class BuiltBST {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static node insert(node root,int value){
        if(root==null){
            root=new node(value);
            return root;
        }
        if(root.data>value){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return  root;
    }
    //inorder traversal
    public static void inOrder(node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    //SEARCHING A KEY
    public static boolean seacrh(node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return seacrh(root.left,key);
        }
        return seacrh(root.right,key);
    }
    //DELETION OF A NODE
    public static node delete(node root,int val){
        if(val>root.data){
            root.right=delete(root.right,val);
        }
        else if (val< root.data){
            root.left=delete(root.left, val);
        }
        else{//val=data
            //case1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 single leaf exist
            if(root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            //case-3 both right left exists
            node IS=inoderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static node inoderSuccessor(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printInRange(node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printInRange(root.right,k1,k2);
        }
        else{
            printInRange(root.left,k1,k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.print("Null");
        System.out.println();

    }

    public static void printRoot2leaf(node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right ==null){
            printPath(path);
        }

        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
        path.remove(path.size()-1);

    }
    public static boolean isValid(node root, node min, node max){
        if(root==null){
            return true;
        }
        else if(min!=null && root.data<= min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }
    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static node createMirror(node root){
        if(root==null){
            return null;
        }
        node LeftMirror=createMirror(root.left);
        node RightMirror=createMirror(root.right);
        root.left=RightMirror;
        root.right=LeftMirror;
        return root;
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        node root=null;
        for(int i = 0; i< values.length;i++){
            root=insert(root,values[i]);
        }
//        inOrder(root);
//        if(seacrh(root,10)){
//            System.out.println("Found");
//        }
//        else {
//            System.out.println("Not Found");
//        }
//       root=delete(root,5);
//        inOrder(root);
//        System.out.println();
//        printInRange(root,5,12);
//        ArrayList<Integer> path =new ArrayList<>();
//        printRoot2leaf(root,path);
//        if(isValid(root,null,null)){
//            System.out.println("Valid");
//        }
//        else{
//            System.out.println("Invalid");
//        }
        root=createMirror(root);
      //  preOrder(root);
        inOrder(root);

    }
}
