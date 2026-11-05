# 1310. XOR Queries of a Subarray

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/xor-queries-of-a-subarray/
**Tags:** Array, Bit Manipulation, Prefix Sum

## Approach 1 — 2024-09-13 20:22 (java)

*Runtime: 700 ms (faster than 11.6%) · Memory: 58.7 MB*

```java
class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int ans[]=new int[q.length];
        for(int i=0;i<ans.length;i++){
            int xor=0;
            for(int j=q[i][0];j<=q[i][1];j++){
                xor^=arr[j];
            }
            ans[i]=xor;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-09-14 12:02 (java)

*Runtime: 2 ms (faster than 100.0%) · Memory: 58.4 MB*

```java
class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int ans[]=new int[q.length];
        for(int i=1;i<arr.length;i++){
            arr[i]^=arr[i-1];
        }
        for(int i=0;i<ans.length;i++){
            if(q[i][0]==0)ans[i]=arr[q[i][1]];
            else ans[i]=arr[q[i][1]]^arr[q[i][0]-1];
        }
    return ans;
    }
}
```

## Approach 3 — 2024-09-14 12:03 (java)

*Runtime: 127 ms (faster than 12.3%) · Memory: 54.9 MB*

```java
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] s = new int[n + 1];
        for(int i=1; i<=n; i++) {
            s[i] = s[i-1] ^ arr[i-1];
            System.out.print(s[i] + " ");
        }
        int m = queries.length;
        int[] res = new int[m];
        for(int i=0; i<m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = s[r + 1] ^ s[l];
        }
return res;
    }
}
```
