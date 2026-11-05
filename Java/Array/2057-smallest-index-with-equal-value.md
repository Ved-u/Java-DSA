# 2057. Smallest Index With Equal Value

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-index-with-equal-value/
**Tags:** Array

## Approach 1 — 2024-02-14 23:06 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.2 MB*

```java
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
```
