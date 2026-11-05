# 2553. Separate the Digits in an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/separate-the-digits-in-an-array/
**Tags:** Array, Simulation

## Approach 1 — 2026-05-11 09:06 (java)

*Runtime: 7 ms (faster than 22.8%) · Memory: 45.9 MB*

```java
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int x:nums){
            String str=""+x;
            for(int i=0;i<str.length();i++){
                ans.add(str.charAt(i)-'0');
            }
        }
        int[] answer=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
```
