# 641. Design Circular Deque

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/design-circular-deque/
**Tags:** Array, Linked List, Design, Queue

## Approach 1 — 2026-10-11 00:46 (java)

*Runtime: 5 ms · Memory: 46.2 MB*

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
    public void addAtTail(int val) {
        Node n = new Node(val);
        if(tail != null){
            tail.next = n;
            n.prev = tail;
        }else{
            head = n;
        }
        tail = n;
        size++;
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
// Linked List version 
class MyCircularDeque {
    MyLinkedList mll = new MyLinkedList();
    int k;
    public MyCircularDeque(int k) {
        this.k=k;
    }
    public boolean insertFront(int value) {
        if(isFull())return false;
        mll.addAtHead(value);
        return true;
    }
    public boolean insertLast(int value) {
        if(isFull())return false;
        mll.addAtTail(value);
        return true;

    }
    public boolean deleteFront() {
        return mll.deleteAtIndex(0);
    }
    public boolean deleteLast() {
        return mll.deleteAtIndex(mll.size-1);
    }
    public int getFront() {
        return mll.get(0);
    }
    public int getRear() {
        return mll.get(mll.size-1);
    }
    public boolean isEmpty() {
        return mll.size==0;
    }
    public boolean isFull() {
        return mll.size==k;
    }
}
// class MyCircularDeque {
    //TODO: Array version
    // int head=-1,tail=-1,size=0;
    // int[] circQ;
    // public MyCircularDeque(int k) {
    //     circQ = new int[k];
    // }
    // public boolean insertFront(int value) {
    //     if(isFull())return false;
    //     if(isEmpty()){
    //         head=0;
    //         tail=0;
    //     }else if(head>0){
    //         head--;
    //     }else{
    //         moveToLast();
    //     }
    //     circQ[head] = value;
    //     size++;
    //     return true;
    // }
    // private void moveToLast(){//Note delibrately head and tail are not shifted here as this method is meant to be used for making space before head notice there is not a method opposite to this to make space at the tail because at tail you can always just insert at the end index
    //     for(int i=tail+1;i>=head;i--){
    //         circQ[i] = circQ[i-1];
    //     }
    //     head--;
    //     tail++;
    // }
    // public boolean insertLast(int value) {
    //     if(isFull())return false;
    //     if(isEmpty())head++;
    //     tail++;
    //     circQ[tail] = value;
    //     size++;
    //     return true;
    // }
    // public boolean deleteFront() {
    //     if(isEmpty())return false;
    //     if(head!=circQ.length-1){
    //         head--;
    //     }else{
    //         head=-1;
    //         tail=-1;
    //     }
    //     size--;
    //     return true;
    // }
    // public boolean deleteLast() {
    //     if(isEmpty())return false;
    //     if(head==tail)head--;
    //     tail--;
    //     size--;
    //     return true;
    // }
    // public int getFront() {
    //     if(size==0)return -1;
    //     return circQ[head];
    // }
    // public int getRear() {
    //     if(size==0)return -1;
    //     return circQ[tail];
    // }
    // public boolean isEmpty() {
    //     return (size==0);
    // }
    // public boolean isFull() {
    //     return (size==circQ.length);
    // }
// }
```

## Approach 2 — 2026-10-14 19:29 (java)

*Runtime: 5 ms · Memory: 46.2 MB*

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
    public void addAtTail(int val) {
        Node n = new Node(val);
        if(tail != null){
            tail.next = n;
            n.prev = tail;
        }else{
            head = n;
        }
        tail = n;
        size++;
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
// Linked List version 
class MyCircularDeque {
    MyLinkedList mll = new MyLinkedList();
    int k;
    public MyCircularDeque(int k) {
        this.k=k;
    }
    public boolean insertFront(int value) {
        if(isFull())return false;
        mll.addAtHead(value);
        return true;
    }
    public boolean insertLast(int value) {
        if(isFull())return false;
        mll.addAtTail(value);
        return true;
    }
    public boolean deleteFront() {
        return mll.deleteAtIndex(0);
    }
    public boolean deleteLast() {
        return mll.deleteAtIndex(mll.size-1);
    }
    public int getFront() {
        return mll.get(0);
    }
    public int getRear() {
        return mll.get(mll.size-1);
    }
    public boolean isEmpty() {
        return mll.size==0;
    }
    public boolean isFull() {
        return mll.size==k;
    }
}
// class MyCircularDeque {
    //TODO: Array version
    // int head=-1,tail=-1,size=0;
    // int[] circQ;
    // public MyCircularDeque(int k) {
    //     circQ = new int[k];
    // }
    // public boolean insertFront(int value) {
    //     if(isFull())return false;
    //     if(isEmpty()){
    //         head=0;
    //         tail=0;
    //     }else if(head>0){
    //         head--;
    //     }else{
    //         moveToLast();
    //     }
    //     circQ[head] = value;
    //     size++;
    //     return true;
    // }
    // private void moveToLast(){//Note delibrately head and tail are not shifted here as this method is meant to be used for making space before head notice there is not a method opposite to this to make space at the tail because at tail you can always just insert at the end index
    //     for(int i=tail+1;i>=head;i--){
    //         circQ[i] = circQ[i-1];
    //     }
    //     head--;
    //     tail++;
    // }
    // public boolean insertLast(int value) {
    //     if(isFull())return false;
    //     if(isEmpty())head++;
    //     tail++;
    //     circQ[tail] = value;
    //     size++;
    //     return true;
    // }
    // public boolean deleteFront() {
    //     if(isEmpty())return false;
    //     if(head!=circQ.length-1){
    //         head--;
    //     }else{
    //         head=-1;
    //         tail=-1;
    //     }
    //     size--;
    //     return true;
    // }
    // public boolean deleteLast() {
    //     if(isEmpty())return false;
    //     if(head==tail)head--;
    //     tail--;
    //     size--;
    //     return true;
    // }
    // public int getFront() {
    //     if(size==0)return -1;
    //     return circQ[head];
    // }
    // public int getRear() {
    //     if(size==0)return -1;
    //     return circQ[tail];
    // }
    // public boolean isEmpty() {
    //     return (size==0);
    // }
    // public boolean isFull() {
    //     return (size==circQ.length);
    // }
// }
```
