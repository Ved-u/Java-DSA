# 2917. Find the K-or of an Array

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-k-or-of-an-array/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2026-05-07 10:53 (java)

*Runtime: 21 ms (faster than 5.5%) · Memory: 46.8 MB*

```java
class Solution {
    public int findKOr(int[] nums, int k) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.format("%32s",Integer.toBinaryString(nums[i]))
                    .replace(' ', '0');
        }
        StringBuilder ans=new StringBuilder(String.format("%32s","")
                                            .replace(' ','0'));
        for(int i=0;i<ans.length();i++){
            int count=0;
            for(String x:arr){
                if(x.charAt(i)=='1')count++;
            }
            if(count>=k)ans.setCharAt(i,'1');
        }
        return Integer.parseInt(ans.toString(),2);
    }
}
```
