# 3842. Toggle Light Bulbs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/toggle-light-bulbs/
**Tags:** Array, Hash Table, Sorting, Simulation

## Approach 1 — 2026-03-09 22:34 (java)

*Runtime: 3 ms (faster than 69.8%) · Memory: 46.5 MB*

```java
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ans = new ArrayList<>();
        boolean bulb[]=new boolean[100];
        for(int x:bulbs){
            bulb[x-1]=!bulb[x-1];
        }
        for(int i=0;i<bulb.length;i++){
            boolean x = bulb[i];
            if(x)ans.add(i+1);
        }
        Collections.sort(ans);
        return ans;
    }
}
```
