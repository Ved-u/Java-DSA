# 2554. Maximum Number of Integers to Choose From a Range I

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/
**Tags:** Array, Hash Table, Binary Search, Greedy, Sorting

## Approach 1 — 2024-12-06 10:21 (java)

*Runtime: 46 ms (faster than 73.9%) · Memory: 45.5 MB*

```java
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:banned)set.add(x);
        int sum=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i))continue;
            sum+=i;
            if(sum>maxSum)break;
            ans++;
        }
    return ans;
    }
}
```

## Approach 2 — 2024-12-06 10:23 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 45.6 MB*

```java
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int result = 0;
        boolean[] isBanned = new boolean[10001];
        for (int ban : banned) isBanned[ban] = true;
        for (int i = 1; i <= n; i++) {
            if (sum + i > maxSum) break;
            if (!isBanned[i]) {
                sum += i;
                result++;
            }
        }
    return result;
    }
}
```
