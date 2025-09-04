package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _19_print_parttern_part2 {
    public static void main(String[] args) {
        /*

        *
        ***
        *****
        *******
        *********

         */
        int n =5 ;
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1 ; i<= n ; i++){
            for (int j = 1 ; j <=2 * i -1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
