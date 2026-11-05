# 3823. Reverse Letters Then Special Characters in a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/
**Tags:** Two Pointers, String, Simulation

## Approach 1 — 2026-03-07 19:52 (java)

*Runtime: 2 ms (faster than 86.6%) · Memory: 44.5 MB*

```java
class Solution {
    public String reverseByType(String s) {
        StringBuilder ans = new StringBuilder(s);
        int left=0,right=s.length()-1;
        //letter
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(Character.isLetter(l)&&Character.isLetter(r)){
                ans.setCharAt(left, r);
                ans.setCharAt(right, l);
                left++;
                right--;
            }else if(Character.isLetter(l)){
                right--;
            }else{
                left++;
            }
        }
        //special character
        left=0; right=s.length()-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(!Character.isLetter(l)&&!Character.isLetter(r)){
                ans.setCharAt(left, r);
                ans.setCharAt(right, l);
                left++;
                right--;
            }else if(!Character.isLetter(l)){
                right--;
            }else{
                left++;
            }
        }
        return ans.toString();
    }
}
```
