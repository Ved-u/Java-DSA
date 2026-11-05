# 3917. Count Indices With Opposite Parity

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-indices-with-opposite-parity/
**Tags:** Array

## Approach 1 — 2026-05-03 20:57 (java)

*Runtime: 5 ms (faster than 34.5%) · Memory: 46.8 MB*

```java
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int parity=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]%2!=nums[j]%2)parity++;
            }
            ans[i]=parity;
        }
        return ans;
    }
}
```
