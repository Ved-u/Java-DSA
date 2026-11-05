# 3271. Hash Divided String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/hash-divided-string/
**Tags:** String, Simulation

## Approach 1 — 2024-08-31 20:34 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 45.1 MB*

```java
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();){
            int sum=0;
            for(int j=1;j<=k;j++){
                sum+=s.charAt(i)-'a';
                i++;
            }
            //char x=(char)sum%26;
            ans.append((char)('a' + sum % 26));
        }
    return ans.toString();
    }
}
```

## Approach 2 — 2024-08-31 20:34 (java)

*Runtime: 2 ms (faster than 98.1%) · Memory: 44.9 MB*

```java
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();){
            int sum=0;
            for(int j=1;j<=k;j++){
                sum+=s.charAt(i)-'a';
                i++;
            }
            ans.append((char)('a'+sum%26));
        }
    return ans.toString();
    }
}
```
