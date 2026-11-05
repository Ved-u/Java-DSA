# 3940. Limit Occurrences in Sorted Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/limit-occurrences-in-sorted-array/
**Tags:** Array, Two Pointers

## Approach 1 — 2026-05-24 10:00 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 47 MB*

```java
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int count=0,element=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count++;
                if(count>k)continue;

            }else{
                element=nums[i];
                count=1;
            }
            list.add(nums[i]);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
```
