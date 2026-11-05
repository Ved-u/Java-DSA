# 1769. Minimum Number of Operations to Move All Balls to Each Box

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
**Tags:** Array, String, Prefix Sum

## Approach 1 — 2024-04-26 23:58 (java)

*Runtime: 103 ms (faster than 51.1%) · Memory: 44.5 MB*

```java
class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];

        for (int i = 0; i < ans.length; i++) {
            int left = 0, right = boxes.length() - 1;
            int minMoves = 0;

            while (left < i && boxes.charAt(left) == '0') {
                left++; // Skip leading '0's on the left
            }
            while (right > i && boxes.charAt(right) == '0') {
                right--; // Skip trailing '0's on the right
            }

            while (left < i) {
                if (boxes.charAt(left) == '1') {
                    minMoves += i - left;
                }
                left++;
            }

            while (right > i) {
                if (boxes.charAt(right) == '1') {
                    minMoves += right - i;
                }
                right--;
            }

            ans[i] = minMoves;
        }

        return ans;
    }
}
```

## Approach 2 — 2024-04-27 00:05 (java)

*Runtime: 119 ms (faster than 47.3%) · Memory: 44.5 MB*

```java
class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];

        for (int i = 0; i < ans.length; i++) {
            int left = 0, right = boxes.length() - 1;
            int minMoves = 0;

            // // Skip leading '0's on the left
            // while (left < i && boxes.charAt(left) == '0') {
            //     left++;
            // }

            // // Skip trailing '0's on the right
            // while (right > i && boxes.charAt(right) == '0') {
            //     right--;
            // }

            // Calculate moves for boxes to the left of 'i'
            while (left < i) {
                if (boxes.charAt(left) == '1') {
                    minMoves += i - left;
                }
                left++;
            }

            // Calculate moves for boxes to the right of 'i'
            while (right > i) {
                if (boxes.charAt(right) == '1') {
                    minMoves += right - i;
                }
                right--;
            }

            ans[i] = minMoves;
        }

        return ans;
    }
}
```

## Approach 3 — 2024-04-27 00:07 (java)

*Runtime: 124 ms (faster than 44.0%) · Memory: 44.4 MB*

```java
class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
        int left;
        int right;
        int minMoves;
        for(int i=0;i<ans.length;i++){
            left=0;
            right=boxes.length()-1;
            minMoves=0;
            while(left<i){
                if(boxes.charAt(left)=='1')minMoves+=(Math.abs(i-left));
               
                left++;
                
            }while(right>i){
                 if(boxes.charAt(right)=='1')minMoves+=(Math.abs(i-right));
                 right--;
            }
            ans[i]=minMoves;
        }
    return ans;     
    }
}
```

## Approach 4 — 2024-04-27 00:10 (java)

*Runtime: 121 ms (faster than 45.9%) · Memory: 45 MB*

```java
class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
        for(int i=0;i<ans.length;i++){
            int left=0 , right=boxes.length()-1;
            while(left<i){
                if(boxes.charAt(left)=='1')ans[i]+=Math.abs(i-left);
                left++;
            }while(right>i){
                 if(boxes.charAt(right)=='1')ans[i]+=Math.abs(i-right);
                 right--;
            }
        }
    return ans;     
    }
}
```

## Approach 5 — 2025-01-06 09:11 (java)

*Runtime: 103 ms (faster than 51.1%) · Memory: 45.1 MB*

```java
class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < ans.length; i++) {
            int left = 0, right = boxes.length() - 1;
            int minMoves = 0;
            while (left < i && boxes.charAt(left) == '0') {
                left++; 
            }
            while (right > i && boxes.charAt(right) == '0') {
                right--; 
            }
            while (left < i) {
                if (boxes.charAt(left) == '1') {
                    minMoves += i - left;
                }
                left++;
            }
            while (right > i) {
                if (boxes.charAt(right) == '1') {
                    minMoves += right - i;
                }
                right--;
            }
            ans[i] = minMoves;
        }
    return ans;
    }
}
```
