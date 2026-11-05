# 2315. Count Asterisks

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-asterisks/
**Tags:** String

## Approach 1 — 2024-04-03 15:35 (java)

*Runtime: 4 ms (faster than 6.9%) · Memory: 41.5 MB*

```java
class Solution {
    public int countAsterisks(String s) {
        int ans = 0;
        int count = 0;
        boolean insidePipe = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                count++;
                insidePipe = !insidePipe;
            }else if (s.charAt(i) == '*' && !insidePipe)   ans++;
            else if (s.charAt(i) == '*' && count % 2 == 0) ans++;
        }
        return ans;
    }
}
```

## Approach 2 — 2024-04-03 15:36 (java)

*Runtime: 2 ms (faster than 70.7%) · Memory: 41.4 MB*

```java
class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int flag=0;
        for(char ch : s.toCharArray()){
            if(flag==0 && ch=='|'){
                flag++;
                continue;
            }
            if(flag==1 && ch=='|') {
                flag--;
                continue;
            }
            if(flag==0 && ch=='*')count++;
        }
        return count;
    }
}
```
