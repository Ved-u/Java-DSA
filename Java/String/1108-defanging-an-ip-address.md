# 1108. Defanging an IP Address

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/defanging-an-ip-address/
**Tags:** String

## Approach 1 — 2024-04-15 15:15 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')str.append("[.]");
            else str.append(address.charAt(i));
        }
    return str.toString();    
    }
}
```
