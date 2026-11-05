# 1324. Print Words Vertically

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/print-words-vertically/
**Tags:** Array, String, Simulation

## Approach 1 — 2026-06-19 10:27 (java)

*Runtime: 1 ms (faster than 91.6%) · Memory: 43 MB*

```java
class Solution {
    public List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] arr = s.split(" ");
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(String x:arr){
            max=Math.max(max,x.length());
            sb.append(x.charAt(0));
        }
        ans.add(sb.toString());
        for(int i = 1;i<max;i++){
            sb.setLength(0);
            for(String x:arr){
                if(x.length()-1<i)sb.append(" ");
                else sb.append(x.charAt(i));
            }
            int end = sb.length()-1;
            while(end>=0&&sb.charAt(end) == ' ')end--;
            sb.setLength(end+1);
            ans.add(sb.toString());
        }
        return ans;
    }
}
```
