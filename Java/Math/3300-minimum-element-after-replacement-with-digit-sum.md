# 3300. Minimum Element After Replacement With Digit Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
**Tags:** Array, Math

## Approach 1 — 2024-09-28 20:08 (java)

*Runtime: 2 ms (faster than 32.9%) · Memory: 44.5 MB*

```java
class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }
        for(int x:nums){
            if(x<ans)ans=x;
        }
    return ans;
    }
    public int sum(int x){
        String s=""+x;
        int ans=0;
        for(char y:s.toCharArray()){
            ans+=y-'0';
        }
    return ans;
    }
}
```
