# 2965. Find Missing and Repeated Values

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-missing-and-repeated-values/
**Tags:** Array, Hash Table, Math, Matrix

## Approach 1 — 2024-08-12 17:32 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 45.3 MB*

```java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int freq[]=new int[grid.length*grid.length+1];
      for(int x[]:grid){
        for(int y:x)freq[y]++;
      }
      int ans[]=new int[2];
      for(int i=0;i<freq.length;i++){
        if(freq[i]==2)ans[0]=i;
        else if(freq[i]==0)ans[1]=i;
      }
    return ans;   
    }
}
```

## Approach 2 — 2025-09-10 14:43 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 45.7 MB*

```java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int n=grid.length;//n
        int freq[]=new int[1+(n*n)];
        for(int i=0;i<grid.length;i++){//10
            for(int j=0;j<grid[0].length;j++){//2
                freq[grid[i][j]]++;
            }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0)ans[1]=i;
            if(freq[i]==2)ans[0]=i;
        }
        return ans;        
    }
}
```

## Approach 3 — 2026-03-22 11:02 (java)

*Runtime: 1 ms (faster than 99.6%) · Memory: 47.3 MB*

```java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length;
        int freq[]=new int[n*n+1];
        for(int x[]:grid){
            for(int y:x){
                freq[y]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)ans[0]=i;
            if(freq[i]==0)ans[1]=i;
        }
        return ans;
    }
}
```
