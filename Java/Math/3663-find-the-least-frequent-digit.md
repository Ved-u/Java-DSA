# 3663. Find The Least Frequent Digit

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-least-frequent-digit/
**Tags:** Array, Hash Table, Math, Counting

## Approach 1 — 2025-09-05 10:13 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public int getLeastFrequentDigit(int n) {
        int freqA[]=new int[10];
        while(n>0){
            int digit = n%10;
            freqA[digit]++;
            n/=10;
        }
        int freq=1000,idx=10;
        for(int i=0;i<freqA.length;i++){
            if(freqA[i]==0)continue;
            else if(freq==freqA[i]){
                idx=Math.min(idx,i);
            }
            else if(freqA[i]<freq){
                freq=freqA[i];
                idx=i;
            }
        }
    return idx;
    }
}
```
