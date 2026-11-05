# 2515. Shortest Distance to Target String in a Circular Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/
**Tags:** Array, String

## Approach 1 — 2026-04-15 10:10 (java)

*Runtime: 1 ms (faster than 94.7%) · Memory: 46.8 MB*

```java
class Solution {
    public int closestTarget(String[] words, String target, int idx) {
        int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE,n=words.length;
        if(words[idx].equals(target))return 0;
        boolean flag=true;
        int steps=0;
        for(int i=idx;i!=idx||flag;i=(i+1)%n){//right
            if(i==idx)flag=false;
            if(words[i].equals(target)){
                right=steps;
                break;
            }
            steps++;
        }
        steps=0;
        flag=true;
        for(int i=idx;i!=idx||flag;i=(i-1+n)%n){//left
            if(i==idx)flag=false;
            if(words[i].equals(target)){
                left=steps;
                break;
            }
            steps++;
        }
        if(left==Integer.MAX_VALUE&&right==Integer.MAX_VALUE)return -1;
    return Math.min(left,right);
    }
}
```

## Approach 2 — 2026-04-15 10:12 (java)

*Runtime: 1 ms (faster than 94.7%) · Memory: 47.1 MB*

```java
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) 
    {
        int n = words.length;
        for (int step = 0; step < n; step++) {
            int forward = (startIndex + step) % n;
            int backward = (startIndex - step + n) % n;
            if (words[forward].equals(target) || words[backward].equals
            (target)) {
                return step;
            }
        }
        return -1;
    }
}
```
