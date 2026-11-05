# 2914. Minimum Number of Changes to Make Binary String Beautiful

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
**Tags:** String

## Approach 1 — 2024-11-05 18:41 (java)

*Runtime: 4 ms (faster than 22.3%) · Memory: 44.7 MB*

```java
class Solution {
    public int minChanges(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(i%2==0&&s.charAt(i)!=s.charAt(i+1))ans++;
        }
    return ans;
    }
}
```
