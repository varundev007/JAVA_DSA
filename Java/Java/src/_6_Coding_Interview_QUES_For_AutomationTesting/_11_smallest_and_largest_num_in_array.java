package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _11_smallest_and_largest_num_in_array {
    public static void main(String[] args) {
        int arr[] = {6,4,2,8,9,3};
        findLargest(arr);
    }
    public static void findLargest(int arr[]){
       int largest = arr[0];
       int smallest = arr[0];
       for(int i=1 ; i< arr.length ; i++){
           if(arr[i] > largest){
               largest= arr[i];
           } else if (arr[i] < smallest) {
               smallest = arr[i];
           }
       }
        System.out.println("Smallest and largest are - "+ smallest+ " , " +largest);
    }
}
