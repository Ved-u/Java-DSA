# 2108. Find First Palindromic String in the Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
**Tags:** Array, Two Pointers, String

## Approach 1 — 2024-03-30 11:49 (java)

*Runtime: 2 ms (faster than 74.6%) · Memory: 45.1 MB*

```java
class Solution {
    public String firstPalindrome(String[] words) {
        int left;
        int right;
        String str;
        boolean check=false;
        for(int i=0;i<words.length;i++){
            str=words[i];
            right=str.length()-1;
            left=0;
            while(left<=right){
                if(str.charAt(left)!=str.charAt(right)){
                    check=false;
                    break;
                }
                else check=true;
                left++;
                right--;
            }
            if(check)return words[i];
        }
        return "";
    }
}
```
