# 434. Number of Segments in a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-segments-in-a-string/
**Tags:** String

## Approach 1 — 2024-08-14 23:13 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41 MB*

```java
class Solution {
    public int countSegments(String s) {
        if(s.length()==0)return 0;
       int ans=1;
       s=s.trim();
       if(s.length()==0)return 0;
       for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' ')ans++;
       }
    return ans;    
    }
}
```

## Approach 2 — 2024-08-14 23:14 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int countSegments(String s) {
       int ans=1;
       s=s.trim();
       if(s.length()==0)return 0;
       for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' ')ans++;
       }
    return ans;    
    }
}
```
