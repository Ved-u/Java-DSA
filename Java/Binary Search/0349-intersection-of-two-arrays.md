# 349. Intersection of Two Arrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/intersection-of-two-arrays/
**Tags:** Array, Hash Table, Two Pointers, Binary Search, Sorting

## Approach 1 — 2024-03-10 18:13 (java)

*Runtime: 7 ms (faster than 14.3%) · Memory: 42.3 MB*

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&!(temp.contains(nums1[i]))){
                    temp.add(nums1[i]);
                    break;
                }
            }
        }
        int ans[]=new int[temp.size()];
       for(int i=0;i<temp.size();i++){
           ans[i]=temp.get(i);
       }
        return ans;
    }
}
```
