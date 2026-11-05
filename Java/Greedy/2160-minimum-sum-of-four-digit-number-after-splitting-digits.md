# 2160. Minimum Sum of Four Digit Number After Splitting Digits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
**Tags:** Math, Greedy, Sorting

## Approach 1 — 2026-09-30 19:20 (java)

*Runtime: 4 ms · Memory: 42.8 MB*

```java
class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int idx = 0;
        while(num>0){
            arr[idx++] = num % 10;
            num /= 10;
        }
        int num1 = 0, num2 = 0;
        Arrays.sort(arr);
        num1 = Integer.parseInt(""+arr[0]+arr[3]);
        num2 = Integer.parseInt(""+arr[1]+arr[2]);
        return num1 + num2; 
    }
}
```
