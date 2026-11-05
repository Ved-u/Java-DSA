# 917. Reverse Only Letters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-only-letters/
**Tags:** Two Pointers, String

## Approach 1 — 2024-08-29 20:54 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.6 MB*

```java
class Solution {
    public String reverseOnlyLetters(String s) {
       char ans[]=s.toCharArray();
       int left=0,right=ans.length-1;
       while(left<=right){
        if(Character.isLetter(ans[left])&&Character.isLetter(ans[right])){
            char temp=ans[left];
            ans[left]=ans[right];
            ans[right]=temp;
            left++;
            right--;
        }else if(!Character.isLetter(ans[left]))left++;
        else right--;
       }
    return new String(ans);    
    }
}
```

## Approach 2 — 2024-08-29 20:54 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public String reverseOnlyLetters(String s) {
       char ans[]=s.toCharArray();
       int left=0,right=ans.length-1;
       while(left<right){
        if(Character.isLetter(ans[left])&&Character.isLetter(ans[right])){
            char temp=ans[left];
            ans[left]=ans[right];
            ans[right]=temp;
            left++;
            right--;
        }else if(!Character.isLetter(ans[left]))left++;
        else right--;
       }
    return new String(ans);    
    }
}
```
