# 3751. Total Waviness of Numbers in Range I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/
**Tags:** Math, Dynamic Programming, Enumeration

## Approach 1 — 2025-11-22 20:19 (java)

*Runtime: 68 ms (faster than 9.1%) · Memory: 46.7 MB*

```java
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            if(i<100)continue;
            StringBuilder s=new StringBuilder();
            int temp=i;
            while(temp>0){
                s.append(temp%10);
                temp/=10;
            }
            int peak=0,valley=0;
            for(int j=1;j<s.length()-1;j++){
                //peak
                if(s.charAt(j)>s.charAt(j-1)&&s.charAt(j)>s.charAt(j+1))peak++;
                //valley
                if(s.charAt(j)<s.charAt(j-1)&&s.charAt(j)<s.charAt(j+1))valley++;
            }
            ans+=(peak+valley);
        }
        return ans;
    }
}
```
