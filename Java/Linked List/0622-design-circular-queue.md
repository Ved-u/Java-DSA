# 622. Design Circular Queue

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/design-circular-queue/
**Tags:** Array, Linked List, Design, Queue

## Approach 1 — 2026-10-11 17:28 (java)

*Runtime: 5 ms · Memory: 46.8 MB*

```java
class Node{
    int val;
    Node next = null;
    Node prev = null;
    public Node(int val){
        this.val = val;
    }
    public Node(Node next, Node prev, int val){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class MyLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;
    public MyLinkedList() {}
    public int get(int index) {
        Node temp = getIdx(index);
        if(temp == null)return -1;
        return temp.val;
    }
    private Node getIdx(int index){
        if(index>=size||index<0)return null;
        // to reduce the iteration in doubly linked list we'll find if current node is closer to head or tail then search
        Node temp = null;
        if(index < size/2){
            int curr = 0;
            temp = head;
            while(curr!=index){
                temp = temp.next;
                curr++;
            }
        }else{
            int curr = size-1;
            temp = tail;
            while(curr!=index){
                temp = temp.prev;
                curr--;
            }
        }
        return temp;
    }
    public void addAtHead(int val) {
        Node n = new Node(val);
        if(head != null){
            n.next = head;
            head.prev = n;
        }else{
            tail = n;
        }
        head = n;
        size++;
    }
    public boolean addAtTail(int val) {
        Node n = new Node(val);
        if(tail != null){
            tail.next = n;
            n.prev = tail;
        }else{
            head = n;
        }
        tail = n;
        size++;
        return true;
    }
    public void addAtIndex(int index, int val) {
        if(index==0)addAtHead(val);
        else if(index==size)addAtTail(val);
        else{
            Node temp = getIdx(index);
            if(temp == null)return;
            Node newNode = new Node(temp,temp.prev,val);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
        }
    }
    public boolean deleteAtIndex(int index) {
        Node temp = getIdx(index);
        if(temp == null)return false;
        if(head==temp)head=temp.next;
        if(tail==temp)tail=temp.prev;
        Node prev = temp.prev;
        Node next = temp.next;
        if(prev!=null)prev.next = next;
        if(next!=null)next.prev = prev;
        size--;
        return true;
    }
}
class MyCircularQueue {
    MyLinkedList mll = new MyLinkedList();
    int k;
    public MyCircularQueue(int k) {
        this.k=k;
    }
    public boolean enQueue(int value) {
       if(isFull()) return false;
       return mll.addAtTail(value);
    }
    public boolean deQueue() {
        return mll.deleteAtIndex(0);
    }
    public int Front() {
        return mll.get(0);
    }
    public int Rear() {
        return mll.get(mll.size-1);
    }
    public boolean isEmpty() {
       if(mll.size==0) return true;
        return false; 
    }
    public boolean isFull() {
        if(mll.size==k) return true;
        return false;
    }
}
```
