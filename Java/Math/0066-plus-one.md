# 66. Plus One

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/plus-one/
**Tags:** Array, Math

## Approach 1 — 2024-03-06 19:49 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int[] plusOne(int[] digits) {   
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
           int ans[]=new int[digits.length+1];
           ans[0]=1;


        return ans;
    }
}
```

## Approach 2 — 2024-03-06 21:39 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.7 MB*

```java
class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=1;i<=digits.length;i++){
            if(carry==0)break;
            if(digits[digits.length-i]<9){
                digits[digits.length-i]+=1;
                carry=0;
                break;
            }
            if(digits[digits.length-i]==9){
                digits[digits.length-i]=0;
            }
        }
        if(carry==1){
            int ans[]=new int[digits.length+1];
           
            int index=0;
            for(int num:digits){
                ans[index++]=num;
            }
             ans[0]=carry;
             return ans;
        }
        return digits;
    }
}
```

## Approach 3 — 2024-03-06 21:44 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=1;i<=digits.length;i++){
            if(digits[digits.length-i]<9){
                digits[digits.length-i]+=1;
                break;
            }
            if(digits[digits.length-i]==9){
                digits[digits.length-i]=0;
            }
        }
        if(digits[0]==0){
            int ans[]=new int[digits.length+1];
            int index=0;
            for(int num:digits){
                ans[index++]=num;
            }
             ans[0]=1;
             return ans;
        }
        return digits;
    }
}
```
