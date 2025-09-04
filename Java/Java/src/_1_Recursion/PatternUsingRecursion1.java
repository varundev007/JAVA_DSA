package _1_Recursion;

public class PatternUsingRecursion1 {
    public static void main(String[] args) {
        triangle(4,0);

    }
    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.printf("*");
            triangle(r,c+1);
        }else{
        System.out.println();
        triangle(r-1,0);}

    }
}
