# 1002. Find Common Characters

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-common-characters/
**Tags:** Array, Hash Table, String

## Approach 1 — 2024-06-05 06:34 (java)

*Runtime: 32 ms (faster than 6.7%) · Memory: 45 MB*

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        
        if (words.length == 1) {
            for (char x : words[0].toCharArray()) {
                ans.add(Character.toString(x));
            }
        } else {
            String firstWord = words[0];
            for (int i = 0; i < firstWord.length(); i++) {
                char c = firstWord.charAt(i);
                boolean check = true;
                for (int j = 1; j < words.length; j++) {
                    if (words[j].indexOf(c) == -1) {
                        check = false;
                        break;
                    } else {
                        // Remove the character from words[j] to handle multiple occurrences
                        words[j] = words[j].replaceFirst(Character.toString(c), "");
                    }
                }
                if (check) {
                    ans.add(Character.toString(c));
                }
            }
        }
        
        return ans;
    }
}
```

## Approach 2 — 2024-09-28 22:09 (java)

*Runtime: 35 ms (faster than 6.7%) · Memory: 45.6 MB*

```java
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            boolean check=true;
            for(int j=1;j<words.length;j++){
                if(!words[j].contains(""+words[0].charAt(i))){
                    check=false;
                    break;
                }else       
            words[j]=words[j].replaceFirst(Character.toString(words[0].charAt(i)),"");
            }
            if(check)ans.add(""+words[0].charAt(i));
        }
    return ans;
    }
}
```
