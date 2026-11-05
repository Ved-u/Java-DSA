# 1441. Build an Array With Stack Operations

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/build-an-array-with-stack-operations/
**Tags:** Array, Stack, Simulation

## Approach 1 — 2024-08-19 17:38 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.8 MB*

```java
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int count=0;
        for(int i=1;i<=n;i++){
            if(count==target.length)break;
            if(target[count]==i){
                ans.add("Push");
                count++;
            }    
            else {ans.add("Push");
            ans.add("Pop");}
        }
    return ans;
    }
}
```

## Approach 2 — 2025-10-14 07:42 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 42.8 MB*

```java
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int count=0;
        for(int i=1;i<=n;i++){
            if(count==target.length)break;
            if(target[count]==i){
                ans.add("Push");
                count++;
            }    
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
    return ans;
    }
}
```
