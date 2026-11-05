# 3324. Find the Sequence of Strings Appeared on the Screen

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/
**Tags:** String, Simulation

## Approach 1 — 2024-10-20 08:24 (java)

*Runtime: 16 ms (faster than 8.9%) · Memory: 56.9 MB*

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        String current = "";  // This represents the string on the screen

        for (char targetChar : target.toCharArray()) {
            // Step 1: Append 'a' if the current string is empty
            if (current.length() == 0) {
                current = "a";
                ans.add(current);
            }

            // Step 2: Append 'a' after each complete string if the length is less
            if (current.length() < target.indexOf(targetChar) + 1) {
                current += "a";
                ans.add(current);
            }
            
            // Step 3: Use Key 2 to change the last character to match the target
            while (current.charAt(current.length() - 1) != targetChar) {
                char lastChar = current.charAt(current.length() - 1);
                if (lastChar == 'z') {
                    lastChar = 'a';
                } else {
                    lastChar = (char) (lastChar + 1);
                }
                current = current.substring(0, current.length() - 1) + lastChar;
                ans.add(current);
            }

            // Step 4: If the next character to add is 'a', append it
            if (current.length() < target.length()) {
                current += "a";
                ans.add(current);
            }
        }
        return ans;
    }
}
```

## Approach 2 — 2024-10-20 08:26 (java)

*Runtime: 15 ms (faster than 11.6%) · Memory: 56.9 MB*

```java
class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        String current = "";
        for (char targetChar : target.toCharArray()) {
            if (current.length() == 0) {
                current = "a";
                ans.add(current);
            }
            if (current.length() < target.indexOf(targetChar) + 1) {
                current += "a";
                ans.add(current);
            }
            while (current.charAt(current.length() - 1) != targetChar) {
                char lastChar = current.charAt(current.length() - 1);
                if (lastChar == 'z') {
                    lastChar = 'a';
                } else {
                    lastChar = (char) (lastChar + 1);
                }
        current = current.substring(0, current.length() - 1) + lastChar;
                ans.add(current);
            }
            if (current.length() < target.length()) {
                current += "a";
                ans.add(current);
            }
        }
        return ans;
    }
}
```

## Approach 3 — 2024-11-07 18:03 (java)

*Runtime: 6 ms (faster than 89.7%) · Memory: 55.8 MB*

```java
class Solution {
    public List<String> stringSequence(String target) {
        List<String> res=new ArrayList();
        StringBuilder sb=new StringBuilder();
        for(char t:target.toCharArray()){
            sb.append('a');
            res.add(sb.toString());
            char curr='a';
            while(curr!=t){
                curr=(curr=='z')?'a':(char)(curr+1);
                sb.setCharAt(sb.length()-1, curr);
                res.add(sb.toString());
            }
        }
    return res;
    }
}
```
