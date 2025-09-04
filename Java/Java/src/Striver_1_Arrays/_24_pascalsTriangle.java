package Striver_1_Arrays;
// 1        1
// 2       1 1
// 3      1 2 1
// 4     1 3 3 1
// 5    1 4 6 4 1
// 6  1 5 10 10 5 1

//      1 2 3 4 5
//VARIATION1-find value at R,C , formula - (r-1)C(c-1)

//Variation2
//Print any row suppose 6=> 1 5 10 10 5 1
//  5= 5/1 ,  10= 5*4/1*2 , 10=5*4*3/1*2*3 , 5 = 5 4 3 2/1 2 3 4  , 1= 5 4 3 2 1/1 2 3 4 5

//Variation3
//Print complete complete triange

public class _24_pascalsTriangle {
    public static void main(String[] args) {
        //variavtion1
        int r=5;
        int c=3;
        findValue(r-1, c-1);
        //variation2
       // O(n)
       // O(1)
        int n=6;
        printRow(n-1);
        //Variation3
        //O(n2)
        int row=6;
        printTriangle(row);
    }
    public static void findValue(int r, int c){
        //4c2 = 4!/2!2! = 4*3/2*1
        int val=1;
        for (int  i = 0 ; i< c ; i++){
            val = val *(r- i);
            val= val /(i+1);
        }
        System.out.println(val);
    }
    public static void printRow(int r){
      //  ArrayList<Integer> arr = new ArrayList<>();
        System.out.print(1+ " ");
        int num=1;
        for (int i =0; i<r ; i++){
            num = num * ( r-i );
            num = num / ( i+1 );
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    public static void printTriangle(int row){
        for (int i = 0; i<row; i++){
            printRow(i);
        }
    }
}
