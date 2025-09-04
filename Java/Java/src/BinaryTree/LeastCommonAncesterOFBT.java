package BinaryTree;

import java.util.ArrayList;

public class LeastCommonAncesterOFBT {
    static class node{
        int data;
        node left,right;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean getNode(node root, int n,ArrayList<node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean left=getNode(root.left,n,path);
        boolean right=getNode(root.right,n,path);
        if(left||right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static node lca(node root,int n1,int n2){
        ArrayList<node> path1=new ArrayList<>();
        ArrayList<node> path2=new ArrayList<>();
        getNode(root,n1,path1);
        getNode(root,n2,path2);
        int i=0;
        for(;i< path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        node lca=path1.get(i-1);
        return lca;
    }
    //approch2
    public static node lca2(node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 ||root.data==n2){
            return root;
        }
        node leftLca=lca2(root.left,n1,n2);
        node rightLca=lca2(root.right,n1,n2);
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return  root;//rightlca leftlca dono side kuch h mtlb
    }
    //Minimum distance between two nodes
    public static int minDist(node root,int n1,int n2){
        node lca =lca2(root, n1, n2);
        int dist1=lcaDist(root,n1);
        int dist2=lcaDist(root,n2);
        return dist2+dist1;
    }
    public static int lcaDist(node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right,n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        int n1=4,n2=7;
        //System.out.println(lca(root,n1,n2).data);
      //  System.out.println(lca2(root,n1,n2).data);
        System.out.println(minDist(root,n1,n2));
    }
}
