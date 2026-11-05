# 9. Palindrome Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/palindrome-number/
**Tags:** Math

## Approach 1 — 2024-01-28 13:57 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 44.2 MB*

```java
class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }
       if(x>=0&&x<10){
           return true;
       }
       int palindrome=0;
       int digits;
       int y=x;
       while(y>0){
           digits=y%10;
           palindrome=palindrome*10+digits;
           y=y/10;
       }
       if(palindrome==x){
           return true;
       }else{
           return false;
       }  


        // String str=new String();
        // while(x>0){
        //     str.append(x%10);
        //     x=x/10;
        // }
        // for(int i=0;i<str.length();i++){
        //     for(int j=str.length;j>0;j--){
        //         if(str(i)==str(j)){
        //             return true;
        //         }else{
        //             return false;
        //             break;
        //         }
        //     }
        // }
    }
}
```

## Approach 2 — 2025-11-25 23:00 (java)

*Runtime: 5 ms (faster than 89.6%) · Memory: 46 MB*

```java
class Solution {
    public boolean isPalindrome(int n) {
         int ans=0;
       int temp=n;
       while(n>0){
        ans=ans*10+n%10;
        n/=10;
       }
       return temp==ans; 
    }
}
```

## Approach 3 — 2026-07-14 14:38 (java)

*Runtime: 5 ms (faster than 89.6%) · Memory: 45.7 MB*

```java
class Solution {
    public boolean isPalindrome(int n) {
       int ans=0;
       int temp=n;
       while(n>0){
        ans=ans*10+n%10;
        n/=10;
       }
       return temp==ans; 
    }
}
```
