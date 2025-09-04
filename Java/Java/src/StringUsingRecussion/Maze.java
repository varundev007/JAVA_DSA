package StringUsingRecussion;

public class Maze {
    public static void main(String[] args) {
     //   System.out.println(mazeCount(3,3));
       // mazeCombo("",3,3);//to print the path of the maze
      //  DiagonalPath("",3,3);
        pathWithRestriction("",0,0);
    }
    public static  int mazeCount(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int right= mazeCount(r,c-1);
        int down= mazeCount(r-1,c);
        return right+down;
    }
    public static void mazeCombo(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazeCombo(p+"V",r-1,c);
        }
        if(c>1){
            mazeCombo(p+"H",r,c-1);
        }
    }
    public static void DiagonalPath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            DiagonalPath(p+"V",r-1,c);
        }
        if(c>1){
            DiagonalPath(p+"H",r,c-1);
        }
        if(r>1 && c>1 && r==c) {

            DiagonalPath(p+"D",r-1,c-1);
        }
    }
    public  static  void pathWithRestriction(String p,int r, int c){
        if(r==2 && c==2){
            System.out.println(p);
        }
        if(r==1 && c==1){
            return;
        }
        if(r<3){
            pathWithRestriction(p+"V",r+1,c);
        }
        if(c<3){
            pathWithRestriction(p+"H",r,c+1);
        }
        if(r<3 && c<3 && r==c) {

            pathWithRestriction(p+"D",r+1,c+1);
        }

    }
}
