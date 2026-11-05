# 1385. Find the Distance Value Between Two Arrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
**Tags:** Array, Two Pointers, Binary Search, Sorting

## Approach 1 — 2026-11-05 20:19 (java)

*Runtime: 4 ms · Memory: 45.2 MB*

```java
class Solution {//optimize this
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            boolean flag=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=false;
                    break;
                }
            }
            if(flag)ans++;
        }
        return ans;
    }
}
```
