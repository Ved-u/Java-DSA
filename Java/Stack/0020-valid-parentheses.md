# 20. Valid Parentheses

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/valid-parentheses/
**Tags:** String, Stack, Bracket Sequences

## Approach 1 — 2024-08-23 14:40 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 41.4 MB*

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> brack=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='('||x=='['||x=='{'){
                brack.push(x);
            }else {
                if(brack.size()<1)return false;
                char top=brack.peek();
                if((x == ')' && top == '(') || 
                    (x == ']' && top == '[') || 
                    (x == '}' && top == '{'))brack.pop();
                else return false;
            }  
        }
    return brack.size()==0;
    }
}
```

## Approach 2 — 2024-08-24 16:30 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 41.4 MB*

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='('||x=='['||x=='{')stk.push(x);
            else{
                if(stk.isEmpty())return false;
                if((stk.peek()=='['&&x==']')||
                   (stk.peek()=='('&&x==')')||
                   (stk.peek()=='{'&&x=='}'))stk.pop();
                else return false;
            }
        }
    return stk.size()==0;
    }
}
```

## Approach 3 — 2026-05-01 14:43 (java)

*Runtime: 3 ms (faster than 84.6%) · Memory: 43.5 MB*

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('||x=='['||x=='{')stack.push(x);
            else if(stack.isEmpty())return false;
            else if(stack.peek()=='('&&x==')'||
                    stack.peek()=='['&&x==']'||
                    stack.peek()=='{'&&x=='}')stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
```
