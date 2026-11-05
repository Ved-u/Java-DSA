# 2432. The Employee That Worked on the Longest Task

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/
**Tags:** Array

## Approach 1 — 2024-08-20 20:01 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.9 MB*

```java
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans=logs[0][0],max=logs[0][1],over=logs[0][1];
        for(int x[]:logs){
            if(x[1]-over>max){
                max=x[1]-over;
                ans=x[0];
            }else  if(x[1]-over==max){
        
                ans=Math.min(ans,x[0]);
            }
            over=x[1];        
        }
    return ans;
    }
}
```

## Approach 2 — 2024-08-20 20:02 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans=logs[0][0],max=logs[0][1],over=logs[0][1];
        for(int x[]:logs){
            if(x[1]-over>max){
                max=x[1]-over;
                ans=x[0];
            }else if(x[1]-over==max)ans=Math.min(ans,x[0]);
            over=x[1];        
        }
    return ans;
    }
}
```
