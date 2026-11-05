# 3870. Count Commas in Range

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-commas-in-range/
**Tags:** Math

## Approach 1 — 2026-09-08 20:46 (java)

*Runtime: 1 ms · Memory: 42.6 MB*

```java
class Solution {
    public int countCommas(int n) {
        if(n<1000)return 0;
        return n-999;
    }
    int coma(int a){
        if(a<1000)return 0;
        else if(a>=1000&&a<=9_99_999)return 1;
        else return -1;
    }
}
```
