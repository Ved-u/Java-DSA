# 3354. Make Array Elements Equal to Zero

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/make-array-elements-equal-to-zero/
**Tags:** Array, Simulation, Prefix Sum

## Approach 1 — 2024-11-17 08:14 (java)

*Runtime: 101 ms (faster than 12.6%) · Memory: 42.7 MB*

```java
class Solution {
    public static int countValidSelections(int[] nums) {
        int validSelections = 0;
        int n = nums.length;

        // Iterate through all possible starting positions
        for (int start = 0; start < n; start++) {
            if (nums[start] != 0) continue;

            // Check for both left and right directions
            if (isValid(nums.clone(), start, -1)) {
                validSelections++;
            }
            if (isValid(nums.clone(), start, 1)) {
                validSelections++;
            }
        }

        return validSelections;
    }

    // Helper method to check if a selection is valid
    private static boolean isValid(int[] nums, int start, int direction) {
        int n = nums.length;
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (nums[curr] == 0) {
                curr += direction; // Move in the current direction
            } else {
                nums[curr]--; // Decrement the value at the current position
                direction = -direction; // Reverse direction
                curr += direction; // Move in the new direction
            }
        }

        // Check if all elements are 0
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
```

## Approach 2 — 2024-11-17 08:37 (java)

*Runtime: 100 ms (faster than 16.8%) · Memory: 43.2 MB*

```java
class Solution {
    public int countValidSelections(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)continue;
            if(isValid(nums.clone(),i,-1))ans++;
            if(isValid(nums.clone(),i,1))ans++;
        }
    return ans;
    }
    boolean isValid(int nums[],int indx,int dir){
        int curr=indx;
        while(curr>=0&&curr<nums.length){
            if(nums[curr]!=0){
                nums[curr]--;
                dir=-dir;
            }
            curr+=dir;
        }
        for(int x:nums){
            if(x!=0)return false;
        }
    return true;
    }
}
```
