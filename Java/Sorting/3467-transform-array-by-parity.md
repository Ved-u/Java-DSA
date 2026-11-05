# 3467. Transform Array by Parity

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/transform-array-by-parity/
**Tags:** Array, Sorting, Counting

## Approach 1 — 2026-06-03 17:23 (java)

*Runtime: 1 ms (faster than 99.4%) · Memory: 46.8 MB*

```java
class Solution {
    public int[] transformArray(int[] nums) {
        int odd=0,even=0;
        for(int x:nums){
            if(x%2==0)even++;
            else odd++;
        }
        int i=0;
        while(even-->0)nums[i++]=0;
        while(odd-->0)nums[i++]=1;
        return nums;
    }
}
```
