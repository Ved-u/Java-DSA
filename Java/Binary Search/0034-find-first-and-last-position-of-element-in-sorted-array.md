# 34. Find First and Last Position of Element in Sorted Array

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
**Tags:** Array, Binary Search

## Approach 1 — 2024-11-19 16:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 46 MB*

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // Find the first occurrence of the target
        ans[0] = findFirst(nums, target);

        // If the target is not found, no need to search for the last occurrence
        if (ans[0] == -1) {
            return ans;
        }

        // Find the last occurrence of the target
        ans[1] = findLast(nums, target);

        return ans;
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = mid; // Record the position
                right = mid - 1; // Narrow the search to the left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = mid; // Record the position
                left = mid + 1; // Narrow the search to the right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
```

## Approach 2 — 2024-11-19 16:59 (java)

*Runtime: 1 ms (faster than 0.9%) · Memory: 45.9 MB*

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[]{-1,-1};
        if(nums.length==1){
            if(nums[0]==target)return new int[]{0,0};
            else return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(ans[0]==-1)ans[0]=i;
                else ans[1]=i;
            }
        }
        if(ans[0]!=-1&&ans[1]==-1)ans[1]=ans[0];
    return ans;
    }
}
```

## Approach 3 — 2024-11-25 20:01 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 46 MB*

```java
class Solution {
  public static int[] searchRange(int[] nums, int target) {
    if (nums.length == 0) {
      int[] output = {-1, -1};
      return output;
    }
    int initial = binarySearch(nums, 0, nums.length-1, target);
    int[] output = {initial, initial};
    if (initial != -1 && nums.length > 1) {
      //now do it to the left until you can't find more of the same target
      int testLeft = binarySearch(nums, 0, initial-1, target); 
      while (testLeft != -1){
        output[0] = testLeft;
        testLeft = binarySearch(nums, 0, testLeft-1, target); 
      }
      //binary search to the right of the initial index
      int testRight = binarySearch(nums, initial+1, nums.length-1, target); 
      //keep doing it will you can't find more of the same
      while (testRight != -1){
        output[1] = testRight;
        testRight = binarySearch(nums, testRight+1, nums.length-1, target); 
      }
    }
    return output;
  }
  public static int binarySearch(int[] arr,int start,int end,int query){
    int avgIndex = (start+end)/2+1;
    while (end > -1 && start > -1 && start < arr.length && end < arr.length) {
      if (start == end) {
        if (arr[start] == query){
          return start;
        } else {
          break;
        }
      } else if (arr[avgIndex] == query){
        return avgIndex;
      } else if (arr[avgIndex] < query){
        start = avgIndex;
      } else {
        end = avgIndex-1;
      }
      avgIndex = (start+end)/2+1;
    }
    return -1;
  }
}
```
