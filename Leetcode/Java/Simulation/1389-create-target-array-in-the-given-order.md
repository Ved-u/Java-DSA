# 1389. Create Target Array in the Given Order

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/create-target-array-in-the-given-order/
**Tags:** Array, Simulation

## Approach 1 — 2024-07-10 10:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp=new ArrayList<>();
        int ans[]=new int[index.length];
        for(int i=0;i<index.length;i++){
            temp.add(index[i],nums[i]);
        }
        for(int i=0;i<temp.size();i++)
            ans[i]=temp.get(i);
    return ans;    
    }
}
```
