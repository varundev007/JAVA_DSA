package BinaryTree;

public class Subtrees {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
//                  1
//                /    \
//               2       3
//              / \     /  \
//             4   5   6    7
        node root=new node(1);
        root.left=new node(2);
        root.right=new node (3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node (6);
        root.right.right=new node (7);

//                 2
//               /   \
//              4     5
        node subRoot=new node(2);
        subRoot.left=new node(4);
        subRoot.right=new node (5);
        System.out.println(isSubtree(root,subRoot));
    }
    public static String preOrder(node roots){
        if(roots==null){
            return "NULL";
        }
        StringBuilder sb=new StringBuilder("");
        sb.append(roots.data);
        sb.append(preOrder(roots.left));
        sb.append(preOrder(roots.left));
        return sb.toString();
    }
    public static boolean isSubtree(node root,node subRoot){
        String fullTree= preOrder(root);
        String subTree=preOrder(subRoot);
        return fullTree.contains(subTree);
    }
}
