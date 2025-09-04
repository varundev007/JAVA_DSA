package _5_BackTracking;

import java.util.ArrayList;

public class _3_MazeWithDaigonal {
    public static void main(String[] args) {
        findDirection("",3,3);
        System.out.println(findDirectionReturn("",3,3));
    }
    public static void findDirection(String p, int r, int c ){
        if(c == 1  && r==1){
            System.out.println(p);
            return;

        }
        if(r>1){
            findDirection(p+ 'v',r-1,c);
        }
        if(c>1){
            findDirection(p+'h',r, c-1);

        }
        if (c>1 && r>1){
            findDirection(p+'d',r-1,c-1);
        }
    }

    public static ArrayList<String> findDirectionReturn(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(findDirectionReturn(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(findDirectionReturn(p+"R",r,c-1));
        }
        if (r>1 && c>1){
            list.addAll(findDirectionReturn(p+"d",r-1,c-1));
        }
        return list;
    }
}
