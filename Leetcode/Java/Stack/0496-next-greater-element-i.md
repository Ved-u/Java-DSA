# 496. Next Greater Element I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/next-greater-element-i/
**Tags:** Array, Hash Table, Stack, Monotonic Stack

## Approach 1 — 2026-05-02 17:15 (java)

*Runtime: 6 ms (faster than 8.5%) · Memory: 44.8 MB*

```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<ans.length;i++)ans[i]=-1;
        for(int i=0;i<nums1.length;i++){
            int tmp=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    tmp=j;
                }
            }
            for(int j=tmp;j<nums2.length;j++){
                if(nums2[tmp]<nums2[j]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
```
