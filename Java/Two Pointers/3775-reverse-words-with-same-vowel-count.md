# 3775. Reverse Words With Same Vowel Count

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/reverse-words-with-same-vowel-count/
**Tags:** Two Pointers, String, Simulation

## Approach 1 — 2025-12-14 08:19 (java)

*Runtime: 70 ms (faster than 49.5%) · Memory: 66.8 MB*

```java
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[]=s.split(" ");
        int freq=0;
        for(int i=0;i<arr[0].length();i++){
            char x=arr[0].charAt(i);
            if(x=='a')freq++;
            if(x=='e')freq++;
            if(x=='i')freq++;
            if(x=='o')freq++;
            if(x=='u')freq++;
        }
        sb.append(arr[0]);
        for(int i=1;i<arr.length;i++){
            int f=0;
            for(int j=0;j<arr[i].length();j++){
                char x=arr[i].charAt(j);
                if(x=='a')f++;
                if(x=='e')f++;
                if(x=='i')f++;
                if(x=='o')f++;
                if(x=='u')f++;
            }
            // boolean flag=true;
            // for(int j=0;j<freq.length;j++){
            //     if(freq[j]!=f[j]){
            //         flag=false;
            //         break;
            //     }
            // }
            if(freq==f){
                sb.append(" "+(new StringBuilder(arr[i]).reverse().toString()));
            }else{
                 sb.append(" "+arr[i]);
            }
        }
        return sb.toString();
    }
}
```
