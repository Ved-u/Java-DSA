# 868. Binary Gap

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/binary-gap/
**Tags:** Bit Manipulation

## Approach 1 — 2026-03-28 15:42 (java)

*Runtime: 1 ms (faster than 49.0%) · Memory: 41.9 MB*

```java
class Solution {
    public int binaryGap(int n) {
        int max=0;
        String x=Integer.toBinaryString(n);
        boolean flag=false;
        int temp=0;
        for(int i=0;i<x.length();i++){
            // temp++;
            if(x.charAt(i)=='1'){
                if(flag){
                    max=Math.max(max,temp);
                    temp=0;
                }
                flag=true;
            }
            temp++;
        }
        return max;
    }
}
```
