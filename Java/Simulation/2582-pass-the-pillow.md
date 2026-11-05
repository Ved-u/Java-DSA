# 2582. Pass the Pillow

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/pass-the-pillow/
**Tags:** Math, Simulation

## Approach 1 — 2024-08-28 22:31 (java)

*Runtime: 1 ms (faster than 26.1%) · Memory: 40.2 MB*

```java
class Solution {
    public int passThePillow(int n, int t) {
        int ans=1;
        boolean check=false;
        while(t>0){
            if(ans==n)check=true;
            if(ans==1)check=false;
            if(check)ans--;
            else ans++;
            t--;
        }
    return ans;
    }
}
```
