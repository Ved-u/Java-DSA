# 1913. Maximum Product Difference Between Two Pairs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
**Tags:** Array, Sorting, Quicksort

## Approach 1 — 2024-02-14 00:05 (java)

*Runtime: 3 ms (faster than 72.9%) · Memory: 44.6 MB*

```java
class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
               if (nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        
        return (max1*max2)-(min1*min2);
    }
}
```

## Approach 2 — 2024-02-14 00:08 (java)

*Runtime: 3 ms (faster than 72.9%) · Memory: 45 MB*

```java
class Solution {
    public int maxProductDifference(int[] nums) {
       int min1=Integer.MAX_VALUE,min2=min1,max1=Integer.MIN_VALUE,max2=max1;
        for(int i=0;i<nums.length;i++){
            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
               if (nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        
        return (max1*max2)-(min1*min2);
    }
}
```
