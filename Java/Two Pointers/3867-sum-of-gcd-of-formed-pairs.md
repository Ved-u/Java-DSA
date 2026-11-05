# 3867. Sum of GCD of Formed Pairs

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/
**Tags:** Array, Math, Two Pointers, Sorting, Simulation, Number Theory

## Approach 1 — 2026-07-16 20:22 (java)

*Runtime: 62 ms (faster than 13.6%) · Memory: 107.6 MB*

```java
class Solution {
    public long gcdSum(int[] nums) {
        int[] pg = new int[nums.length];
        long ans = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            pg[i] = GCD(nums[i],max);
        }
        Arrays.sort(pg);
        int l=0,r=pg.length-1;
        while(l<r){
            ans += GCD(pg[l],pg[r]);
            l++;r--;
        }
        return ans;
    }
    int GCD(int a, int b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
}
```
