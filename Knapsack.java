public class Knapsack {
    // Function to solve the 0-1 Knapsack problem using DP
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {// Include the item or exclude it
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {// Exclude the item
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4};
        int[] values = {10, 15, 40, 50};
        int capacity = 6;
        System.out.println("Maximum value in knapsack = " + knapsack(weights, values, capacity));
    }
}