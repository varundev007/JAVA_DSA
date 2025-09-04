package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _15_reverse_a_number {
    public static void main(String[] args) {
        int num = 4356;
        // 6534
        reverseNum(0, num);
    }
    public static void reverseNum(int sum , int num){
        if( num == 0){
            System.out.println(sum);
            return;
        }
        sum = sum*10 + num %10;
        reverseNum(sum, num/10);
    }
}

