# 2697. Lexicographically Smallest Palindrome

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/lexicographically-smallest-palindrome/
**Tags:** Two Pointers, String, Greedy

## Approach 1 — 2024-04-03 11:28 (java)

*Runtime: 8 ms (faster than 52.0%) · Memory: 45 MB*

```java
class Solution {
    public String makeSmallestPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ans=new char[s.length()];
        while(left<=right){
            if(s.charAt(left)<=s.charAt(right)){
                ans[left]=s.charAt(left);
                ans[right]=s.charAt(left);
            }else{
                ans[left]=s.charAt(right);
                ans[right]=s.charAt(right);
            }
        left++;
        right--; 
        if(left==right)ans[left]=s.charAt(right);   
        }
    return new String(ans);    
    }
}
```
