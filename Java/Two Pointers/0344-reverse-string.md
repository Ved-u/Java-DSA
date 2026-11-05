# 344. Reverse String

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reverse-string/
**Tags:** Two Pointers, String

## Approach 1 — 2024-03-30 10:00 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 49.2 MB*

```java
class Solution {
    public void reverseString(char[] s) {
        char[]temp=new char[s.length];
        int count=0;
        for(int i=s.length-1;i>=0;i--){
            temp[count++]=s[i];
        }
        for(int i=0;i<temp.length;i++){
            s[i]=temp[i];
        }
    }
}
```

## Approach 2 — 2024-03-30 10:20 (java)

*Runtime: 1 ms (faster than 41.4%) · Memory: 45.6 MB*

```java
class Solution {
    public void reverseString(char[] s) {
     int left = 0;
    int right = s.length - 1;
    char temp='A';
    while (left < right) {
        // Swap characters at left and right pointers
        temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        // Move pointers towards the center
        left++;
        right--;
    }
    }
}
```

## Approach 3 — 2024-03-30 10:21 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 45.6 MB*

```java
class Solution {
    public void reverseString(char[] s) {
     int left = 0;
    int right = s.length - 1;
    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
    }
}
```

## Approach 4 — 2024-06-02 11:16 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 45.6 MB*

```java
class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char temp;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
```

## Approach 5 — 2024-06-02 15:24 (java)

*Runtime: 1 ms (faster than 41.4%) · Memory: 48.9 MB*

```java
class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){   
            s[left]=(char)(s[left]^s[right]);
            s[right]=(char)(s[left]^s[right]);
            s[left]=(char)(s[left]^s[right]);
            left++;
            right--;
        }
    }
}
```

## Approach 6 — 2026-08-10 20:49 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 48 MB*

```java
class Solution {
    public void reverseString(char[] s) {
       int start=0;
       int end=s.length-1;

       while(start<=end){
        char temp;
       temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
       }
    }
}
```
