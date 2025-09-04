package Striver_1_Arrays;

public class _14_mojorityElement_MooresAlgo_aoptimised {
    public static void main(String[] args) {
        int arr[] = {2,2,1,3,1,3,3,3,3,3,3,3,3,3,3,3,1,3,1,1};
        int count =0;
        int element=0;
        for (int i = 0 ; i< arr.length; i++){
            if (count == 0){
                count =1;
                element = arr[i];
            } else if(element == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        int count1 = 0;
        for (int i =0 ; i< arr.length; i++){
            if (element == arr[i]){
                count1++;
            }
        }
        if(count1> arr.length/2){
            System.out.println(element);
        }

    }
}
