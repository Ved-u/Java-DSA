# 3922. Minimum Flips to Make Binary String Coherent

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-flips-to-make-binary-string-coherent/
**Tags:** String

## Approach 1 — 2026-05-10 11:01 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 47.8 MB*

```java
class Solution {
    public int minFlips(String s) {
        int[] f = {0, -1};
        int n = s.length();

        for (int i = 0; i < n; i++)
            f[s.charAt(i) & 1]++;

        if (f[1] == -1 || f[1] == -f[0]) return 0;

        return Math.min(
            f[0],
            f[1] - (s.charAt(0) & s.charAt(n - 1) & 1)
        );
    }
}
```

## Approach 2 — 2026-05-10 11:14 (java)

*Runtime: 8 ms (faster than 63.6%) · Memory: 47.5 MB*

```java
class Solution {
    public int minFlips(String s) {
        int zero=0,one=-1;
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i)=='0')zero++;
            else one++;
        if (one == -1 || s.length()==1) return 0;
        return Math.min(
            zero,
            one - (s.charAt(0) & s.charAt(s.length() - 1) & 1)
        );
    }
}
```

## Approach 3 — 2026-05-10 11:15 (java)

*Runtime: 8 ms (faster than 63.6%) · Memory: 47.6 MB*

```java
class Solution {
    public int minFlips(String s) {
        int zero=0,one=-1;
        int n=s.length();
        for (int i = 0; i < n; i++)
            if(s.charAt(i)=='0')zero++;
            else one++;
        if (one == -1 || s.length()==1) return 0;
        return Math.min(
            zero,
            one - (s.charAt(0) & s.charAt(s.length() - 1) & 1)
        );
    }
}
```

## Approach 4 — 2026-05-10 11:15 (java)

*Runtime: 8 ms (faster than 63.6%) · Memory: 47.7 MB*

```java
class Solution {
    public int minFlips(String s) {
        int zero=0,one=-1;
        int n=s.length();
        for (int i = 0; i < n; i++)
            if(s.charAt(i)=='0')zero++;
            else one++;
        if (one == -1 || n==1) return 0;
        return Math.min(
            zero,
            one - (s.charAt(0) & s.charAt(n - 1) & 1)
        );
    }
}
```
