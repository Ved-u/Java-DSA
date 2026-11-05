# 3861. Minimum Capacity Box

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-capacity-box/
**Tags:** Array

## Approach 1 — 2026-03-08 08:03 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.5 MB*

```java
class Solution {
    public int minimumIndex(int[] c, int s) {
        int idx=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++){
            if(c[i]>=s){
                if(c[i]<min){
                    idx=i;
                    min=c[i];
                }
            }
        }
        return idx;
    }
}
```
