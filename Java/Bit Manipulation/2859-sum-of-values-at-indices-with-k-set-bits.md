# 2859. Sum of Values at Indices With K Set Bits

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
**Tags:** Array, Bit Manipulation

## Approach 1 — 2024-07-06 10:00 (java)

*Runtime: 3 ms (faster than 13.4%) · Memory: 44.4 MB*

```java
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            int temp=i,count=0;
            while(temp>0){
                if(temp%2==1)count++;
                temp/=2;
            }
            if(count==k)ans+=nums.get(i);
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-07-06 10:02 (java)

*Runtime: 1 ms (faster than 100.0%) · Memory: 44.3 MB*

```java
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) 
            if (countSetBits(i) == k) 
                sum += nums.get(i); 
    return sum;
    }
    private int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
    return count;
    }
}
```
