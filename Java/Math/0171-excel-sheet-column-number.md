# 171. Excel Sheet Column Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/excel-sheet-column-number/
**Tags:** Math, String

## Approach 1 — 2024-08-08 14:41 (java)

*Runtime: 1 ms (faster than 92.4%) · Memory: 42.3 MB*

```java
class Solution {
    public int titleToNumber(String c) {
        int ans=0;
        int mul=c.length()-1;
        for(char x:c.toCharArray()){
            ans+=Math.pow(26,mul)*(x-'A'+1);
            mul--;
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-08-08 14:42 (java)

*Runtime: 1 ms (faster than 92.4%) · Memory: 42.2 MB*

```java
class Solution {
    public int titleToNumber(String columnTitle) {
       int result = 0; 
        for(int i = 0; i < columnTitle.length(); i++){
            result = result*26 + ((columnTitle.charAt(i))-'A'+1);
        }
        return result;
    }
}
```

## Approach 3 — 2024-08-08 14:43 (java)

*Runtime: 1 ms (faster than 92.4%) · Memory: 42.1 MB*

```java
class Solution {
    public int titleToNumber(String columnTitle) {
       int result = 0; 
        for(int i = 0; i < columnTitle.length(); i++){
            result = result*26+columnTitle.charAt(i)-'A'+1;
        }
        return result;
    }
}
```

## Approach 4 — 2024-09-14 13:22 (java)

*Runtime: 1 ms (faster than 92.4%) · Memory: 41.3 MB*

```java
class Solution {
    public int titleToNumber(String ct) {
        int ans=0;
        for(int i=0;i<ct.length();i++){
            ans=ans*26+ct.charAt(i)-'A'+1;
        }
    return ans;
    }
}
```

## Approach 5 — 2024-09-14 13:23 (java)

*Runtime: 1 ms (faster than 92.4%) · Memory: 42 MB*

```java
class Solution {
    public int titleToNumber(String ct) {
        int ans=0;
        for(int i=0;i<ct.length();i++){
            ans=ans*26+(ct.charAt(i)-'A'+1);
        }
    return ans;
    }
}
```
