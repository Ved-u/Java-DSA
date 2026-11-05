# 2390. Removing Stars From a String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/removing-stars-from-a-string/
**Tags:** String, Stack, Simulation

## Approach 1 — 2024-08-14 21:34 (java)

*Runtime: 36 ms (faster than 59.4%) · Memory: 45.2 MB*

```java
class Solution {
    public String removeStars(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                ans.deleteCharAt(ans.length()-1);
            }else ans.append(s.charAt(i));
        }
    return ans.toString();    
    }
}
```

## Approach 2 — 2026-08-07 21:35 (java)

*Runtime: 81 ms (faster than 31.4%) · Memory: 49 MB*

```java
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='*'){
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
```
