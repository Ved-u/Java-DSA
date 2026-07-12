public class MyLinkedList {
    public static void main(String[] args) {
       DoublyLinkedList ll=new DoublyLinkedList();
       ll.append(1);
       ll.append(2);
       ll.append(5);
       ll.append(3);
       ll.append(2);
       ll.append(7);
       ll.append(8);
       ll.append(9);
       ll.append(1);
       ll.append(10);
       Linkedlist l=new Linkedlist();
       l.append(1);
       l.append(2);
       l.append(3);
       l.append(4);
       l.append(5);
      //CircularLinkedList c=new CircularLinkedList(l.head);
       CircularLinkedList cc=new CircularLinkedList(ll.head);
      cc.criticalPoint();
    }
}
class CircularLinkedList{
    Node circularHead=null;
    DoublyNode circularDoublyHead=null;
    int size=1;
    void criticalPoint(){
        int min=size;
        int max=1;
        DoublyNode t=circularDoublyHead.next;
        DoublyNode c1=circularDoublyHead;
        DoublyNode c2=circularDoublyHead;
        int length=0;
        while(t.next.next!=circularDoublyHead){
            if(t.data>t.last.data&&t.data>t.next.data){
                if(c1==circularDoublyHead){
                    c1=t;
                    length=0;
                }    
                else {
                    c2=t;
                    min=Math.min(min,length);
                }
            }
            else if(t.data<t.last.data&&t.data<t.next.data){
                if(c1==circularDoublyHead){
                    c1=t;
                    length=0;
                }   
                else {
                    c2=t;
                    min=Math.min(min,length);
                }    
            }
            t=t.next;
            length++;
        }
        t=c1;
        while(t!=c2){
            max++;
            t=t.next;
        }
    System.out.println(min);    
    System.out.println(max);    
    }
    public CircularLinkedList(Node head){
        Node t=head;
        for(;t.next!=null;t=t.next){size++;}
        t.next=head;
        circularHead=head;
    }
    public CircularLinkedList(DoublyNode head){
        DoublyNode t=head;
        for(;t.next!=null;t=t.next){size++;}
        t.next=head;
        head.last=t;
        circularDoublyHead=head;
    }
    void display(Node t){
        for(;t.next!=circularHead;t=t.next){
            System.out.print(t.data+" ");
        }
        System.out.println(t.data);
    }
    void display(DoublyNode t){
        for(;t.next!=circularDoublyHead;t=t.next){
            System.out.print(t.data+" ");
        }
        System.out.println(t.data);
    }
    boolean isPalindrome(){
       DoublyNode t=circularDoublyHead;
       DoublyNode t2=circularDoublyHead.last;
       while(t!=t2&&t.next!=t2){
            if(t.data!=t2.data)return false;
            t=t.next;
            t2=t2.last;
        }
    return true; 
    }
    void twoSum(int navneet){
        DoublyNode t=circularDoublyHead;
        DoublyNode t1=circularDoublyHead.last;
        while(t.data<t1.data){
            if(t1.data+t.data==navneet){
                System.out.println("node found:"+t.data+" "+t1.data+"that adds upto navneet");
                return;
            }
            else if(t1.data+t.data<navneet)t=t.next;
            else if(t1.data+t.data>navneet)t=t.next;
        }
    }
    void display(){
        Node t=circularHead;
        for(;t.next!=circularHead;t=t.next){
            System.out.print(t.data+" ");
        }
        System.out.println(t.data);
    }
    void deleteHead(){
        Node t=circularHead;
        for(;t.next!=circularHead;t=t.next){}
        t.next=t.next.next;
    circularHead=t.next;    
    }
    void deleteDoublyHead(){//doubly circular linked list
        DoublyNode t=circularDoublyHead;
        t.next.last=t.last;
        t.last.next=t.next;
    circularDoublyHead=t.next;
    }
}
class Node {
    int data;
    Node next;
    public Node(int val) {
        data = val;
    }
    void display(Node temp){
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
    System.out.println();
    }
}
class DoublyNode{
    int data;
    DoublyNode next;
    DoublyNode last;
    DoublyNode(int data){
        this.data=data;
    }
}
class DoublyLinkedList{
    DoublyNode head=null;
    DoublyNode last=null;
    DoublyNode tail=null;
    int size;
    void append(int val){
        DoublyNode next=new DoublyNode(val);
        if(head==null)head=next;
        else tail.next=next;
        tail=next;
        next.last=last;
        last=next;
        size++;
    }
    void deleteAt(int indx){
        if(indx==0){
            head=head.next;
            head.last=null;
        }else if(indx==size-1){
            DoublyNode t=head;
            for(;t.next.next!=null;t=t.next){}
            t.next=null;
            tail=t;
        }else{
            DoublyNode t=head;
            for(int i=1;i<indx;i++){
                t=t.next;
            }
            t.next.next.last=t;
            t.next=t.next.next;
        }
        size--;
    }
    void insertAt(int indx,int val){
        if(indx==size-1)append(val);
        else if(indx==0){
            DoublyNode temp=new DoublyNode(val);
            head.last=temp;
            temp.next=head;
            head=temp;
        }
        else{
            DoublyNode temp=new DoublyNode(val);
            DoublyNode t=head;
            for(int i=1;i<indx;i++){
                t=t.next;
            }
            t.next.last=temp;
            temp.last=t;
            temp.next=t.next;
            t.next=temp;
        }size++;
    }
    void display2(DoublyNode random){
        for(;random.last!=null;random=random.last){}
        for(;random!=null;random=random.next){
            System.out.print(random.data+" ");
        }
        System.out.println();
    }
    void display(DoublyNode head){
        for(DoublyNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    void display(){
        for(DoublyNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    void displayReverse(DoublyNode tail){
        for(DoublyNode temp=tail;temp!=null;temp=temp.last){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
}

class Linkedlist {
    Node head = null;
    Node tail = null;
    int size = 0;

    void append(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }
    Node oddEvenLinkList(Node head){ 
        Node t=head;
        Node to=new Node(-1);
        Node te=new Node(0);
        Node newHead=to;
        head=te;
        while(t!=null){
            if(t.data%2==1){
                to.next=t;
                to=to.next;
            }else if(t.data%2==0){
                te.next=t;
                te=te.next;
            }
            t=t.next;
        }
        head=head.next;
       te.next=null;
        to.next=head;
    return newHead.next;
    }
    Node deepCopy(Node head){
        Linkedlist ll=new Linkedlist();
        for(Node temp=head;temp!=null;temp=temp.next){
            ll.append(temp.data+1);
        }
    return ll.head;    
    }
    void insertAtBegin(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    void deleteNthLastNode(Node head,int n){
        Node fast=head;
        Node slow=head;
        Node temp=slow;
        for(int i=1;i<=n;i++)
            fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            temp=slow;
            slow=slow.next;
        } 
        temp.next=temp.next.next;   
        size--;
    }
    int findLeftMiddleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    return slow.data;    
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int getAt(int indx) {
        Node temp = head;
        for (int i = 0; i < indx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    void deleteAt(int indx){
        if(indx==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<indx-1;i++){
            temp=temp.next;
        }
        if(indx==size-1){
            temp.next=null;
            tail=temp;
            size--;
            return;
        } temp.next=temp.next.next;
        size--;
    }
    int lastNthNode(Node head,int n){
        //in one traversal
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
    return slow.data;    
    }
    void insertAt(int indx,int val){
        Node temp=new Node(val);
        Node t=head;
        if(indx<0||indx>=size){
            System.out.println("neet index tak");
        return;
        }
        else if(indx==0){
            insertAtBegin(val);
            return;
        }else if(indx==size-1){
            append(val);
            return;
        }
        for(int i=0;i<indx-1;i++){
            t=t.next;
        }
        temp.next=t.next;
        t.next=temp;
        size++;
    }

}