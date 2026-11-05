# 4. Median of Two Sorted Arrays

**Difficulty:** Hard
**Link:** https://leetcode.com/problems/median-of-two-sorted-arrays/
**Tags:** Array, Binary Search, Divide and Conquer

## Approach 1 — 2024-02-19 15:31 (java)

*Runtime: 5 ms (faster than 22.9%) · Memory: 46.1 MB*

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
          merge[i]=nums1[i];  
        }int count=0;
        for(int i=nums1.length;i<(nums2.length+nums1.length);i++){
            merge[i]=nums2[count];
            count++;
        }
        Arrays.sort(merge);
       int len = merge.length;
       if (len % 2 == 0) {
           return (merge[len / 2 - 1] + merge[len / 2]) / 2.0;
        }
        return merge[len / 2];
       
    }
}
```

## Approach 2 — 2024-02-19 15:37 (java)

*Runtime: 5 ms (faster than 22.9%) · Memory: 45.5 MB*

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
          merge[i]=nums1[i];  
        }int count=0;
        for(int i=nums1.length;i<(nums2.length+nums1.length);i++){
            merge[i]=nums2[count];
            count++;
        }
        Arrays.sort(merge);
       int len = merge.length;
       if (len % 2 == 0) {
           return (merge[len / 2 - 1] + merge[len / 2]) / 2.0;
        }
        return merge[len / 2];
    }
}
```
