# 2283. Check if Number Has Equal Digit Count and Digit Value

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
**Tags:** Hash Table, String, Counting

## Approach 1 — 2024-06-10 21:46 (java)

*Runtime: 1 ms (faster than 66.4%) · Memory: 41.2 MB*

```java
class Solution {
    public boolean digitCount(String num) {
        for(int i=0;i<num.length();i++){
           int times=0;
           for(int j=0;j<num.length();j++){
                if(Integer.parseInt(Character.toString(num.charAt(j)))==i)times++;
           }
        if((Integer.parseInt(Character.toString(num.charAt(i)))!=times))return false; 
        }
    return true;       
    }
}
```
