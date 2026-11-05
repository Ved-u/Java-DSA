# 1550. Three Consecutive Odds

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/three-consecutive-odds/
**Tags:** Array

## Approach 1 — 2024-07-01 12:18 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.9 MB*

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1&&arr[i+1]%2==1&&arr[i+2]%2==1)return true;
        }
    return false;    
    }
}
```
