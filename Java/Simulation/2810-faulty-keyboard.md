# 2810. Faulty Keyboard

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/faulty-keyboard/
**Tags:** String, Simulation

## Approach 1 — 2024-04-03 14:05 (java)

*Runtime: 5 ms (faster than 48.4%) · Memory: 45.1 MB*

```java
class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                ans = new StringBuilder(reverse(ans.toString()));
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public String reverse(String str) {
        char[] reversed = str.toCharArray();
        int left = 0;
        int right = reversed.length - 1;
        char temp;
        while (left <= right) {
            temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
            left++;
            right--;
        }
        return new String(reversed);
    }
}
```

## Approach 2 — 2024-04-03 14:06 (java)

*Runtime: 3 ms (faster than 98.6%) · Memory: 44.8 MB*

```java
class Solution {
    public String finalString(String s) {
        StringBuilder sb =new StringBuilder(s.length());
        for(char c:s.toCharArray())
        {
            if(c=='i')
            {
                sb.reverse();
            } 
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```
