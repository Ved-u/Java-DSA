# 2656. Maximum Sum With Exactly K Elements 

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
**Tags:** Array, Greedy

## Approach 1 — 2024-10-11 21:53 (java)

*Runtime: 2 ms (faster than 76.5%) · Memory: 44.8 MB*

```java
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>max)max=x;
        }int ans=0;
        for(int i=1;i<=k;i++){
            ans+=max;
            max++;
        }
    return ans;
    }
}
```
