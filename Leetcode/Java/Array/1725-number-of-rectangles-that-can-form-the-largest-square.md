# 1725. Number Of Rectangles That Can Form The Largest Square

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
**Tags:** Array

## Approach 1 — 2024-08-11 22:22 (java)

*Runtime: 3 ms (faster than 27.5%) · Memory: 45.3 MB*

```java
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int ans=0;
        int max=0;
        for(int x[]:rectangles){
           max=Math.max(max,Math.min(x[0],x[1]));
        }
        for(int x[]:rectangles){
           if(max<=Math.min(x[0],x[1]))ans++;
        }
    return ans;    
    }
}
```
