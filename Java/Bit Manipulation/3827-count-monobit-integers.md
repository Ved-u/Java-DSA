# 3827. Count Monobit Integers

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-monobit-integers/
**Tags:** Bit Manipulation, Enumeration

## Approach 1 — 2026-02-01 08:09 (java)

*Runtime: 15 ms (faster than 18.1%) · Memory: 46.6 MB*

```java
class Solution {
    public int countMonobit(int n) {
        int ans=0;
        for(int i=0;i<=n;i++){
            String x = Integer.toBinaryString(i);
            if(x.length()==1){
                ans++;
                continue;
            }
            boolean flag=true;
            for(int j=1;j<x.length();j++){
                if(x.charAt(j)!=x.charAt(j-1)){
                    flag=false;
                    break;
                }
            }
            if(flag)ans++;
        }
        return ans;
    }
    
}
```
