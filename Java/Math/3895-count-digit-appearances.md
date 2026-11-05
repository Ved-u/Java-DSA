# 3895. Count Digit Appearances

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/count-digit-appearances/
**Tags:** Array, Math

## Approach 1 — 2026-04-11 20:09 (java)

*Runtime: 7 ms (faster than 11.2%) · Memory: 47.2 MB*

```java
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int x:nums){
            String y=""+x;
            for(int i=0;i<y.length();i++){
                char z=(char)('0'+digit);
                if(y.charAt(i)==z)ans++;
            }
        }
        return ans;
    }
}
```
