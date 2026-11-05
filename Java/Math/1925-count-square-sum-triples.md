# 1925. Count Square Sum Triples

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-square-sum-triples/
**Tags:** Math, Enumeration

## Approach 1 — 2025-12-09 20:26 (java)

*Runtime: 242 ms (faster than 10.4%) · Memory: 42.2 MB*

```java
class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(i*i+j*j==k*k)ans++;
                }
            }
        }
        return ans;
    }
}
```
