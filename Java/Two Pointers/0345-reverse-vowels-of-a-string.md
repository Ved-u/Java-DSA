# 345. Reverse Vowels of a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-vowels-of-a-string/
**Tags:** Two Pointers, String

## Approach 1 — 2025-01-03 10:07 (java)

*Runtime: 2 ms (faster than 99.0%) · Memory: 45.4 MB*

```java
class Solution {
    public String reverseVowels(String s) {
        char ans[]=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            if(vowel(ans[left])&&vowel(ans[right])){
                char temp=ans[left];
                ans[left]=ans[right];
                ans[right]=temp;
                left++;right--;
            }else if(vowel(ans[left]))right--;
            else left++;
        }
    return new String(ans);
    }
    boolean vowel(char ch){
        return ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
```
