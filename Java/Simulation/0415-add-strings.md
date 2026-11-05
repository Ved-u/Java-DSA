# 415. Add Strings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/add-strings/
**Tags:** Math, String, Simulation

## Approach 1 — 2026-07-08 16:13 (java)

*Runtime: 3 ms (faster than 19.6%) · Memory: 45.3 MB*

```java
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int n1=num1.length()-1,n2=num2.length()-1,carry=0;
        while(n1>=0&&n2>=0){
            int sum = num1.charAt(n1--)-'0'+num2.charAt(n2--)-'0'+carry;
            carry=0;
            if(sum>9){
                sum = sum%10;
                carry = 1;
            }
            ans.append(""+sum);
        }
        if(n1<0){
            while(n2>=0){
                int sum = num2.charAt(n2--)-'0'+carry;
                carry=0;
                if(sum>9){
                    sum = sum%10;
                    carry = 1;
                }
                ans.append(""+sum);
            }
        }else{
            while(n1>=0){
                int sum = num1.charAt(n1--)-'0'+carry;
                carry=0;
                if(sum>9){
                    sum = sum%10;
                    carry = 1;
                }
                ans.append(""+sum);
            }
        }
        if(carry!=0)ans.append(""+carry);
        return ans.reverse().toString();
    }
}
```
