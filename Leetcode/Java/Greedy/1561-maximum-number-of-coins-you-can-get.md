# 1561. Maximum Number of Coins You Can Get

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
**Tags:** Array, Math, Greedy, Sorting, Game Theory

## Approach 1 — 2024-08-09 21:57 (java)

*Runtime: 27 ms (faster than 96.3%) · Memory: 56.1 MB*

```java
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0;
        int count=0;
        for(int i=piles.length-2;i>=0;i-=2){
            piles[count++]=-1;
            if(piles[i]!=-1)ans+=piles[i];
            else break;
        }
    return ans;    
    }
}
```
