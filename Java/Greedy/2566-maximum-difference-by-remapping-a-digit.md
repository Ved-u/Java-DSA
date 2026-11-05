# 2566. Maximum Difference by Remapping a Digit

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
**Tags:** Math, Greedy

## Approach 1 — 2026-10-30 19:25 (java)

*Runtime: 2 ms · Memory: 41.6 MB*

```java
class Solution {
    public int minMaxDifference(int num) {
        String str = ""+num;
        StringBuilder x = new StringBuilder(str);
        int min=0,max=0;
        int idx=0;
        while(idx<x.length()&&x.charAt(idx)=='9')idx++;
        if(idx<x.length()){
            char ch = x.charAt(idx);
            for(int i=idx;i<x.length();i++){
                if(x.charAt(i)==ch)x.setCharAt(i,'9');
            }
            max=Integer.parseInt(x.toString());
        }else return num;
        idx=0;
        x = new StringBuilder(str);
        while(idx<x.length()&&x.charAt(idx)=='0')idx++;
        if(idx<x.length()){
            char ch = x.charAt(idx);
            for(int i=idx;i<x.length();i++){
                if(x.charAt(i)==ch)x.setCharAt(i,'0');
            }
            min=Integer.parseInt(x.toString());
        }else return num;
        return max-min;
    }
}
```
