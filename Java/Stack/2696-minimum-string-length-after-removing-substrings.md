# 2696. Minimum String Length After Removing Substrings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-string-length-after-removing-substrings/
**Tags:** String, Stack, Simulation

## Approach 1 — 2024-06-24 10:03 (java)

*Runtime: 8 ms (faster than 12.1%) · Memory: 42.7 MB*

```java
class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(true){
            Boolean check=true;
            for(int i=0;i<sb.length()-1;i++){
                if((sb.charAt(i)=='A'&&sb.charAt(i+1)=='B')||
                    (sb.charAt(i)=='C'&&sb.charAt(i+1)=='D')){
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i);
                      //  i--;
                        check=false;
                    }
            }
            if(check)return sb.length();
        }
    }
}
```

## Approach 2 — 2024-06-24 10:06 (java)

*Runtime: 6 ms (faster than 33.7%) · Memory: 42.9 MB*

```java
class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
      //  while(true){
           // Boolean check=true;
            for(int i=0;i<sb.length()-1;i++){
                if((sb.charAt(i)=='A'&&sb.charAt(i+1)=='B')||
                    (sb.charAt(i)=='C'&&sb.charAt(i+1)=='D')){
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i);
                        //check=false;
                        i=-1;
                    }
            }
           // if(check)
      //  }
      return sb.length();
    }
}
```

## Approach 3 — 2024-06-24 10:08 (java)

*Runtime: 8 ms (faster than 12.1%) · Memory: 42.8 MB*

```java
class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean check = true;
            for (int i = 0; i < sb.length() - 1; i++) {
                if ((sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') ||
                    (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D')) {
                    sb.delete(i, i + 2);
                    check = false;
                    i--; // Move back one position to recheck after deletion
                }
            }
            if (check) {
                break; // Exit the while loop if no modifications were made
            }
        }
        return sb.length();
    }
}
```

## Approach 4 — 2024-06-24 10:09 (java)

*Runtime: 6 ms (faster than 33.7%) · Memory: 42.8 MB*

```java
class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if ((sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') ||
                (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D')) {
                sb.delete(i, i + 2);  // Delete the substring from i to i+2
                i = -1;  // Reset the loop index to start from the beginning
            }
        }
        return sb.length();
    }
}
```

## Approach 5 — 2024-06-24 10:10 (java)

*Runtime: 6 ms (faster than 33.7%) · Memory: 43.2 MB*

```java
class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            if((sb.charAt(i)=='A'&&sb.charAt(i+1)=='B')||
               (sb.charAt(i)=='C'&&sb.charAt(i+1)=='D')){
                    sb.delete(i, i + 2); 
                    i=-1;
                }
            }
    return sb.length();
    }
}
```
