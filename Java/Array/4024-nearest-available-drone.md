# 4024. Nearest Available Drone

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/nearest-available-drone/
**Tags:** Array, Enumeration

## Approach 1 — 2026-08-16 08:22 (java)

*Runtime: 1 ms · Memory: 46.6 MB*

```java
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<drones.length;i++){
            int x[] = drones[i];
            int man = Math.abs(x[0]-target[0])+Math.abs(x[1]-target[1]);
            if(man<=x[2]){
                if(man<min){
                    ans=i;
                    min = man;
                }
            }
        }
        return ans;
    }
}
```
