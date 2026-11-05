# 3318. Find X-Sum of All K-Long Subarrays I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/
**Tags:** Array, Hash Table, Sliding Window, Heap (Priority Queue)

## Approach 1 — 2025-11-10 21:49 (java)

*Runtime: 11 ms (faster than 74.8%) · Memory: 47.3 MB*

```java
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int ans[] = new int[n - k + 1];
        for(int i = 0; i <= n - k; i++){
            int sub[] = Arrays.copyOfRange(nums, i, i + k);
            ans[i] = xsum(sub, x);
        }
    return ans;
    }
    int xsum(int nums[], int x){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int arr[][] = new int[map.size()][2];
        int idx = 0;
        for(int key : map.keySet()){
            arr[idx][0] = key;        
            arr[idx][1] = map.get(key); 
            idx++;
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[1] != b[1]) {
                return b[1] - a[1];         
            }
            return b[0] - a[0];             
        });
        int sum = 0;
        int limit = Math.min(x, arr.length);
        for(int i = 0; i < limit; i++){
            sum += arr[i][0] * arr[i][1];   
        }
    return sum;
    }
}
```
