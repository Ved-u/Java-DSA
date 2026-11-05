# 3766. Minimum Operations to Make Binary Palindrome

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-operations-to-make-binary-palindrome/
**Tags:** Array, Two Pointers, Binary Search, Bit Manipulation

## Approach 1 — 2025-12-06 20:41 (java)

*Runtime: 1055 ms (faster than 8.3%) · Memory: 47.9 MB*

```java
class Solution {
    public int[] minOperations(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            //String x = palindrome(nums[i]);
            int op=0,decx=nums[i],incx=nums[i];
    while(!isPalindrome(palindrome(decx))&&!isPalindrome(palindrome(incx))){
                decx--;
                incx++;
               op++;
            }
            ans[i]=op;
        }
        return ans;
    }
    boolean isPalindrome(String x){
        int l=0,r=x.length()-1;
        while(l<r){
            if(x.charAt(l)!=x.charAt(r))return false;
            l++;r--;
        }
        return true;
    }
    String palindrome(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(""+n%2);
            n/=2;
        }
        return sb.toString();
    }
}
```
