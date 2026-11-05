# 2120. Execution of All Suffix Instructions Staying in a Grid

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/
**Tags:** String, Simulation

## Approach 1 — 2024-04-26 13:35 (java)

*Runtime: 56 ms (faster than 10.8%) · Memory: 44.2 MB*

```java
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int robPos[]=new int[2];
        int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            robPos[0]=startPos[0];
            robPos[1]=startPos[1];
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='R'){
                    robPos[1]++;
                    if(robPos[1]>n-1||robPos[1]<0||robPos[0]<0||robPos[0]>n-1)break;
                    ans[i]++;
                }
                if(s.charAt(j)=='L'){
                    robPos[1]--;
                     if(robPos[1]>n-1||robPos[1]<0||robPos[0]<0||robPos[0]>n-1)break;
                    ans[i]++;
                }
                if(s.charAt(j)=='U'){
                    robPos[0]--;
                     if(robPos[1]>n-1||robPos[1]<0||robPos[0]<0||robPos[0]>n-1)break;
                    ans[i]++;
                }
                if(s.charAt(j)=='D'){
                    robPos[0]++;
                     if(robPos[1]>n-1||robPos[1]<0||robPos[0]<0||robPos[0]>n-1)break;
                    ans[i]++;
                }
            }
        }
    return ans;    
    }
}
```
