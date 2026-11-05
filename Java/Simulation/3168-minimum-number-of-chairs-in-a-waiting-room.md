# 3168. Minimum Number of Chairs in a Waiting Room

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
**Tags:** String, Simulation

## Approach 1 — 2024-06-17 10:06 (java)

*Runtime: 1 ms (faster than 99.7%) · Memory: 41.9 MB*

```java
class Solution {
    public int minimumChairs(String s) {
        int chairs=0,ans=0;
        for(char x:s.toCharArray()){
            if(x=='E'){
                chairs++;
                ans=Math.max(ans,chairs);
            }    
            else chairs--;
        }
    return ans;    
    }
}
```
