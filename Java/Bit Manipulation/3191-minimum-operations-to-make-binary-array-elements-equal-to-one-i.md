# 3191. Minimum Operations to Make Binary Array Elements Equal to One I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/
**Tags:** Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum

## Approach 1 — 2024-06-22 21:32 (java)

*Runtime: 6 ms (faster than 100.0%) · Memory: 57.4 MB*

```java
public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        for (int i = 0; i < n - 2; i++) {
            // If we find a 0, we flip the triplet starting from this position
            if (nums[i] == 0) {
                // Flip the current element and the next two elements
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                operations++;
            }
        }

        // Check if the last two elements are still 0s, which means it's impossible to turn all elements into 1s
        for (int i = n - 2; i < n; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }

        return operations;
    }
}
```

## Approach 2 — 2024-06-22 21:35 (java)

*Runtime: 6 ms (faster than 100.0%) · Memory: 56.7 MB*

```java
public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ans++;
            }
        }
        for (int i = n - 2; i < n; i++) {
            if (nums[i] == 0) return -1;
        }
    return ans;
    }
}
```

## Approach 3 — 2024-09-18 08:35 (java)

*Runtime: 6 ms (faster than 100.0%) · Memory: 57.3 MB*

```java
class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                ans++;
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
            }
        }
        if(nums[nums.length-2]==0||nums[nums.length-1]==0)return -1;
    return ans;
    }
}
```
