# 3090. Maximum Length Substring With Two Occurrences

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
**Tags:** Hash Table, String, Sliding Window

## Approach 1 — 2026-08-14 09:42 (java)

*Runtime: 1 ms · Memory: 43.3 MB*

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        int[] freq = new int[26];
        int l=0,r=0;
        while(l<=r&&r<s.length()){
            char x = s.charAt(r);
            int idx = x-'a';
            freq[idx]++;
            if(freq[idx]>2){
                do{
                    freq[s.charAt(l)-'a']--;
                    l++;
                }while(freq[idx]>2);
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
```
