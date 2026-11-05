# 3941. Password Strength

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/password-strength/
**Tags:** Hash Table, String

## Approach 1 — 2026-05-24 10:06 (java)

*Runtime: 11 ms (faster than 80.0%) · Memory: 47 MB*

```java
class Solution {
    public int passwordStrength(String password) {
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char x=password.charAt(i);
            if(set.contains(x))continue;
            set.add(x);
            ans+=points(x);
        }
        return ans;
    }
    int points(char x){
        if(x>='a'&&x<='z')return 1;
        if(x>='A'&&x<='Z')return 2;
        if(x>='0'&&x<='9')return 3;
        if(x=='!'||x=='@'||x=='#'||x=='$')return 5;
        return 0;
    }
}
```
