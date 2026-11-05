# 901. Online Stock Span

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/online-stock-span/
**Tags:** Stack, Design, Monotonic Stack, Data Stream

## Approach 1 — 2024-08-24 22:53 (java)

*Runtime: 30 ms (faster than 79.3%) · Memory: 55.8 MB*

```java
class StockSpanner {
    Stack<Pair> st=new Stack<>();
    int indx=0;
    public StockSpanner() {

    }
    public int next(int price) {
       indx++;
        int span = 1;
        while (!st.isEmpty() && price >= st.peek().element) {
            span += st.pop().indx;
        }
        st.push(new Pair(price, span));
        return span;
    }
}
class Pair{
    int element,indx;
    public Pair(int x,int idx){
        element=x;
        indx=idx;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
```
