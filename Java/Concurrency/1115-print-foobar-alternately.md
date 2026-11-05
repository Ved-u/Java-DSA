# 1115. Print FooBar Alternately

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/print-foobar-alternately/
**Tags:** Concurrency

## Approach 1 — 2026-04-14 18:08 (java)

*Runtime: 20 ms (faster than 89.8%) · Memory: 45.6 MB*

```java
class FooBar {
    private int n;
    private boolean flag = false;// false=foo
    public FooBar(int n) {
        this.n = n;
    }
    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (flag) {
                    this.wait();
                }
                printFoo.run();
                flag = true;
                this.notifyAll();
            }
        }
    }
    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (!flag) {
                    this.wait();
                }
                printBar.run();
                flag = false;
                this.notifyAll();
            }
        }
    }
}
```
