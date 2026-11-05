# 412. Fizz Buzz

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/fizz-buzz/
**Tags:** Math, String, Simulation

## Approach 1 — 2024-06-10 21:39 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 44.7 MB*

```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0)ans.add("FizzBuzz");
            else if(i%3==0)ans.add("Fizz");
            else if(i%5==0)ans.add("Buzz");
            else ans.add(Integer.toString(i));
        }
    return ans;    
    }
}
```
