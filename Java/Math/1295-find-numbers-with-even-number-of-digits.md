# 1295. Find Numbers with Even Number of Digits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
**Tags:** Array, Math

## Approach 1 — 2024-08-09 22:06 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 42.4 MB*

```java
class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int x:nums)
            if(digits(x))ans++;
    return ans;    
    }
    public boolean digits(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
    return count%2==0;    
    }
}
```
