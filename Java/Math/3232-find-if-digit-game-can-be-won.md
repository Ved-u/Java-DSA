# 3232. Find if Digit Game Can Be Won

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-if-digit-game-can-be-won/
**Tags:** Array, Math

## Approach 1 — 2024-07-28 08:08 (java)

*Runtime: 1 ms (faster than 92.5%) · Memory: 44.2 MB*

```java
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int commited=0;
        for(int x:nums){
            if(isDigit(x))single+=x;
            else commited+=x;
        }
    return single>commited||commited>single;    
    }
    public boolean isDigit(int n){
        return n==1||n==2||n==3||n==4||n==5||n==6||n==7||n==8||n==9;
    }
}
```
