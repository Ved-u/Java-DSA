# 1287. Element Appearing More Than 25% In Sorted Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
**Tags:** Array

## Approach 1 — 2024-08-22 20:12 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.7 MB*

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        int left=0,right=left+(arr.length/4);
        int ans=0;
        while(right<arr.length){
            if(arr[left]==arr[right])return arr[left];
            left++;
            right++;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-08-22 20:16 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 44.7 MB*

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        int left=0,right=left+(arr.length/4);
        while(right<arr.length){
            if(arr[left]==arr[right])return arr[left];
            left++;
            right++;
        }
    return 0;
    }
}
```
