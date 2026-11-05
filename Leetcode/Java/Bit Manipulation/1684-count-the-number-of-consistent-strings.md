# 1684. Count the Number of Consistent Strings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-the-number-of-consistent-strings/
**Tags:** Array, Hash Table, String, Bit Manipulation, Counting

## Approach 1 — 2024-09-12 06:45 (java)

*Runtime: 6 ms (faster than 92.6%) · Memory: 45.2 MB*

```java
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        boolean allow[]=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            allow[allowed.charAt(i)-'a']=true;
        }
        for(int i=0;i<words.length;i++){
            boolean check=true;
            for(int j=0;j<words[i].length();j++){
                if(!allow[words[i].charAt(j)-'a']){
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
