# 1137. N-th Tribonacci Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/n-th-tribonacci-number/
**Tags:** Math, Dynamic Programming, Memoization

## Approach 1 — 2024-04-25 00:06 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.3 MB*

```java
class Solution {
    public int tribonacci(int n) {
        int first=0;
        int second=1;
        int third=1;
        int next;
        int ans=0;
        for(int i=0;i<=n;i++){
            ans=first;
            next=first+second+third;
            first=second;
            second=third;
            third=next;
        }
    return ans;    
    }
}
```
