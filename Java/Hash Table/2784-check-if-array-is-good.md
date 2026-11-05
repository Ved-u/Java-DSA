# 2784. Check if Array is Good

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-array-is-good/
**Tags:** Array, Hash Table, Sorting

## Approach 1 — 2026-05-14 08:57 (java)

*Runtime: 2 ms (faster than 47.6%) · Memory: 45.5 MB*

```java
class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
            if(map.get(x)==null)map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        int n=max;
        for(int i=1;i<=n;i++){
            if(i==n){
                if(map.get(i)==null || map.get(i)!=2)return false;
            }
            else if(map.get(i)==null || map.get(i)!=1)return false;
        }
        return true;
    }
}
```
