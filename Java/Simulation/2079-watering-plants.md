# 2079. Watering Plants

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/watering-plants/
**Tags:** Array, Simulation

## Approach 1 — 2024-08-13 19:15 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.1 MB*

```java
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0;
        int temp=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>capacity){
                ans+=i*2; 
                capacity=temp;
            } 
            capacity-=plants[i];
            ans++;
        }
    return ans;    
    }
}
```
