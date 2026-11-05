# 1252. Cells with Odd Values in a Matrix

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
**Tags:** Array, Math, Simulation

## Approach 1 — 2024-08-07 12:35 (java)

*Runtime: 2 ms (faster than 46.3%) · Memory: 41.6 MB*

```java
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int ans=0;
        int mat[][]=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                mat[indices[i][0]][j]++;
            }
            for(int j=0;j<m;j++){
                mat[j][indices[i][1]]++;
            }
        }
        for(int x[]:mat)
            for(int y:x)
                if(y%2==1)ans++;  
    return ans;    
    }
}
```

## Approach 2 — 2024-08-07 12:36 (java)

*Runtime: 1 ms (faster than 85.9%) · Memory: 41.7 MB*

```java
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int [n];
        int col[] = new int [m];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }    
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }        
        return count;
    }
}
```
