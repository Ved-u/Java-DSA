# 921. Minimum Add to Make Parentheses Valid

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
**Tags:** String, Stack, Greedy, Bracket Sequences

## Approach 1 — 2026-10-06 17:30 (java)

*Runtime: 2 ms · Memory: 43.1 MB*

```java
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> para=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='(')para.push(x);
            else if(para.size()>0&&para.peek()=='('&&x==')')para.pop();
            else para.push(x);
        }
        int ans=0;
        while(para.size()>0){
            para.pop();
            ans++;
        }
    return ans;
    }
}
```
