# 2833. Furthest Point From Origin

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/furthest-point-from-origin/
**Tags:** String, Counting

## Approach 1 — 2024-08-17 19:36 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.5 MB*

```java
class Solution {
    public int furthestDistanceFromOrigin(String s) {
       int left=0,right=0,under=0;
       for(char x:s.toCharArray()){
            if(x=='L')left++;
            else if(x=='R')right++;
            else under++;
       }
    return Math.abs(left-right)+under; 
    }
}
```
