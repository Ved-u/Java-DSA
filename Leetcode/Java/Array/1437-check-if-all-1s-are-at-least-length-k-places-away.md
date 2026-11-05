# 1437. Check If All 1's Are at Least Length K Places Away

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
**Tags:** Array

## Approach 1 — 2025-11-17 19:14 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 65.5 MB*

```java
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(idx==-1){ 
                    idx=i;
                    continue;
                }else{
                    if((i-idx-1)<k)return false;
                }
                idx=i;
            }
        }
        return true;
    }
}
```
