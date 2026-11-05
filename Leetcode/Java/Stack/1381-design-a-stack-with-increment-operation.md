# 1381. Design a Stack With Increment Operation

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/design-a-stack-with-increment-operation/
**Tags:** Array, Stack, Design

## Approach 1 — 2024-08-23 12:31 (java)

*Runtime: 5 ms (faster than 98.3%) · Memory: 45.6 MB*

```java
class CustomStack {
    int count=0,size=0;
    int arr[]=new int[1000];
    public CustomStack(int max) {
        size=max;
    }
    public void push(int x) {
        if(count==size)return;
        arr[count++]=x;
    }
    public int pop() {
        if(count==0)return -1;
    return arr[--count];
    }
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, count); i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
```

## Approach 2 — 2024-08-23 12:32 (java)

*Runtime: 5 ms (faster than 98.3%) · Memory: 45.8 MB*

```java
class CustomStack {
    int count=0,size=0;
    int arr[];
    public CustomStack(int max) {
        size=max;
        arr=new int[max];
    }
    public void push(int x) {
        if(count==size)return;
        arr[count++]=x;
    }
    public int pop() {
        if(count==0)return -1;
    return arr[--count];
    }
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, count); i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
```
