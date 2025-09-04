package StringUsingRecussion;

public class MazeBacktracking {
    public static void main(String[] args) {
        boolean [][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}};
                AllPath("",board,0,0);
    }
    public static void AllPath(String p,boolean [][] maze,int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            AllPath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            AllPath(p+"R",maze,r,c+1);
        }
        if(r>0){
            AllPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            AllPath(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;

    }

}

