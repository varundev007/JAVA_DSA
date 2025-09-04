package DPpart_5MatrixChainMultiplication;

public class _1MCMrecursive {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        //FIND MINIMUM COST
        int n = arr.length;
        System.out.println(minCost(arr,1,n-1));
    }
    public static int minCost(int arr[], int i, int j){
        int ans = Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        else{
            for(int k=i ; k<=j-1;k++){
                ans =Math.min(ans,  minCost(arr,i,k) + minCost(arr,k+1,j) + arr[i-1]*arr[k]*arr[j]) ;
            }
        }
        return ans;
    }
}
