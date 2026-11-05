# 3370. Smallest Number With All Set Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/smallest-number-with-all-set-bits/
**Tags:** Math, Bit Manipulation

## Approach 1 — 2024-12-01 08:03 (java)

*Runtime: 7 ms (faster than 3.9%) · Memory: 45.1 MB*

```java
class Solution {
    public int smallestNumber(int n) {
        int ans=n;
        while(!valid(Integer.toBinaryString(ans))){
            ans++;
        }
    return ans;
    }
    public boolean valid(String x){
        for(char y:x.toCharArray()){
            if(y!='1')return false;
        }
    return true;
    }
}
```
