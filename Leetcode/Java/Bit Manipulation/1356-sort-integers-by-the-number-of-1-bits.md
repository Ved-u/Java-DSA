# 1356. Sort Integers by The Number of 1 Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
**Tags:** Array, Bit Manipulation, Sorting, Counting

## Approach 1 — 2024-08-31 17:40 (java)

*Runtime: 8 ms (faster than 71.7%) · Memory: 44.3 MB*

```java
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer brr[]=new Integer[arr.length];
        int i=0;
        for(int x:arr){
            brr[i++]=x;
        }
        Arrays.sort(brr, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if(countA == countB)return a - b;
            else return countA - countB;
        });
        i=0;
        for(Integer x:brr){
            arr[i++]=x;
        }
    return arr;
    }
}
```
