package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _20_array_Manupulation {
    public static void main(String[] args) {
        String[] input={"Sunday","Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
                // output= {"Sun", "Mon","Tue", "Wed", "Thu", "Fri", "Sat"}

        printResult(input);
    }
    public static void printResult( String[] input){
        String[] output = new String[input.length];
        for(int i = 0 ; i < input.length ; i++){
            output[i] = input[i].substring(0,3);
        }
        System.out.println(Arrays.toString(output));
    }
}
