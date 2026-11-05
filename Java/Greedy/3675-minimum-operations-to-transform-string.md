# 3675. Minimum Operations to Transform String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-operations-to-transform-string/
**Tags:** String, Greedy

## Approach 1 — 2025-09-07 08:34 (java)

*Runtime: 28 ms (faster than 50.8%) · Memory: 51.9 MB*

```java
class Solution {
    public int minOperations(String s) {
        int ans=0;
        char min = '{';
        for(char x:s.toCharArray()){
            if(x=='a')continue;
            if(x<min)min=x;
           // min=Math.min(min,x);
        }
        if(min=='{')return 0;
       // if(min=='a')return 0;
    return Math.abs(min-'{');
    }
}
```
