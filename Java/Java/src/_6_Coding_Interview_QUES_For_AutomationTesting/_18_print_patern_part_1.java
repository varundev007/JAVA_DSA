package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _18_print_patern_part_1 {
    public static void main(String[] args) {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        int n =5 ;
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1 ; i<= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
