# 232. Implement Queue using Stacks

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/implement-queue-using-stacks/
**Tags:** Stack, Design, Queue

## Approach 1 — 2024-10-19 20:54 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.5 MB*

```java
class MyQueue {
    Stack<Integer> stk=new Stack<>();
    public MyQueue() {}
    public void push(int x) {
        Stack<Integer> st=new Stack<>();
        while(!stk.isEmpty())
            st.push(stk.pop());
        stk.push(x);
        while(!st.isEmpty())
            stk.push(st.pop());
    }
    public int pop() {
        return stk.pop();
    }
    public int peek() {
        return stk.peek();
    }
    public boolean empty() {
        return stk.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
```
