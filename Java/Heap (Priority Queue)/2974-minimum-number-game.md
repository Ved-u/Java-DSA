# 2974. Minimum Number Game

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-number-game/
**Tags:** Array, Sorting, Heap (Priority Queue), Simulation

## Approach 1 — 2024-07-11 11:05 (java)

*Runtime: 2 ms (faster than 97.5%) · Memory: 44.9 MB*

```java
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            nums[i]=nums[i]^nums[i+1];
            nums[i+1]=nums[i]^nums[i+1];
            nums[i]=nums[i]^nums[i+1];
        }
    return nums;    
    }
}
```
