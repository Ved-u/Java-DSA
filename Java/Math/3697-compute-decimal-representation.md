# 3697. Compute Decimal Representation

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/compute-decimal-representation/
**Tags:** Array, Math

## Approach 1 — 2026-05-05 18:35 (java)

*Runtime: 6 ms (faster than 11.0%) · Memory: 45 MB*

```java
class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder(""+n);
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)!='0'){
                ans.add(Integer.parseInt(sb.substring(i)));
                sb.setCharAt(i,'0');
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        int[] answer=new int[ans.size()];
        int idx=0;
        for(int x:ans){
            answer[idx++]=x;
        }
        return answer;
    }
}
```
