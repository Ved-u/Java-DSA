# 1523. Count Odd Numbers in an Interval Range

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
**Tags:** Math

## Approach 1 — 2025-12-07 21:10 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    public int countOdds(int low, int high) {
        // int ans=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2==1)ans++;
        // }
        // return ans;
        if(high%2==1||low%2==1)return (high-low)/2+1;
        return (high-low)/2;
    }
}
```
