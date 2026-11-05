# 1614. Maximum Nesting Depth of the Parentheses

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
**Tags:** String, Stack, Bracket Sequences

## Approach 1 — 2026-09-28 19:23 (java)

*Runtime: 1 ms · Memory: 42.8 MB*

```java
class Solution {
    public int maxDepth(String s) {
        int open=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')open++;
            if(s.charAt(i)==')')open--;
            if(open>ans)ans=open;
        }
    return ans;    
    }
}
```
