import java.util.ArrayList;
import java.util.List;

public class MyDP {
    public static long fibo(long n, long dp[]) {
        if (n == 0 || n == 1) return 1;
        if (dp[(int)n] != 0) return dp[(int)n];
        return dp[(int)n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }
    public static int rob(int arr[],int idx,int dp[]){
        //you've to rob houses and get maximum profit but you can't rob 2 consecutive houses
        if(idx==arr.length-1)return arr[arr.length-1];
        if(idx>=arr.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int taken=arr[idx]+rob(arr,idx+2,dp);
        int skipped=rob(arr,idx+1,dp);
    return dp[idx]=Math.max(taken,skipped);
    }
    public static int noOfWays(String no,int idx,int dp[]){
        if(idx<=0)return 1;
        if(dp[idx]!=-1)return dp[idx];
        int notCombine=0;
        if(no.charAt(idx)!='0')notCombine=noOfWays(no,idx-1,dp);
        int combine=0;
        if(no.charAt(idx-1)=='1'||no.charAt(idx-1)=='2'||no.charAt(idx)<='6')
                combine=noOfWays(no,idx-2,dp);
    return dp[idx]=combine+notCombine;
    }
    public static void fiboTabulation(int n) {
        if(n==0||n==1){
            System.out.print(n+" ");
            return;
        }
        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
       System.out.print(dp[n]+" "); 
    }
    public static void fiboTabulationOPtimized(int n) {
        int prev=1,prev2=0,current=1;
        for(int i=1;i<=n;i++){
            current=prev+prev2;
            prev=prev2;
            prev2=current;
        }
        System.out.println(current);
    }
    public static int coinChange(int indx,int arr[],int amount) {
        if(indx==arr.length-1){
            if(amount%arr[indx]==0)return 1;
            else return 0;
        }
        int pick=(arr[indx]<=amount)?coinChange(indx,arr,amount-arr[indx]):0;
        int notPick=coinChange(indx+1,arr,amount);
    return pick+notPick;
    }
    public static int coinChangeMemoization(int indx,int arr[],int amount,int dp[][]) {
        if(indx==arr.length-1){
            if(amount%arr[indx]==0)return 1;
            else return 0;
        }
        if(dp[indx][amount]!=-1)return dp[indx][amount];
        int pick=(arr[indx]<=amount)?coinChange(indx,arr,amount-arr[indx]):0;
        int notPick=coinChange(indx+1,arr,amount);
    return dp[indx][amount]=pick+notPick;
    }
    public static void coinChangeTabulation(int coins[],int amount){
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=(i%coins[0]==0)?1:0;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                int pick=(coins[i]<=j)?dp[i][j-coins[i]]:0;
                int notPick=dp[i-1][j];
                dp[i][j]=pick+notPick;
            }
        }
        System.out.println(dp[dp.length-1][amount]);
    }
    public static void coinChangeOptimized(int[] coins,int amount) {
        int prev[]=new int[amount+1];
        int current[]=new int[amount+1];
        for(int i=0;i<prev.length;i++){
            prev[i]=(i%coins[0]==0)?1:0;
        }
        for(int i=1;i<coins.length;i++){
            for(int j=0;j<prev.length;j++){
                int pick=(coins[i]<=j)?current[j-coins[i]]:0;
                int notPick=prev[j];
                current[j]=pick+notPick;
            }
            prev=current;
        }
        System.out.println(prev[amount]);
    }
    public static int knapsack01(int indx,int capacity,int profit[],int weights[]) {
        if(indx==profit.length-1){
            if(weights[indx]<=capacity)return profit[indx];
            else return 0;
        }
        int pick=(weights[indx]<=capacity)?profit[indx]+knapsack01(indx+1, capacity-weights[indx], profit, weights):0;
        int notPick=knapsack01(indx+1, capacity, profit, weights);
    return Math.max(pick,notPick);
    }
    public static int knapsack01Memoization(int dp[][],int indx,int capacity,int profit[],int weights[]) {
        if(indx==profit.length-1){
            if(weights[indx]<=capacity)return profit[indx];
            else return 0;
        }
        if(dp[indx][capacity]!=-1)return dp[indx][capacity];
        int pick=(weights[indx]<=capacity)?profit[indx]+knapsack01Memoization(dp,indx+1, capacity-weights[indx], profit, weights):0;
        int notPick=knapsack01Memoization(dp,indx+1, capacity, profit, weights);
    return dp[indx][capacity]=Math.max(pick,notPick);
    }
    public static void knapsack01Tabulation(int capacity, int weights[], int profit[]) {
        int n = profit.length;
        int dp[][] = new int[n][capacity + 1];
        for (int j = 0; j <= capacity; j++) {
            dp[0][j] = (weights[0] <= j) ? profit[0] : 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= capacity; j++) {
                int notPick = dp[i - 1][j]; 
                int pick = (weights[i] <= j) ? profit[i] + dp[i - 1][j - weights[i]] : 0; // Value if the item is picked
                dp[i][j] = Math.max(pick, notPick);
            }
        }
        System.out.println(dp[n - 1][capacity]);
    }
    public static void knapsack01Optimized(int capacity, int profit[], int weights[]) {
        int prev[] = new int[capacity + 1];
        for (int j = 0; j <= capacity; j++) {
            prev[j] = (weights[0] <= j) ? profit[0] : 0;
        }
        for (int i = 1; i < profit.length; i++) {
            int curr[] = new int[capacity + 1];
            for (int j = 0; j <= capacity; j++) {
                int pick = (weights[i] <= j) ? profit[i] + prev[j - weights[i]] : 0;
                int notPick = prev[j];
                curr[j] = Math.max(pick, notPick);
            }
            prev = curr;
        }
        System.out.println(prev[capacity]);
    }
    public static int frogJump(int heights[],int indx){
        if(indx==heights.length-1)return 0;
        int jump1=Math.abs(heights[indx]-heights[indx+1])+frogJump(heights, indx+1);
        int jump2=(indx<heights.length-2)?Math.abs(heights[indx]-heights[indx+2])+frogJump(heights, indx+2):Integer.MAX_VALUE;
    return Math.min(jump1,jump2);
    }
    public static int nStones(int i,int heights[],int k){
        if(i==heights.length-1)return 0;
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(i+j<heights.length){
                int jump=Math.abs(heights[i]-heights[i+j])+nStones(i+j,heights,k);
                min=Math.min(min, jump);
            }
        }
    return min;
    }
    public static void nStonesTabulation(int heights[],int k){
        int dp[]=new int[heights.length];
        dp[0]=0;
        for(int i=1;i<heights.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=Math.abs(heights[i]-heights[i-j])+dp[i-j];
                    min=Math.min(min, jump);
                }
            }
            dp[i]=min;
        }
        System.out.println(dp[heights.length-1]);
    }
    public static void nStonesOptimized(int heights[],int k){
        List<Integer> dp=new ArrayList<>();//optimized because space O(k);
        dp.add(0);
        for(int i=1;i<heights.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int jump=Math.abs(heights[i]-heights[i-j])+dp.get(dp.size()-j);
                    min=Math.min(min, jump);
                }
            }
            if(dp.size()<k)dp.add(min);
            else{
                dp.remove(0);
                dp.add(min);
            }
        }
        System.out.println(dp.get(k-1));
    }
    public static int longestCommonSubsequence(int i,int j,String str,String str2){
        if(i==str.length()||j==str2.length())return 0;
        if(str.charAt(i)==str2.charAt(j))
            return 1+ longestCommonSubsequence(i+1, j+1, str, str2);
    return Math.max(longestCommonSubsequence(i,j+1,str,str2),longestCommonSubsequence(i+1,j,str,str2));
    }
    public static int longestCommonSubsequenceMemoization(int dp[][],int i,int j,String str,String str2){
        if(i==str.length()||j==str2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(str.charAt(i)==str2.charAt(j))
            return dp[i][j]=1+ longestCommonSubsequenceMemoization(dp,i+1, j+1, str, str2);
    return dp[i][j]=Math.max(longestCommonSubsequenceMemoization(dp,i,j+1,str,str2),longestCommonSubsequenceMemoization(dp,i+1,j,str,str2));
    }
    public static int longestCommonSubsequenceOptimized(String str, String str2) {
        int dp[][] = new int[str.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str.charAt(i - 1) == str2.charAt(j - 1))dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
    return (dp[str.length()][str2.length()]);
    }
    public static void makeBothStringEqual(String str,String str2){
        //you need to make str1 equl to str2 minimum number of operations(Insertion,deletion)
        int lcs=longestCommonSubsequenceOptimized(str,str2);
        System.out.println(Math.max(str.length()-lcs,str2.length()-lcs));
    }
    public static int editDistance(String str,String str2,int i,int j){
        if(i==0)return j+1;
        if(j==0)return i+1;
        if(str.charAt(i)==str2.charAt(j))return editDistance(str, str2, i-1, j-1);
        int replace=1+editDistance(str, str2, i-1, j-1);    
        int insert=1+editDistance(str, str2, i, j-1);    
        int delete=1+editDistance(str, str2, i-1, j);    
    return Math.min(replace, Math.min(insert,delete));
    }
    public static int matrixChaining(int[] args,int i,int j) {
        if(i==j)return 0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<j;k++){
            int left=matrixChaining(args, i, k);
            int right=matrixChaining(args, k+1, j);
            int cost=args[i-1]*args[k]*args[j];
            min=Math.min(min, left+right+cost);
        }
    return min;
    }
    public static int matrixChainingMemoisation(int[] args,int i,int j,int dp[][]) {
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int left=matrixChainingMemoisation(args, i, k,dp);
            int right=matrixChainingMemoisation(args, k+1, j,dp);
            int cost=args[i-1]*args[k]*args[j];
            min=Math.min(min, left+right+cost);
        }
    return dp[i][j]=min;
    }
    public static void matrixChainingTabulation(int[] arr) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        System.out.println(dp[1][n - 1]);
    }
    public static void catalanNumber(int n) {
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
        catalanNumber(5);
    }
}