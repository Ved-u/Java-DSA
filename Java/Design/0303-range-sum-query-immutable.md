# 303. Range Sum Query - Immutable

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/range-sum-query-immutable/
**Tags:** Array, Design, Prefix Sum

## Approach 1 — 2026-04-02 11:19 (java)

*Runtime: 7 ms (faster than 100.0%) · Memory: 47.8 MB*

```java
class NumArray {
    int[] prefsum;
    int[] nums;
    public NumArray(int[] nums) {
        this.nums=nums;
        prefsum=new int[nums.length];
        prefsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefsum[i]=prefsum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return prefsum[right];
        return prefsum[right]-prefsum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
```
