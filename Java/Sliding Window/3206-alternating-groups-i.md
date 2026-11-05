# 3206. Alternating Groups I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/alternating-groups-i/
**Tags:** Array, Sliding Window

## Approach 1 — 2024-07-06 20:11 (java)

*Runtime: 1 ms (faster than 97.9%) · Memory: 43.2 MB*

```java
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            if(i==0){
                if(colors[i]!=colors[n-1]&&colors[i]!=colors[i+1])ans++;
            }else if(i==n-1){
                if(colors[i]!=colors[0]&&colors[i]!=colors[n-2])ans++;
            }else
               if(colors[i]!=colors[i+1]&&colors[i]!=colors[i-1])ans++;
        }
    return ans;    
    }
}
```
