# 3069. Distribute Elements Into Two Arrays I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
**Tags:** Array, Two Pointers, Simulation

## Approach 1 — 2026-08-20 19:53 (java)

*Runtime: 1 ms · Memory: 46.8 MB*

```java
class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>(); 
        int n = nums.length;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)){
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        int[] ans = new int[n];
        for(int i=0;i<arr1.size();i++){
            ans[i] = arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++){
            ans[arr1.size() + i] = arr2.get(i);
        }
        return ans;
    }
}
```
