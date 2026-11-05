# 1619. Mean of Array After Removing Some Elements

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
**Tags:** Array, Sorting

## Approach 1 — 2024-08-06 19:49 (java)

*Runtime: 3 ms (faster than 99.4%) · Memory: 44.3 MB*

```java
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int ans=0;
for(int i=(int)(0+arr.length*0.05);i<(int)(arr.length-arr.length*0.05);i++)
            ans+=arr[i];
    return ans/(arr.length-arr.length*0.1);        
    }
}
```
