# 4010. Maximize Pair Strength Using GCD

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximize-pair-strength-using-gcd/
**Tags:** Array, Math, Enumeration, Number Theory

## Approach 1 — 2026-08-03 19:51 (java)

*Runtime: 1008 ms (faster than 50.3%) · Memory: 47.1 MB*

```java
class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long gcd = gcd(nums[i],nums[j]);
                ans = Math.max(ans,1L*nums[i]*nums[j]/(gcd*gcd));
            }
        }
        return ans;
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
```
