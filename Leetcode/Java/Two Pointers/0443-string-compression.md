# 443. String Compression

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/string-compression/
**Tags:** Two Pointers, String

## Approach 1 — 2026-05-08 17:26 (java)

*Runtime: 2 ms (faster than 31.7%) · Memory: 45.3 MB*

```java
class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int idx=0;
        int temp=0;
        while(temp<chars.length&&idx<chars.length){
            ans++;
            int count=1;
            chars[idx++]=chars[temp];
            while(temp+1<chars.length&&chars[temp]==chars[temp+1]){
                count++;
                temp++;
            }
            if(count>1){
                String x=""+count;
                for(int i=0;i<x.length();i++){
                    ans++;
                    chars[idx++]=x.charAt(i);
                }
            }
            temp++;
        }
        return ans;
    }
}
```
