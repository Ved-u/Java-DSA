# 3270. Find the Key of the Numbers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-key-of-the-numbers/
**Tags:** Math

## Approach 1 — 2024-08-31 20:25 (java)

*Runtime: 2 ms (faster than 41.9%) · Memory: 41.3 MB*

```java
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=0;
        String s1=""+num1;
        String s2=""+num2;
        String s3=""+num3;
        while(s1.length()!=4){
            s1="0"+s1;
        }
        while(s2.length()!=4){
            s2="0"+s2;
        }
        while(s3.length()!=4){
            s3="0"+s3;
        }
        for(int i=0;i<4;i++){
            int min=10;
            min=Math.min(min,s1.charAt(i)-'0');
            min=Math.min(min,s2.charAt(i)-'0');
            min=Math.min(min,s3.charAt(i)-'0');
            ans=ans*10+min;
        }
    return ans;
    }
}
```
