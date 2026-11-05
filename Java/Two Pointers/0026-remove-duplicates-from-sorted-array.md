# 26. Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/
**Tags:** Array, Two Pointers

## Approach 1 — 2024-03-02 15:00 (java)

*Runtime: 1 ms (faster than 83.3%) · Memory: 44.4 MB*

```java
class Solution {
    public int removeDuplicates(int[] nums) {
      int ans[]=new int[nums.length];
      int k=0;
       if(nums.length==1){
           ans[0]=nums[0];
           k=1;
            return k;
        }
      for(int i=0;i<nums.length;i++){
          if(i<nums.length-1){
              if(nums[i]!=nums[i+1]){
              ans[k]=nums[i];
              k++;
          }
        }else{
            ans[k]=nums[i];
              k++;
        }    
      }
      for(int i=0;i<k;i++){
          nums[i]=ans[i];
      }
      return k;
    }
}
```
