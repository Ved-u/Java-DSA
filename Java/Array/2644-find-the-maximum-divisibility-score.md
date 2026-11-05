# 2644. Find the Maximum Divisibility Score

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-maximum-divisibility-score/
**Tags:** Array

## Approach 1 — 2026-09-12 14:41 (java)

*Runtime: 179 ms · Memory: 47.5 MB*

```java
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = Integer.MIN_VALUE, num = Integer.MAX_VALUE;
        for(int x:divisors){
            int div = 0;
            for(int y:nums){
                if(y%x==0)div++;
            }
            if(ans<div){
                ans=div;
                num = x;
            }
            if(ans==div && num > x)num = x;
        }
        return num;
    }
}
```
