# 3285. Find Indices of Stable Mountains

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-indices-of-stable-mountains/
**Tags:** Array

## Approach 1 — 2024-09-14 20:03 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.8 MB*

```java
class Solution {
    public List<Integer> stableMountains(int[] arr, int t) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>t)ans.add(i);
        }
    return ans;
    }
}
```
