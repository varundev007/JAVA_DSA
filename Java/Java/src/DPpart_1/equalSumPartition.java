package DPpart_1;
//To if an array contains j
public class equalSumPartition {
    public static void main(String[] args) {
        int arr[]={1,5,11,5};
        int sum =11;
        int n= arr.length;
        //sum of the array
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum=totalSum+arr[i];
        }
        System.out.println(isEqualPartition(arr,n,totalSum));
    }
    public static boolean targetSumSubset(int arr[], int n ,int sum){
        boolean dp[][]= new boolean[n+1][sum+1];
        for(int i=0; i< n+1 ; i++){
            dp[i][0]=true;
        }
        for(int i=1 ; i<n+1; i++){
            for(int j=0; j<sum+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static boolean isEqualPartition(int arr[],int n, int totalSum){
        if(totalSum % 2 != 0){
            return false;
        }
        else{
            return targetSumSubset(arr, n, totalSum/2);
        }
    }
}
