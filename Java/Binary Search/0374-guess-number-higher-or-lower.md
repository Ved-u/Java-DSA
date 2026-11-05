# 374. Guess Number Higher or Lower

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/guess-number-higher-or-lower/
**Tags:** Binary Search, Interactive

## Approach 1 — 2026-08-20 01:00 (java)

*Runtime: 0 ms · Memory: 41.9 MB*

```java
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n,mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            int guess = guess(mid);
            if(0==guess)return mid;
            else if(guess==-1)r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
```
