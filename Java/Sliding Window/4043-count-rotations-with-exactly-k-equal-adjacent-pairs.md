# 4043. Count Rotations With Exactly K Equal Adjacent Pairs

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-rotations-with-exactly-k-equal-adjacent-pairs/
**Tags:** String, Sliding Window, Enumeration

## Approach 1 — 2026-09-14 19:57 (java)

*Runtime: 13 ms · Memory: 47 MB*

```java
class Solution {
    public int countRotations(String s, int k) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            String pref=s.substring(0,i);
            String rem=s.substring(i);
            if(score(rem+pref)==k)ans++;
        }
        return ans;
    }
    int score(String s){
        int ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))ans++;
        }
        return ans;
    }
}
```
