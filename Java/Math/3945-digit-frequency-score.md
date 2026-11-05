# 3945. Digit Frequency Score

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/digit-frequency-score/
**Tags:** Hash Table, Math

## Approach 1 — 2026-08-14 20:44 (java)

*Runtime: 4 ms · Memory: 43 MB*

```java
class Solution {
    public int digitFrequencyScore(int n) {
        String str = ""+n;
        int[] arr = new int[str.length()];
        for(int i=0 ; i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        
        }
        Arrays.sort(arr);
        int score =0 ;
        int count =1;
        for (int j=1;j<arr.length; j++){
            if(arr[j]==arr[j-1]){
                count++;
            }
            else{
                score =score+arr[j-1]*count;
                count=1;
            }
        }
        score += arr[arr.length - 1] * count;
        return score;
        }
    }
```
