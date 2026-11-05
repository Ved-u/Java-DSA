# 3921. Score Validator

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/score-validator/
**Tags:** Array, String, Simulation

## Approach 1 — 2026-05-09 20:08 (java)

*Runtime: 3 ms (faster than 48.4%) · Memory: 47.4 MB*

```java
class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans=new int[2];
        for(String x:events){
            if(x.equals("0")||x.equals("1")||
               x.equals("2")||x.equals("3")
               ||x.equals("4")||x.equals("5")||x.equals("6"))
                ans[0]+=Integer.parseInt(x);
            else if(x.equals("W")){
                ans[1]++;
                if(ans[1]==10)return ans;
            }
            else if(x.equals("WD")||x.equals("NB"))ans[0]++;
        }
        return ans;
    }
}
```
