# 2710. Remove Trailing Zeros From a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
**Tags:** String

## Approach 1 — 2024-05-14 13:16 (java)

*Runtime: 2 ms (faster than 44.0%) · Memory: 45 MB*

```java
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder str=new StringBuilder();
        int index=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                index=i;
                break;
            }
        }
        for(int i=0;i<=index;i++)
            str.append(num.charAt(i));
    return str.toString();    
    }
}
```

## Approach 2 — 2024-05-14 13:18 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length() -1;
        while( num.charAt(i) == '0')
            i--;
    return num.substring(0,i+1);
    }
}
```
