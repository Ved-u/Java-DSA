# 260. Single Number III

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/single-number-iii/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2024-05-31 10:08 (java)

*Runtime: 4 ms (faster than 38.0%) · Memory: 45.8 MB*

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        int Ans[]=new int[2];
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0&&nums[i]!=nums[i+1])ans.add(nums[i]);
            if(i==nums.length-1&&nums[i]!=nums[i-1])ans.add(nums[i]);
        if(i>0&&i<nums.length-1&&nums[i]!=nums[i+1]&&nums[i]!=nums[i-1])ans.add(nums[i]);
        }
        Ans[0]=ans.get(0);
        Ans[1]=ans.get(1);
    return Ans;
    }
}
```
