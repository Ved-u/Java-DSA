# 2337. Move Pieces to Obtain a String

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/move-pieces-to-obtain-a-string/
**Tags:** Two Pointers, String

## Approach 1 — 2026-06-19 16:15 (java)

*Runtime: 54 ms (faster than 5.9%) · Memory: 57.3 MB*

```java
class Solution {
    public boolean canChange(String start, String target) {
        record Pair(char ch, int idx) {}
        Stack<Pair> stack1 = new Stack<>();
        Stack<Pair> stack2 = new Stack<>();
        int s = 0, t = 0;
        while (true) {
            while (s < start.length() && start.charAt(s) == '_') s++;
            while (t < target.length() && target.charAt(t) == '_') t++;
            if (s == start.length() && t == target.length()) break;
            if (s == start.length() || t == target.length())return false;
            if (start.charAt(s) != target.charAt(t))return false;
            stack1.push(new Pair(start.charAt(s), s));
            stack2.push(new Pair(target.charAt(t), t));
            s++;t++;
        }
        if (stack1.size() != stack2.size()) return false;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            Pair p1 = stack1.pop();
            Pair p2 = stack2.pop();
            char c = p1.ch();
            int startIdx = p1.idx();
            int targetIdx = p2.idx();
            if (c == 'L') {
                if (targetIdx > startIdx) return false;
            }else{ // R
                if (targetIdx < startIdx) return false;
            }  
        }
        return true;
    }
}
```
