# 2469. Convert the Temperature

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/convert-the-temperature/
**Tags:** Math

## Approach 1 — 2024-01-26 11:54 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.9 MB*

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+ 273.15;
        double farenheit=(celsius*1.80)+32;
        double arrr[]=new double[2];
        arrr[0]=kelvin;
        arrr[1]=farenheit;
        return arrr;
    }
}
```

## Approach 2 — 2024-07-17 09:58 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.7 MB*

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
    ans[0]=celsius+273.15;
    ans[1]=celsius*1.80+32.00;
    return ans;    
    }
}
```
