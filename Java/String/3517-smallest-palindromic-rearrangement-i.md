# 3517. Smallest Palindromic Rearrangement I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/smallest-palindromic-rearrangement-i/
**Tags:** String, Sorting, Counting Sort

## Approach 1 — 2026-07-29 12:27 (java)

*Runtime: 34 ms (faster than 45.3%) · Memory: 48.3 MB*

```java
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if (middle != 0) {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
```

## Approach 2 — 2026-07-29 17:52 (java)

*Runtime: 35 ms (faster than 41.5%) · Memory: 48.1 MB*

```java
class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char middle = '0';
        for(int i=0;i<freq.length;i++){
            char x = (char)('a'+i);
            if(freq[i]%2==1)middle = x;
            for(int j=1;j<=freq[i]/2;j++){
                sb.append(x);
            }
        }
        StringBuilder ans = new StringBuilder(sb);
        if(middle != '0')ans.append(middle);
        ans.append(sb.reverse());
        return ans.toString();
    }
}
```
