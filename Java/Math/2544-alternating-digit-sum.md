# 2544. Alternating Digit Sum

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/alternating-digit-sum/
**Tags:** Math

## Approach 1 — 2024-02-09 17:28 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.4 MB*

```java
class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int k = n;  // Use the actual number for counting digits

        while (k > 0) {
            count++;
            k /= 10;
        }

    
        int z = (count % 2 != 0) ? 1 : -1;  // Corrected the condition
        int sum = 0;

        while (n > 0) {
            sum += (n % 10) * z;
            z = -z;
            n /= 10;
        }

        return sum;
    }

}
```

## Approach 2 — 2024-02-09 17:32 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.2 MB*

```java
class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        int k=n;
        while(k>0){
            count++;
            k/=10;
        }
        int z=0;
        if(count%2==0)z=-1;
        else z=1;
        int sum=0;
        while(n>0){
            sum+= (n%10)*(z);
            z= -z;
            n/=10;
        }
        return sum;
    }
}
```

## Approach 3 — 2024-02-09 17:41 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.1 MB*

```java
class Solution {
    public int alternateDigitSum(int n) {
      int counter=0;
      int k=n;
      int sign;
      int sum=0;
      while(k>0){
          k/=10;
          counter++;
      }
      if(counter%2==0)  sign=-1;
      else sign=1;
     while(n>0){
        sum=sum+(n%10*sign) ;
        n/=10;
        sign=-sign;
     }
     return sum;
    }
}
```
