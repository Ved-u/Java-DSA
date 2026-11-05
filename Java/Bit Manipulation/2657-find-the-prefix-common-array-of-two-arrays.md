# 2657. Find the Prefix Common Array of Two Arrays

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
**Tags:** Array, Hash Table, Bit Manipulation

## Approach 1 — 2026-05-20 10:03 (java)

*Runtime: 2 ms (faster than 76.6%) · Memory: 47.6 MB*

```java
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[A.length];
        int freq[]=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            freq[B[i]]++;
            if(freq[A[i]]==2)count++;
            if(freq[B[i]]==2)count++;
            if(A[i]==B[i])count--;
            ans[i]=count;
        }
        return ans;
    }
}
```
