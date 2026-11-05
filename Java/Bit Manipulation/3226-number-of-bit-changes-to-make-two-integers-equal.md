# 3226. Number of Bit Changes to Make Two Integers Equal

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/
**Tags:** Bit Manipulation

## Approach 1 — 2024-07-21 08:58 (java)

*Runtime: 14 ms (faster than 5.1%) · Memory: 42.5 MB*

```java
class Solution {
    public int minChanges(int n, int k) {
        // Convert the numbers to binary strings
        String nS = Integer.toBinaryString(n);
        String nK = Integer.toBinaryString(k);

        // If n has fewer bits than k, it's impossible to match k
        if (nS.length() < nK.length()) {
            return -1;
        }

        // Pad the shorter binary string with leading zeros
        int maxLength = Math.max(nS.length(), nK.length());
        nS = String.format("%" + maxLength + "s", nS).replace(' ', '0');
        nK = String.format("%" + maxLength + "s", nK).replace(' ', '0');

        int ans = 0;
        
        // Count changes needed to match n to k
        for (int i = 0; i < maxLength; i++) {
            if (nS.charAt(i) == '1' && nK.charAt(i) == '0') {
                ans++;
            } else if (nS.charAt(i) == '0' && nK.charAt(i) == '1') {
                return -1; // It's impossible to turn a '0' in n into a '1' to match k
            }
        }
        
        return ans;
    }
}
```

## Approach 2 — 2024-07-21 08:59 (java)

*Runtime: 16 ms (faster than 5.1%) · Memory: 41.8 MB*

```java
class Solution {
    public int minChanges(int n, int k) {
        String nS = Integer.toBinaryString(n);
        String nK = Integer.toBinaryString(k);
        if (nS.length() < nK.length())return -1;
        int maxLength = Math.max(nS.length(), nK.length());
        nS = String.format("%" + maxLength + "s", nS).replace(' ', '0');
        nK = String.format("%" + maxLength + "s", nK).replace(' ', '0');
        int ans = 0;
        for (int i = 0; i < maxLength; i++) {
            if (nS.charAt(i) == '1' && nK.charAt(i) == '0') {
                ans++;
            }else if(nS.charAt(i) == '0' && nK.charAt(i) == '1') {
                return -1;
            }
        }
    return ans;
    }
}
```
