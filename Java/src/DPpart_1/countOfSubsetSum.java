package DPpart_1;
// FIND NUMBER OF SUB SET IN AN ARRAY
public class countOfSubsetSum {
    public static void main(String[] args) {
        int arr[]={ 2,3,5,6,8,10};
        int sum= 10;//ans =3
        int n= arr.length;
        System.out.println(countSubset(arr,sum,n));
    }
    public static int countSubset(int arr[], int sum, int n){
        int dp[][]= new int[n+1][sum+1];
        for(int i=0 ; i<n+1; i++){
            dp[i][0]=1;
        }
        for(int j= 1; j<sum+1; j++){
            dp[0][j]=0;
        }
        for(int i=1; i< n+1; i++){
            for(int j =1; j<sum +1; j++){
                if(arr[i-1]<=j){
                    dp[i][j]= dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] =dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
