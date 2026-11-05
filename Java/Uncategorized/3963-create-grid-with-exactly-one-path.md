# 3963. Create Grid With Exactly One Path

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/create-grid-with-exactly-one-path/
**Tags:** 

## Approach 1 — 2026-10-27 19:35 (java)

*Runtime: 4 ms · Memory: 46 MB*

```java
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==grid.length-1)grid[i][j]='.';
                else grid[i][j]='#';
            }
        }
        String[] ans = new String[m];
        int idx=0;
        for(char[] x:grid){
            StringBuilder sb = new StringBuilder();
            for(char y:x){
                sb.append(y);
            }
            ans[idx++] = sb.toString();
        }
        return ans;
    }
}
```
