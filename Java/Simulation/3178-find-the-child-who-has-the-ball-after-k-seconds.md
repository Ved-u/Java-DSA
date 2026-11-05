# 3178. Find the Child Who Has the Ball After K Seconds

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/
**Tags:** Math, Simulation

## Approach 1 — 2024-08-04 21:48 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.2 MB*

```java
class Solution {
    public int numberOfChild(int n, int k) {
        int t=0;
        boolean check=true;
        while(k>0){
            if(t==n-1)check=false;
            else if(t==0)check=true;
           if(check)t++;
           else t--;
           k--;
        }
    return t;    
    }
}
```
