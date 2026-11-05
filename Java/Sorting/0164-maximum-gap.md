# 164. Maximum Gap

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-gap/
**Tags:** Array, Sorting, Bucket Sort, Radix Sort, Pigeonhole Principle

## Approach 1 — 2024-08-08 15:14 (java)

*Runtime: 42 ms (faster than 64.9%) · Memory: 60.7 MB*

```java
class Solution {
    public int maximumGap(int[] nums) {
       Arrays.sort(nums);
       int max=0;
       for(int i=0;i<nums.length-1;i++){
        max=Math.max(Math.abs(nums[i]-nums[i+1]),max);
       }
    return max;   
    }
}
```

## Approach 2 — 2024-08-08 15:17 (java)

*Runtime: 39 ms (faster than 65.7%) · Memory: 61 MB*

```java
class Solution {
    public int maximumGap(int[] nums) {
    //if(nums.length==1)return 0;
       Arrays.sort(nums);
       int max=0;
       for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>max)max=nums[i+1]-nums[i];
       }
    return max;   
    }
}
```

## Approach 3 — 2024-08-08 15:17 (java)

*Runtime: 40 ms (faster than 65.4%) · Memory: 60.5 MB*

```java
class Solution {
    public int maximumGap(int[] nums) {
    if(nums.length==1)return 0;
       Arrays.sort(nums);
       int max=0;
       for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>max)max=nums[i+1]-nums[i];
       }
    return max;   
    }
}
```

## Approach 4 — 2024-08-24 08:26 (java)

*Runtime: 7 ms (faster than 100.0%) · Memory: 57.1 MB*

```java
class Solution {
    public int maximumGap(int[] nums) {
         if (nums.length==1) return 0;
        int bucketSize = 0, n = nums.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        double max_diff = (double) max, min_diff = (double) min;
        double n_diff = (double)(n - 1);
        bucketSize = (int) Math.ceil((max_diff - min_diff) / (n_diff));
        if (bucketSize == 0) return 0;
        int[] maxBucket = new int[n], minBucket = new int[n];
        for (int m = 0; m < n; m++) {
            maxBucket[m] = Integer.MIN_VALUE;
        }
        for (int p = 0; p < n; p++) {
            minBucket[p] = Integer.MAX_VALUE;
        }
        int currentIndex = 0;
        for (int j = 0; j < n; j++) {
            currentIndex = ((nums[j] - min) / bucketSize);
            maxBucket[currentIndex] = Math.max(maxBucket[currentIndex], nums[j]);
            minBucket[currentIndex] = Math.min(minBucket[currentIndex], nums[j]);
        }
        int result = 0, previous = maxBucket[0];
        for (int k = 1; k < n; k++) {
            if (maxBucket[k] == Integer.MIN_VALUE) {
                continue;
            }
            result = Math.max(result, (minBucket[k] - previous));
            previous = maxBucket[k];
        }
    return result;
    }
}
```
