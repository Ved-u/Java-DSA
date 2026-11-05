# 1190. Reverse Substrings Between Each Pair of Parentheses

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
**Tags:** String, Stack, Bracket Sequences

## Approach 1 — 2026-06-19 12:05 (java)

*Runtime: 4 ms (faster than 36.5%) · Memory: 43 MB*

```java
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='(')stack.push(i);
            else if(sb.charAt(i)==')'){
                int idx = stack.pop();
                sb.deleteCharAt(idx);
                sb.deleteCharAt(--i);
                i--;
                reverse(sb,idx,i);
            }
        }
        return sb.toString();
    }
    public void reverse(StringBuilder sb, int l, int r){
        while(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;r--;
        }
    }
}
```
