# 3216. Lexicographically Smallest String After a Swap

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/
**Tags:** String, Greedy

## Approach 1 — 2024-08-05 22:05 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 43 MB*

```java
class Solution {
    public String getSmallestString(String s) {
        StringBuilder t=new StringBuilder(s);
        for(int i=0;i<s.length()-1;i++){
            int t1=t.charAt(i)-'0';
            int t2=t.charAt(i+1)-'0';
            if(t1>t2&&t1%2==t2%2){
                char temp=t.charAt(i);
                t.deleteCharAt(i);
                t.insert(i+1,temp);
                break;
            }
        }
    return t.toString();    
    }
}
```
