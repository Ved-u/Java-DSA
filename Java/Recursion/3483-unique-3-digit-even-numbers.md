# 3483. Unique 3-Digit Even Numbers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/unique-3-digit-even-numbers/
**Tags:** Array, Hash Table, Recursion, Enumeration

## Approach 1 — 2026-09-11 21:13 (java)

*Runtime: 27 ms · Memory: 47.1 MB*

```java
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j||j==k||k==i)continue;
                    int x = Integer.parseInt(""+digits[i]+digits[j]+digits[k]);
                    if((""+x).length()!=3)continue;
                    if(x%2==1)continue;
                    if(!set.contains(x))set.add(x);
                }
            }
        }
        return set.size();
    }
}
```
