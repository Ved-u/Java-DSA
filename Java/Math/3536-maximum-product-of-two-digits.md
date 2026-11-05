# 3536. Maximum Product of Two Digits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-product-of-two-digits/
**Tags:** Math, Sorting

## Approach 1 — 2026-07-25 20:02 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.8 MB*

```java
class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int freq[] = new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0)continue;
            for(int j=(freq[i]>=2)?i:i+1;j<freq.length;j++){
                if(freq[j]==0)continue;
                max=Math.max(max,i*j);
            }
        }
        return max;
    }
}
```
