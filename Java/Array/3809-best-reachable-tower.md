# 3809. Best Reachable Tower

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/best-reachable-tower/
**Tags:** Array

## Approach 1 — 2026-01-17 20:49 (java)

*Runtime: 3 ms (faster than 77.5%) · Memory: 218.7 MB*

```java
class Solution {
    public int[] bestTower(int[][] towers, int[] c, int radius) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int ptr=-1;
        for(int i=0;i<towers.length;i++){
            int a[]=towers[i];
            int xi=a[0],yi=a[1];
            if(dist(xi,yi,c[0],c[1])<=radius){
                if(ptr==-1){
                    ptr=i;
                }
                else{
                    int b[]=towers[ptr];
                    int xj=b[0],yj=b[1];
                    if(a[2]>b[2])ptr=i;
                    if(b[2]==a[2]){
                        if(xi<xj||(xi==xj&&yi<yj))ptr=i;
                    }
                }
            }
        }
        if(ptr!=-1){
            ans[0]=towers[ptr][0];
            ans[1]=towers[ptr][1];
        }
        return ans;
    }
    public int dist(int xi,int yi,int xj,int yj){
        return Math.abs(xi-xj)+Math.abs(yi-yj);
    }
}
```
