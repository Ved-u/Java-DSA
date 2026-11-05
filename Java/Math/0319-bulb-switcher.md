# 319. Bulb Switcher

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/bulb-switcher/
**Tags:** Math, Brainteaser

## Approach 1 — 2024-09-04 20:59 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.4 MB*

```java
class Solution {
    public int bulbSwitch(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i*i<=n)ans++;
            else break;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-09-04 21:02 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 39.6 MB*

```java
class Solution {
    public int bulbSwitch(int n) {
       return (int) Math.sqrt(n);
    }
}
```
