# 1114. Print in Order

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/print-in-order/
**Tags:** Concurrency

## Approach 1 — 2026-03-31 16:16 (java)

*Runtime: 9 ms (faster than 99.9%) · Memory: 44.1 MB*

```java
class Foo {
    private boolean firstDone = false;
    private boolean secondDone = false;

    public synchronized void first(Runnable printFirst) {
        printFirst.run();
        firstDone = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!firstDone) {
            wait();
        }
        printSecond.run();
        secondDone = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!secondDone) {
            wait();
        }
        printThird.run();
    }
}
```
