package BinaryTree;

public class HeightOfTheTree {
    static class node{
        int data;
        node left,right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info{
        int daim;
        int ht;
        public info(int daim,int ht){
            this.daim=daim;
            this.ht=ht;
        }
    }
    public static info diameter(node root){
        if(root==null){
            return new info(0,0);
        }
        info leftinfo= diameter(root.left);
        info rightinfo=diameter(root.right);
        int diam=Math.max(leftinfo.ht+rightinfo.ht+1 , Math.max(leftinfo.daim,rightinfo.daim));
        int ht=Math.max(leftinfo.ht, rightinfo.ht)+1;
        return new info(diam,ht);
    }
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int hl=height(root.left);
        int hr=height(root.right);
        return Math.max(hl,hr)+1;
    }
    public static int countNode(node root){
        if(root==null){
            return 0;
        }
        int l=countNode(root.left);
        int r=countNode(root.right);
        return l+r+1;
    }
    public static int sumOfNodes(node root){
        if(root==null){
            return 0;
        }
        int sumOfLeft= sumOfNodes(root.left);
        int sumOfRight=sumOfNodes(root.right);
        return sumOfLeft + sumOfRight + root.data;
    }
    public static int daimeter(node root){
        if(root==null){
            return 0;
        }
        int leftD=daimeter(root.left);
        int leftH=height(root.left);
        int rightD=daimeter(root.right);
        int rightH=height(root.right);
        int selfD= leftH+rightH+1;
        return Math.max(selfD, Math.max(leftD,rightD));
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \ / \
             4  5 6  7
        */
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
       // System.out.println( height(root));
      //  System.out.println(countNode(root));
      //  System.out.println(sumOfNodes(root));
       // System.out.println(daimeter(root));
        System.out.println(diameter(root).daim);

    }
}
