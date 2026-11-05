# 3746. Minimum String Length After Balanced Removals

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-string-length-after-balanced-removals/
**Tags:** String, Stack, Counting

## Approach 1 — 2025-11-16 08:08 (java)

*Runtime: 3 ms (faster than 99.2%) · Memory: 47.1 MB*

```java
class Solution {
    public int minLengthAfterRemovals(String s) {
        int freq[]=new int[2];
        for(char x:s.toCharArray()){
            if(x=='a')freq[0]++;
            else freq[1]++;
        }
        if(freq[0]>freq[1])return freq[0]-freq[1];
        if(freq[0]<freq[1])return freq[1]-freq[0];
    return 0;
    }
}
```
