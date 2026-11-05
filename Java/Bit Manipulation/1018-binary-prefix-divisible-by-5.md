# 1018. Binary Prefix Divisible By 5

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-prefix-divisible-by-5/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2026-04-21 23:25 (java)

*Runtime: 4 ms (faster than 35.8%) · Memory: 47.8 MB*

```java
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        long x=0;
        for(int i=0;i<nums.length;i++){
            x=(x*2+nums[i])%5;
            if(x%5==0)ans.add(true);
            else ans.add(false);
        }
    return ans;
    }
}
```
