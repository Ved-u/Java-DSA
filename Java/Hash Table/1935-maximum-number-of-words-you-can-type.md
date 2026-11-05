# 1935. Maximum Number of Words You Can Type

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-number-of-words-you-can-type/
**Tags:** Hash Table, String

## Approach 1 — 2025-09-15 10:52 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 42.1 MB*

```java
class Solution {
    public int canBeTypedWords(String text, String bl) {
        int ans=0;
        boolean ch[]=new boolean[26];
        for(char x:bl.toCharArray()){
            ch[x-'a']=true;
        }
        String arr[]=text.split(" ");
        for(String x:arr){
            boolean check=true;
            for(char y:x.toCharArray()){
                if(ch[y-'a']==true){
                    check=false;
                    break;
                }
            }
            if(check)ans++;
        }
        return ans;
    }
}
```
