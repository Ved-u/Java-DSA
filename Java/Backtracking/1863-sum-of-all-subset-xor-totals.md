# 1863. Sum of All Subset XOR Totals

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-all-subset-xor-totals/
**Tags:** Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration

## Approach 1 — 2024-06-15 20:16 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int subsetXORSum(int[] nums) {
           return calcXORSum(nums, 0, 0);
    }
    private static int calcXORSum(int[] nums,int index,int currentXOR) {
        if (index == nums.length)  return currentXOR;
    int incldCurrent = calcXORSum(nums,index+1,currentXOR^nums[index]);
    int excludeCurrent = calcXORSum(nums, index + 1, currentXOR);
        return incldCurrent + excludeCurrent;
    }
}
```

## Approach 2 — 2024-09-05 22:09 (java)

*Runtime: 16 ms (faster than 5.8%) · Memory: 44.5 MB*

```java
class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num); 
                result.add(newSubset); 
            }
        } 
        for(List<Integer> x:result){
            int temp=0;
            for(Integer y:x){
                temp^=y;
            }
            ans+=temp;
        }
    return ans;
    }
}
```
