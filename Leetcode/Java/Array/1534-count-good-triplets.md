# 1534. Count Good Triplets

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-good-triplets/
**Tags:** Array, Enumeration

## Approach 1 — 2024-10-05 13:28 (java)

*Runtime: 13 ms (faster than 71.2%) · Memory: 41.5 MB*

```java
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(Math.abs(arr[i]-arr[j])<=a&&
                    Math.abs(arr[j]-arr[k])<=b&&
                    Math.abs(arr[i]-arr[k])<=c)ans++;
                }
            }
        }
    return ans;
    }
}
```
