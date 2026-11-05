# 2124. Check if All A's Appears Before All B's

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
**Tags:** String

## Approach 1 — 2024-06-10 15:28 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public boolean checkString(String s) {
        boolean check=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                check=false;
            }else if(s.charAt(i)=='a'&&check==false)return false;
        }
    return true;    
    }
}
```
