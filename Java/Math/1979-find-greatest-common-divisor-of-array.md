# 1979. Find Greatest Common Divisor of Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-greatest-common-divisor-of-array/
**Tags:** Array, Math, Number Theory, Euclidean Algorithm, Greatest Common Divisor

## Approach 1 — 2024-08-07 12:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.6 MB*

```java
class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=100000;
        for(int x:nums){
            if(x>max)max=x;
             if(x<min)min=x;
        }
        int ans=min;
        for(;ans>=1;ans--){
            if(min%ans==0&&max%ans==0)break;
        }
    return ans;    
    }
}
```
