# 2032. Two Out of Three

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/two-out-of-three/
**Tags:** Array, Hash Table, Bit Manipulation

## Approach 1 — 2024-03-02 16:28 (java)

*Runtime: 218 ms (faster than 5.1%) · Memory: 44.5 MB*

```java
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
               for(int k=0;k<nums3.length;k++){
                   if(nums1[i]==nums2[j]||nums1[i]==nums3[k]){
                        if (!ans.contains(nums1[i])) {
                               ans.add(nums1[i]);
                        }  
                   }
                   if(nums2[j]==nums1[i]||nums2[j]==nums3[k]){
                      if (!ans.contains(nums2[j])) {
                               ans.add(nums2[j]);
                        } 
                   }
                   if(nums3[k]==nums2[j]||nums3[k]==nums1[i]){
                       if (!ans.contains(nums3[k])) {
                               ans.add(nums3[k]);
                        } 
                   }

               }
           }
       }
        return ans;
    }
}
```
