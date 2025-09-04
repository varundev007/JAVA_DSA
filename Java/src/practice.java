import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int nums[]= {6,6,6,6,1,1,1,2,3,4,5,5};
        Arrays.sort(nums);
        int x = nums[nums.length-1];
        int freq[] = new int[x+1];
        for(int i=0; i<freq.length; i++){
            int feq= 0;
            for(int j=0; j< nums.length; j++){
                if(i==nums[j]){
                    feq++;
                }
            }
            freq[i]= feq;
        }
        for(int i=0 ; i< freq.length; i++){
            System.out.println(freq[i]);
        }
    }
}
