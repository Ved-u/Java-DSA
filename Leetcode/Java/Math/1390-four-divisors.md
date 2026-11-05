# 1390. Four Divisors

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/four-divisors/
**Tags:** Array, Math, Prime Factorization, Sieve Theory

## Approach 1 — 2026-05-31 09:41 (java)

*Runtime: 10 ms (faster than 77.6%) · Memory: 47.7 MB*

```java
class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int x[]=divisors(nums[i]);
            if(x!=null)for(int y:x)ans+=y;
        }
        return ans;
    }
    int[] divisors(int x){
        int ans[]=new int[4];
        ans[0]=1;
        ans[3]=x;
        boolean flag=false;
        for(int i = 2; i * i <= x; i++){
        if(x % i == 0){
            int other = x / i;
            if(i == other) return null;
            if(flag) return null;  
            ans[1] = i;
            ans[2] = other;
            flag = true;
        }
    }
    return flag ? ans : null;
    }
}
```
