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

## Approach 2 — 2024-04-03 15:07 (java)

*Runtime: 5 ms (faster than 29.6%) · Memory: 42.4 MB*

```java
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int left=0;
        int right=0;
         int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')left++;
            if(s.charAt(i)==')')right++;
            if(left==right){
                //split string
                str.append(s.substring(start + 1, i)); 
                start = i + 1;
            }
        }
    return str.toString();    
    }
}
```

## Approach 3 — 2024-04-03 15:11 (java)

*Runtime: 2 ms (faster than 99.4%) · Memory: 41.9 MB*

```java
class Solution {
    public String removeOuterParentheses(String s) {
        int len=s.length();
        if(len<=2) return "";
        char[] c=s.toCharArray();
        StringBuilder newstring=new StringBuilder();
        int open=1;
        int openleft=0;
        for(int i=1;i<len;i++){
            if(c[i]=='('){
                open++;
                if(open >1) newstring.append('(');
            }
            else{
                if(open>1)newstring.append(')');
                open--;
            }
        }
        return newstring.toString();
    }
}
```

## Approach 4 — 2024-08-24 15:40 (java)

*Runtime: 5 ms (faster than 29.6%) · Memory: 42 MB*

```java
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    ans.append(c);
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    ans.append(c);
                }
            }
        }
    return ans.toString();
    }
}
```
