# 3019. Number of Changing Keys

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-changing-keys/
**Tags:** String

## Approach 1 — 2024-06-07 16:15 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 41.9 MB*

```java
class Solution {
    public int countKeyChanges(String s) {
        int ans=0;
        if(s.length()==1)return 0;
        for(int i=1;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(i-1)))ans++;
        }
    return ans;    
    }
}
```
