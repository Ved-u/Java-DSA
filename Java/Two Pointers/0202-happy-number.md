# 202. Happy Number

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/happy-number/
**Tags:** Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm

## Approach 1 — 2024-08-05 21:13 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 40.8 MB*

```java
import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
//while loop is not used here because initially slow and 
//fast pointer will be equal only, so the loop won't run.
        do {
//slow moving one step ahead and fast moving two steps ahead

            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

//if a cycle exists, then the number is not a happy number
//and slow will have a value other than 1

        return slow == 1;
    }
    
//Finding the square of the digits of a number

    public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}
```

## Approach 2 — 2024-08-05 22:38 (java)

*Runtime: 1 ms (faster than 83.6%) · Memory: 41.8 MB*

```java
class Solution {
    public int sum(int x){
        int ans=0,d;
        while(x!=0){
            d = (x%10);
            ans += d*d;
            x /=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int temp=n;
        int arr[]=new int[850];
        while(true){
            if(n==1)return true;
            n = sum(n);
            if(arr[n]>=1)break;
            arr[n]=1;
           
        }
        return false;
    }
}
```
