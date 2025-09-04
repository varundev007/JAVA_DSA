package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _24_secondLargestInArray {
    public static void main(String[] args) {
        int arr[] = {23,35,50,62,7,26,62};
        System.out.println(findSecondLargest(arr));;
    }
    public static int findSecondLargest(int arr[]){
        int largest= arr[0];
        int secondLargest= Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }
        }
        return  secondLargest;
    }
}
