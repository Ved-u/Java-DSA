# 2670. Find the Distinct Difference Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-distinct-difference-array/
**Tags:** Array, Hash Table

## Approach 1 — 2025-01-15 10:01 (java)

*Runtime: 6 ms (faster than 80.3%) · Memory: 45.6 MB*

```java
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pref[]=new int[nums.length];
        pref[0]=1;
        int suff[]=new int[nums.length];
        suff[nums.length-1]=0;
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1];
            if(!set.contains(nums[i])){
                pref[i]++;
                set.add(nums[i]);
            }
        }
        set.clear();
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1];
            if(!set.contains(nums[i+1])){
                suff[i]++;
                set.add(nums[i+1]);
            }
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=pref[i]-suff[i];
        }
    return ans;
    }
}
```
