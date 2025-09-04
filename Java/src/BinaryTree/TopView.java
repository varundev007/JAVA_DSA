package BinaryTree;
import java.util.*;
public class TopView {
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
        int hd;
        node nod;
        public info(node nod,int hd){
            this.nod=nod;
            this.hd=hd;
        }
    }
    public static void main(String[] args) {
        //           1
//                /    \
//               2       3
//              / \     /  \
//             4   5   6    7
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        topView(root);
    }
    public static void topView(node root){
        Queue<info> q= new LinkedList<>();
        HashMap<Integer, node> map=new HashMap<>();
        int min=0, max=0;
        q.add(new info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info curr= q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.nod);
                }
                if(curr.nod.left!=null){
                    q.add(new info(curr.nod.left,curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.nod.right!=null){
                    q.add(new info(curr.nod.right,curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

}
