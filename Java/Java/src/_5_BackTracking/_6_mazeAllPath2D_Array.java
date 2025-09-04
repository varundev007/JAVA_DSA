package _5_BackTracking;

import java.util.Arrays;

public class _6_mazeAllPath2D_Array {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];
        allPaths("", board,path,0,0, 1);
    }
    public static void allPaths(String p, boolean[][] board, int[][] path, int r,  int c, int step){//step - level of recurssion
        if(r == board.length - 1  &&  c == board[0].length - 1){
            path[r][c]= step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(board[r][c] == false){
            return;
        }
        board[r][c] = false;
        path[r][c] = step;

        if( r < board.length-1){
            allPaths(p+'v', board , path, r+1, c, step+1);
        }

        if( c < board[0].length-1){
            allPaths(p+'h', board, path, r, c+1 ,step+1);
        }
//        if( r < board.length-1 && c < board[0].length-1){
//            allPaths(p+'d', board , path,r+1 , c+1, step+1);
//        }
        if( r > 0 ) {
            allPaths(p+'u', board ,path, r-1, c,step+1);
        }
        if( c > 0){
            allPaths(p+'l',board ,path,  r , c-1, step+1);
        }
        board[r][c] = true;
        path[r][c]=0;
    }

}
