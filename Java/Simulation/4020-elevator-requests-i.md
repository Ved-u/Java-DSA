# 4020. Elevator Requests I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/elevator-requests-i/
**Tags:** Array, Simulation

## Approach 1 — 2026-08-15 20:02 (java)

*Runtime: 1 ms · Memory: 45 MB*

```java
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=requests[0];
        for(int i=1;i<requests.length;i++){
            ans+=Math.abs(requests[i-1]-requests[i]);
        }
        return ans;
    }
}
```
