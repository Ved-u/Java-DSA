# 1492. The kth Factor of n

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/the-kth-factor-of-n/
**Tags:** Math, Number Theory, Prime Factorization

## Approach 1 — 2024-02-29 23:45 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 39.4 MB*

```java
class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        int ans=-1;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
            if(count==k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
```
