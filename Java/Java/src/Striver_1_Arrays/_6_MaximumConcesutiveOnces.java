package Striver_1_Arrays;
//{1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1}
//ans=4
public class _6_MaximumConcesutiveOnces {
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1};
        int maxCount= Integer.MIN_VALUE;
        int count= 0;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] == 1){
                count++;
                maxCount=Math.max(maxCount, count);
            }
            else {
                count=0;
            }
        }
        System.out.println(maxCount);
    }
}
