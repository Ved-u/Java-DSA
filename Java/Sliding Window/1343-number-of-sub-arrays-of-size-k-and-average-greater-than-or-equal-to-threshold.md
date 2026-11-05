# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
**Tags:** Array, Sliding Window

## Approach 1 — 2024-08-13 19:33 (java)

*Runtime: 1474 ms (faster than 5.0%) · Memory: 61 MB*

```java
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int left=0,right=k-1;
        while(right<=arr.length-1){
            int t=0;
            for(int i=left;i<=right;i++)
                t+=arr[i];
            if(t/k>=threshold)ans++;  
            left++;
            right++; 
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-08-13 19:39 (java)

*Runtime: 2 ms (faster than 99.9%) · Memory: 60.5 MB*

```java
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int product = k * threshold;
        int sum = 0;
        int res = 0;
        for (int i = 0; i < k - 1; ++i) {
          sum += arr[i];
        }
        for (int r = k - 1; r < arr.length; ++r) {
          sum += arr[r];
          if (sum >= product) {
            res++;
          }
          int l = r - k + 1;
          sum -= arr[l];
        }
        return res;
    }
}
```
