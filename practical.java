public class practical {
    public static int getMaxValue(int weights[],int profit[],int capacity) {
        int n=weights.length;//or you can use profit.length which basically means youre using how many elements are there to be choosen from
        int dp[][]=new int[n+1][capacity+1];
        for (int i=1;i<=n;i++) {
            for(int w=0;w<=capacity;w++){
                if (weights[i-1]<=w) {//include the item or exclude it
                    dp[i][w]=Math.max(profit[i-1]+dp[i-1][w-weights[i-1]],dp[i-1][w]);
                }else{//exclude
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
    return dp[n][capacity];
    }       
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4};
        int[] profit = {10, 15, 40, 50};
        int capacity = 6;
        System.out.println("Maximum value in knapsack = " + getMaxValue(weights, profit, capacity));
    }
}