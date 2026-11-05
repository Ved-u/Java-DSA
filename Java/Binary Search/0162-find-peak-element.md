# 162. Find Peak Element

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-peak-element/
**Tags:** Array, Binary Search

## Approach 1 — 2024-06-29 21:39 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.2 MB*

```java
class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length-1;
        int mid,left=0,right=n;
        while(left<=right){
            mid=(left+right)/2;
            if((mid==0||arr[mid]>arr[mid-1])&&
            (mid==n||arr[mid]>arr[mid+1]))return mid;
            else if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }    
            else right=mid-1;
        }
    return -1;    
    }
}
```
