# 27. Remove Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-element/
**Tags:** Array, Two Pointers

## Approach 1 — 2024-02-16 20:03 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int valcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                valcount++;
                count++;
            }
           // if(nums[i]!=val)  
        }
        return count;
    }
}
```
