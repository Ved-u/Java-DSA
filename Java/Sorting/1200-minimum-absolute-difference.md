# 1200. Minimum Absolute Difference

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-absolute-difference/
**Tags:** Array, Sorting

## Approach 1 — 2026-03-19 08:29 (java)

*Runtime: 22 ms (faster than 36.5%) · Memory: 64.1 MB*

```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if((arr[i]>arr[i-1])&&(arr[i]-arr[i-1]<min))min=arr[i]-arr[i-1];
        }
        for(int i=1;i<arr.length;i++){
            if((arr[i]>arr[i-1])&&(arr[i]-arr[i-1]==min)){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i-1]);
                tmp.add(arr[i]);
                ans.add(tmp);
            }
        }
        return ans;
    }
}
```
