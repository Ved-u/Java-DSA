# 3340. Check Balanced String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-balanced-string/
**Tags:** String

## Approach 1 — 2024-11-03 08:02 (java)

*Runtime: 1 ms (faster than 98.4%) · Memory: 42.6 MB*

```java
class Solution {
    public boolean isBalanced(String num) {
        int oSum=0,eSum=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)eSum+=num.charAt(i)-'0';
            else oSum+=num.charAt(i)-'0';
        }
    return eSum==oSum;
    }
}
```
