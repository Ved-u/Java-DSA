# 3912. Valid Elements in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-elements-in-an-array/
**Tags:** Array

## Approach 1 — 2026-04-26 10:22 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 46.5 MB*

```java
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        // boolean left[]=new boolean[nums.length];
        // boolean right[]=new boolean[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ans.add(nums[i]);
                continue;
            }
            boolean flag=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>=nums[i]){
                    flag=false;
                    break;
                }
            }
            if(flag)ans.add(nums[i]);
        }
        return ans;
    }
}
```

## Approach 2 — 2026-04-26 10:36 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 46.7 MB*

```java
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        boolean left[]=new boolean[nums.length];
        boolean right[]=new boolean[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                left[i]=true;
                max=nums[i];
            }
        }
        max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>max){
                right[i]=true;
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(left[i]==true||right[i]==true)ans.add(nums[i]);
        }
        return ans;
    }
}
```
