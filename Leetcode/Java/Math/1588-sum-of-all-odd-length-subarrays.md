# 1588. Sum of All Odd Length Subarrays

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
**Tags:** Array, Math, Prefix Sum

## Approach 1 — 2024-08-07 12:17 (java)

*Runtime: 2 ms (faster than 71.2%) · Memory: 41.3 MB*

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((j-i+1)%2==1)
                    for(int k=i;k<=j;k++)ans+=arr[k];
            }
        }
    return ans;    
    }
}
```

## Approach 2 — 2024-08-07 12:23 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.3 MB*

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Calculate the number of subarrays that include arr[i]
            int end = arr.length - i;
            int start = i + 1;
            int totalSubarrays = start * end;

            // Calculate the number of odd-length subarrays that include arr[i]
            int oddCount = (totalSubarrays + 1) / 2;

            // Add the contribution of arr[i] to the final sum
            sum += arr[i] * oddCount;
        }
        return sum;
    }
}
```

## Approach 3 — 2024-08-07 12:24 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41 MB*

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
        return sum;
    }
}
```
