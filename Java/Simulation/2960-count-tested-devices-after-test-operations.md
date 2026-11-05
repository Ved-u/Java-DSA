# 2960. Count Tested Devices After Test Operations

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-tested-devices-after-test-operations/
**Tags:** Array, Simulation, Counting

## Approach 1 — 2024-08-12 17:39 (java)

*Runtime: 1 ms (faster than 68.7%) · Memory: 43.4 MB*

```java
class Solution {
    public int countTestedDevices(int[] b) {
       int ans=0;
       for(int i=0;i<b.length;i++){
            if(b[i]>0){
                ans++;
                for(int j=i+1;j<b.length;j++){
                    b[j]=Math.max(0,b[j]-1);
                }
            }
       }
    return ans;    
    }
}
```

## Approach 2 — 2024-08-12 17:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 43.5 MB*

```java
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int d=0,ans=0;
        for(int x:batteryPercentages){
            if(x>d){
                ans++;
                d++;
            }
        }
        return ans;
    }
}
```
