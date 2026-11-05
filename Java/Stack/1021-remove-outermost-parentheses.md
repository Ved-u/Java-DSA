# 1021. Remove Outermost Parentheses

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-outermost-parentheses/
**Tags:** String, Stack, Bracket Sequences

## Approach 1 — 2026-10-08 11:58 (java)

*Runtime: 6 ms · Memory: 43.2 MB*

```java
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char x:s.toCharArray()){
            if(x=='('){
                if(stk.size()>0)ans.append(x);
                stk.push(x);
            }else{
                stk.pop();
                if(stk.size()>0)ans.append(x);
            }
        }
    return ans.toString();
    }
}
```
