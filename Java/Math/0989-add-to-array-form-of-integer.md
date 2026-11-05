# 989. Add to Array-Form of Integer

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/add-to-array-form-of-integer/
**Tags:** Array, Math

## Approach 1 — 2026-07-08 16:20 (java)

*Runtime: 7 ms (faster than 14.7%) · Memory: 47.6 MB*

```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for(int x:num){
            sb.append(x);
        }
        String one = sb.toString();
        sb.setLength(0);
        while(k>0){
            sb.append(k%10);
            k/=10;
        }
        one = addStrings(one, sb.reverse().toString());
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<one.length();i++){
            ans.add(one.charAt(i)-'0');
        }
        return ans;
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0) 
        {
            int sum = carry;
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
```
