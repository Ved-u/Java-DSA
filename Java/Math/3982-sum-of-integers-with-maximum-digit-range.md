# 3982. Sum of Integers with Maximum Digit Range

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/
**Tags:** Array, Math

## Approach 1 — 2026-07-05 19:31 (java)

*Runtime: 3 ms (faster than 20.3%) · Memory: 46.4 MB*

```java
class Solution {
    public int maxDigitRange(int[] nums) {
        int max = 0;
        int[] some = new int[nums.length];
        for(int j = 0; j < nums.length;j++){
            String str = ""+nums[j];
            int largest=0,smallest=10;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                largest = Math.max(largest,ch-'0');
                smallest = Math.min(smallest,ch-'0');
            }
            int sum = largest - smallest;
            some[j] = sum;
            max = Math.max(max,sum);
        }
        int ans = 0;
        for(int j = 0; j < nums.length;j++){
            if(some[j] == max)ans += nums[j];
        }
        return ans;
    }
}
```
