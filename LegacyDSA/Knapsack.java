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
class knapsack0 {
    
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        
        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weights[i - 1] <= w)
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        
        // Store the result of Knapsack
        int result = dp[n][capacity];
        
        // Find the items that were included in the knapsack
        System.out.println("Selected items:");
        int w = capacity;
        for (int i = n; i > 0 && result > 0; i--) {
            if (result != dp[i - 1][w]) {
                System.out.println("Item " + i + " (Weight: " + weights[i - 1] + ", Value: " + values[i - 1] + ")");
                result -= values[i - 1];
                w -= weights[i - 1];
            }
        }
        
        // Return the maximum value we can get
        return dp[n][capacity];
    }
    
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        
        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}