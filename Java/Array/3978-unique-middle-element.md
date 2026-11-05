# 3978. Unique Middle Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/unique-middle-element/
**Tags:** Array, Counting

## Approach 1 — 2026-07-04 22:12 (java)

*Runtime: 1 ms (faster than 94.5%) · Memory: 46.2 MB*

```java
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int freq=0,middle=nums[nums.length/2];
        for(int x:nums){
            if(x==middle)freq++;
        }
        return freq==1;
    }
}
```
