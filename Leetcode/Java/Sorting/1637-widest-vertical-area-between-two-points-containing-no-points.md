# 1637. Widest Vertical Area Between Two Points Containing No Points

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
**Tags:** Array, Sorting

## Approach 1 — 2024-07-14 19:51 (java)

*Runtime: 14 ms (faster than 99.5%) · Memory: 72.9 MB*

```java
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans=0;
        int temp[]=new int[points.length];
        for(int i=0;i<points.length;i++){
          temp[i]=points[i][0];
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length-1;i++){
            ans=Math.max(ans,temp[i+1]-temp[i]);
        }
    return ans;    
    }
}
```
