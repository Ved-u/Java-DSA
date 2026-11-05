# 414. Third Maximum Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/third-maximum-number/
**Tags:** Array, Sorting

## Approach 1 — 2024-09-21 12:09 (java)

*Runtime: 4 ms (faster than 45.4%) · Memory: 43 MB*

```java
class Solution {
    public int thirdMax(int[] nums) {
        // Use three variables to store the first, second, and third max values
        Integer max1 = null, max2 = null, max3 = null;

        for (Integer num : nums) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue; // Skip duplicates

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        // Return max3 if it exists, otherwise return max1
        return max3 != null ? max3 : max1;
    }
}
```

## Approach 2 — 2024-09-21 12:18 (java)

*Runtime: 4 ms (faster than 45.4%) · Memory: 43 MB*

```java
class Solution {
    public int thirdMax(int[] nums) {
       Integer m1=null,m2=null,m3=null;
       for(Integer x:nums){
        if(x.equals(m1)||x.equals(m2)||x.equals(m3))continue;
        if(m1==null||x>m1){
            m3=m2;
            m2=m1;
            m1=x;
        }else if(m2==null||x>m2){
            m3=m2;
            m2=x;
        }else if(m3==null||x>m3){
            m3=x;
        }
       }
    return m3==null?m1:m3; 
    }
}
```
