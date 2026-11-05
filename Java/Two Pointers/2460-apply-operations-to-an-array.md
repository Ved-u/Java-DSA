# 2460. Apply Operations to an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/apply-operations-to-an-array/
**Tags:** Array, Two Pointers, Simulation

## Approach 1 — 2024-08-12 18:10 (java)

*Runtime: 1 ms (faster than 95.6%) · Memory: 44.2 MB*

```java
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int ans[]=new int[nums.length];
        int count=0;
        for(int x:nums)
            if(x>0)ans[count++]=x;
    return ans; 
    }
}
```

## Approach 2 — 2024-08-12 18:11 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.9 MB*

```java
class Solution 
{
    public int[] applyOperations(int[] nums) 
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i + 1])
            {
                nums[i] *= 2;
                nums[i + 1] = 0;
                i++;
            }
        }
        int[] n = new int[nums.length];
        int index = 0;
        for(int i : nums)
        {
            if(i > 0)
            {
                n[index] = i;
                index++;
            }
        }
        return n;
    }
}
```
