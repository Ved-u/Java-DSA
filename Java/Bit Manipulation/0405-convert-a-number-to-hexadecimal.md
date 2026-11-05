# 405. Convert a Number to Hexadecimal

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/convert-a-number-to-hexadecimal/
**Tags:** Math, String, Bit Manipulation

## Approach 1 — 2026-10-03 19:56 (java)

*Runtime: 1 ms · Memory: 42.9 MB*

```java
class Solution {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        char letters[] = {'a','b','c','d','e','f'};
        if(num>0){
            while(num>0){
                int rem = num%16;
                if(rem<10)sb.append(rem);
                else sb.append(letters[rem-10]);
                num/=16;
            }
        }else if(num<0){
            char[] bin = toBinString(num).toCharArray();
            for(int i=0;i<bin.length;i++){//1's comp
                bin[i] = (bin[i]=='0')? '1' : '0';
            }
            boolean carry = false;
            int idx = bin.length-1;
            if(bin[idx]=='0')bin[idx] = '1';
            else{
               bin[idx]='0';
               carry = true; 
            }
            idx--;
            while(carry&&idx>=0){//2's comp
                char curr = bin[idx];
                if(curr=='0'){
                    bin[idx] = '1';
                    carry = false;
                }else{
                    bin[idx] = '0';// carry = true; 
                }
                idx--;
            }
            int l = 0,r = 3;
            String str = new String(bin);
            while(r<bin.length){
                sb.append(byteToHex(str.substring(l,r+1)));
                l = r+1;
                r = l+3;
            }
            return sb.toString();
        }else{
            return "0";
        }
        return sb.reverse().toString();
    }
    String toBinString(int num){ if (num == Integer.MIN_VALUE) {
        return "10000000000000000000000000000000";
    }
        num = Math.abs(num);
        StringBuilder bin = new StringBuilder();
        while(num>0){
            bin.append(num%2);
            num/=2;
        }
        return String.format("%32s",bin.reverse().toString()).replace(' ','0');
    }
    char byteToHex(String str){
        char letters[] = {'a','b','c','d','e','f'};
        int num = Integer.parseInt(str, 2);
        char ans;
        int rem = num%16;
        if(rem<10)ans = (char)('0' + rem);
        else ans = letters[rem-10];
        return ans;
    }
}
```
