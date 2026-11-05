# 3745. Maximize Expression of Three Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximize-expression-of-three-elements/
**Tags:** Array, Greedy, Sorting, Enumeration

## Approach 1 — 2025-11-16 08:04 (java)

*Runtime: 50 ms (faster than 5.6%) · Memory: 44.8 MB*

```java
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i==j||j==k||i==k)continue;
                    max=Math.max(max,nums[i]+nums[j]-nums[k]);
                    // max=Math.max(max,i+k-j);
                    // max=Math.max(max,k+j-i);
                }
            }
        }
        return max;
    }
}
```
