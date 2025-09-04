package _5_BackTracking;

public class _7_N_QUEEN {
    public static void main(String[] args) {
        int n =4;
        boolean board[][] = new boolean[n][n];
        queen(board, 0);

    }
    public static int queen(boolean board[][], int r){
        if(r== board.length){
            display(board);
            return 1;
        }
        int count =0;
        for(int c = 0 ; c < board.length ;c++){
            if(isSafe(board,r,c) == true){
                board[r][c]= true;
                count = count + queen(board, r+1);
                board[r][c] =false;
            }
        }
        return count;
    }

    public static void display(boolean board[][]){
        for(boolean[] row : board){
            for (boolean element: row) {
                if (element == true) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isSafe(boolean board[][], int r, int c){
        //verticle
        for (int i = 0 ; i< r ; i++){
            if (board[i][c]){
                return false;
            }
        }
        //daigonal left
        int maxLeft = Math.min(r,c);
        for (int i=0 ; i<maxLeft ; i++){
            if(board[r-i][c-i] == true){
                return false;
            }
        }
        //daigonal right
        int maxRight =  Math.min(r,board.length-c-1);
        for(int i=0; i< maxRight ;i++){
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
