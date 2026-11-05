# 1796. Second Largest Digit in a String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/second-largest-digit-in-a-string/
**Tags:** Hash Table, String

## Approach 1 — 2024-08-27 20:05 (java)

*Runtime: 1 ms (faster than 98.7%) · Memory: 42.1 MB*

```java
class Solution {
    public int secondHighest(String s) {
        int arr[]=new int[10];
        for(char x:s.toCharArray()){
            if(x-'0'>=0&&x-'0'<=9)arr[x-'0']++;
        }
        int max=-1,ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)continue;
         if(i>max){
            ans=max;
            max=i;
         }
        }
    return ans;
    }
}
```
