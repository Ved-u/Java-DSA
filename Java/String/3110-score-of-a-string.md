# 3110. Score of a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/score-of-a-string/
**Tags:** String

## Approach 1 — 2026-08-10 21:08 (java)

*Runtime: 1 ms (faster than 97.6%) · Memory: 43.4 MB*

```java
class Solution {
    public int scoreOfString(String s) {
      int ans=0;
      for(int i=1;i<s.length();i++){
        char curr=s.charAt(i);
        char prev=s.charAt(i-1);
        ans=ans+Math.abs(curr-prev);
      }

      return ans;

    }
}
```

## Approach 2 — 2024-06-01 16:54 (java)

*Runtime: 1 ms (faster than 97.6%) · Memory: 41.5 MB*

```java
class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            ans+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
    return ans;    
    }
}
```

## Approach 3 — 2026-08-10 21:03 (java)

*Runtime: 1 ms (faster than 97.6%) · Memory: 43.3 MB*

```java
class Solution {
    public int scoreOfString(String s) {
        int ans =0;
        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            ans = ans+ Math.abs(curr-prev);
        }
        return ans;
    }
}
```
