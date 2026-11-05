# 3712. Sum of Elements With Frequency Divisible by K

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/
**Tags:** Array, Hash Table, Counting

## Approach 1 — 2025-11-14 19:58 (java)

*Runtime: 3 ms (faster than 51.4%) · Memory: 44.2 MB*

```java
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int ans=0;
        for(var x: map.keySet()){
            if(map.get(x)%k==0)ans+=(x*map.get(x));
        }
        return ans;
    }
}
```
