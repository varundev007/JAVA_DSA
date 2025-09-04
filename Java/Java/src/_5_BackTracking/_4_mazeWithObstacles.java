package _5_BackTracking;

public class _4_mazeWithObstacles {
    public static void main(String[] args) {
        boolean board[][] = {
                {true, true,true},
                {true, false,true},
                {true, true, true}
        };
        findPath("",board,0,0);

    }
    public static void findPath(String p, boolean[][] board, int r, int c){
      if (r == board.length-1 && c == board[0].length-1){
          System.out.println(p);
          return;
      }
      if (board[r][c] == false){
          return;
      }
      if (r< board.length-1 ){
          findPath(p+"D", board,r+1,c);
      }
      if (c<board[0].length-1){
          findPath(p+"R",board, r,c+1);
      }
    }
}
