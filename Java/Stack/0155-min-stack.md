# 155. Min Stack

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/min-stack/
**Tags:** Stack, Design

## Approach 1 — 2024-08-26 18:02 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 44.9 MB*

```java
class MinStack {
    Stack<Integer> mstk=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
    }
    public void push(int val) {
        mstk.push(val);
        if(min.size()==0)min.push(val);
        else if(min.peek()<val)min.push(min.peek());
        else min.push(val);
    }
    public void pop() {
        mstk.pop();
        min.pop();
    }
    public int top() {
    return mstk.peek();
    }
    public int getMin() {
    return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

## Approach 2 — 2024-08-26 18:07 (java)

*Runtime: 5 ms (faster than 100.0%) · Memory: 44.9 MB*

```java
class MinStack {
    Stack<Integer> mstk=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int val) {
        mstk.push(val);
        if(min.size()==0)min.push(val);
        else if(min.peek()<val)min.push(min.peek());
        else min.push(val);
    }
    public void pop() {
        mstk.pop();
        min.pop();
    }
    public int top() {
    return mstk.peek();
    }
    public int getMin() {
    return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

## Approach 3 — 2024-08-26 19:23 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 44.7 MB*

```java
class MinStack {
    Stack<Long> stk = new Stack<>();
    long min = 0;

    public void push(int x) {
        long val = x;
        if (stk.isEmpty()) {
            stk.push(val);
            min = val;
        } else if (val < min) {
            stk.push(2 * val - min);
            min = val;
        } else {
            stk.push(val);
        }
    }

    public void pop() {
        if (stk.peek() < min) {
            min = 2 * min - stk.pop();
        } else {
            stk.pop();
        }
    }

    public int top() {
        if (stk.peek() < min) {
            return (int) min;
        } else {
            return (int)((long)stk.peek());
        }
    }

    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

## Approach 4 — 2024-08-26 20:12 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 44.7 MB*

```java
class MinStack {
    Stack<Long> stk=new Stack<>();
    long min=0;
    public void push(int val) {
        long x=val;
        if(stk.size()==0){
            stk.push(x);
            min=x;
        }else {
            if (x < min) {
                stk.push(2 * x - min);
                min = x;
            } else {
                stk.push(x);
            }
        }
    }
    public void pop() {
        if(stk.peek()<min) min=2*min-stk.pop();
        else stk.pop();
    }
    public int top() {
        long x=stk.peek();
        if(x<min)return (int)min;
        else return (int)x; 
    }
    public int getMin() {
      return (int)min;  
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```

## Approach 5 — 2024-10-25 09:15 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 44.6 MB*

```java
class MinStack {
    Stack<Long> stk=new Stack<>();
    long min=0;
    public void push(int val) {
        long x=val;
        if(stk.size()==0){
            stk.push(x);
            min=x;
        }else{
            if (x < min) {
                stk.push(2 * x - min);
                min = x;
            }else stk.push(x);
        }
    }
    public void pop() {
        if(stk.peek()<min) min=2*min-stk.pop();
        else stk.pop();
    }
    public int top() {
        long x=stk.peek();
        if(x<min)return (int)min;
        else return (int)x; 
    }
    public int getMin() {
      return (int)min;  
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
```
