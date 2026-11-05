# 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
**Tags:** String, Greedy

## Approach 1 — 2024-04-26 16:25 (java)

*Runtime: 6 ms (faster than 73.1%) · Memory: 44.9 MB*

```java
class Solution {
    public int minPartitions(String n) {
        int ans=-1;
        for(int i=0;i<n.length();i++){
            if((n.charAt(i)-'0')>ans)ans=n.charAt(i)-'0';
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-04-26 16:26 (java)

*Runtime: 3 ms (faster than 99.9%) · Memory: 44.7 MB*

```java
class Solution {
    public int minPartitions(String n) {
        if(n.contains("9"))return 9;
        if(n.contains("8"))return 8;
        if(n.contains("7"))return 7;
        if(n.contains("6"))return 6;
        if(n.contains("5"))return 5;
        if(n.contains("4"))return 4;
        if(n.contains("3"))return 3;
        if(n.contains("2"))return 2;
        return 1;
    }
}
```
