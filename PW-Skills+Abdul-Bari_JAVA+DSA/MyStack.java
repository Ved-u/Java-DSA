import java.util.Stack;
public class MyStack {
    static void copy(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        Stack<Integer> ans = new Stack<>();
        while(s2.size()>0){
            ans.push(s2.pop());
        }
        System.out.println(ans);
    }
    static void insertAt(Stack<Integer> s1,int indx,int element){
        Stack<Integer> s2 = new Stack<>();
        while(s1.size()>indx){
            s2.push(s1.pop());
        }
        s1.push(element);
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        System.out.println(s1);
    }
    static void insertArray(Stack<Integer> s1,int indx,int element){
        int arr[]=new int[s1.size()];
        int count=0;
        while(s1.size()>indx){
            arr[count++]=s1.pop();
        }
        s1.push(element);
        for(int i=count-1;i>=0;i--){
            s1.push(arr[i]);
        }
        System.out.println(s1);
    }
    static void reverse(Stack<Integer> s1){
        Stack<Integer> s2=new Stack<>();
        while(s1.size()>0){
            System.out.print(s2.push(s1.pop())+" ");
        }
    }
    static void reverseRec(Stack<Integer> s1){
        if(s1.size()==0)return;
        int x=s1.pop();
        System.out.print(x+" ");
        reverse(s1);
        s1.push(x);
    }
    static void print(Stack<Integer> s1){
        Stack<Integer> s2=new Stack<>();
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        while(s2.size()>0){
            System.out.print(s1.push(s2.pop())+" ");
        }
    }
    static void printRec(Stack<Integer> s1){
        if(s1.size()==0)return;
        int x=s1.pop();
        printRec(s1);
        System.out.print(x+" ");
        s1.push(x);
    }
    static void insertRec(Stack<Integer> s1,int indx,int element){
        if(s1.size()==indx){
            s1.push(element);
            return;
        }    
        int x=s1.pop();
        insertRec(s1,indx,element);
        s1.push(x);
    }
    static void reverseStack(Stack<Integer> s1){
        if(s1.size()==1)return;
        int x=s1.pop();
        reverseStack(s1);
        insertAtBottomRec(s1, x);   
    } 
    static void insertAtBottomRec(Stack<Integer> s,int element){
        if(s.size()==0){
            s.push(element);
            return;
        }    
        int temp=s.pop();
        insertAtBottomRec(s, element);
        s.push(temp);
    }
    static void removeIndxRec(Stack<Integer> s,int indx){
        if(s.size()==indx+1){
            s.pop();
            return;
        }    
        int temp=s.pop();
        removeIndxRec(s, indx);
        s.push(temp);
    }
    static void removeIndx(Stack<Integer> s1,int indx){
        Stack<Integer> s2=new Stack<>();
        while(s1.size()>indx+1){
            s2.push(s1.pop());
        }
        s1.pop();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
    }
    static void reverseUsingArray(Stack<Integer> s1){
        int arr[]=new int[s1.size()];
        int count=0;
        while(s1.size()>0)arr[count++]=s1.pop();
        for(int i=0;i<count;i++)s1.push(arr[i]);
    }
    static void reverseUsing3Stack(Stack<Integer> s1){
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        while(s1.size()>0)s2.push(s1.pop());
        while(s2.size()>0)s3.push(s2.pop());
        while(s3.size()>0)s1.push(s3.pop());
    }
    public static int minNum(String str){
        int ans=0;
        Stack<Character> stk=new Stack<>();
        for(char x:str.toCharArray()){
            if(x=='(')stk.push(x);
            else{
                if(stk.size()>0)stk.pop();
                else ans++;
            }
        }
    return ans+stk.size();
    }
    public static void removeConsec(int arr[]){
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stk.size()==0)stk.push(arr[i]);
            else if(i<arr.length-1){
                if(arr[i]==stk.peek()){
                    if(arr[i]!=arr[i+1]){
                        stk.pop();
                    }    
                }else stk.push(arr[i]);
            }else{ 
                if(arr[i]!=arr[i-1])stk.push(arr[i]);
                else stk.pop();
            }
        }
    System.out.println(stk);
    }
    public static void nextGreater(int[] arr) {
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
           int temp=arr[i];
           while(st.size()>0&&st.peek()<arr[i])st.pop();
           if(st.size()==0)arr[i]=-1;
           else arr[i]=st.peek();
           st.push(temp);
        }
        MyArrays.printArray(arr);
    }
    public static void prevGreater(int arr[]){
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        arr[0]=-1;
        for(int i=1;i<arr.length;i++){
           int temp=arr[i];
           while(st.size()>0&&st.peek()<arr[i])st.pop();
           if(st.size()==0)arr[i]=-1;
           else arr[i]=st.peek();
           st.push(temp);
        }
        MyArrays.printArray(arr);
    }
    public static void nextGreater2(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for(int i = 1; i < arr.length; i++) {
            while(stk.size() > 0 && arr[i] > arr[stk.peek()])
            {    ans[stk.pop()] = arr[i];
            }   
            stk.push(i);
        }
        while(stk.size() > 0) {
            ans[stk.pop()] = -1;
        }
    MyArrays.printArray(ans);
    }
    public static void infixOperator(String s) {
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(char x:s.toCharArray()){
            if(x-'0'>=0&&x-'0'<=9)val.push(x-'0');
            else if(op.size()==0||x=='('||op.peek()=='(')op.push(x);
            else if(x==')'){
                while(op.peek()!='('){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='+')val.push(v1+v2);
                        else if(op.peek()=='-')val.push(v1-v2);
                        else if(op.peek()=='*')val.push(v1*v2);
                        else if(op.peek()=='/')val.push(v1/v2);
                    op.pop();
              }
              op.pop();
            }
            else{
                if(x=='+'||x=='-'||
                (x=='*'&&(op.peek()=='*'||op.peek()=='/'))||
                (x=='/'&&(op.peek()=='*'||op.peek()=='/'))){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+')val.push(v1+v2);
                    else if(op.peek()=='-')val.push(v1-v2);
                    else if(op.peek()=='*')val.push(v1*v2);
                    else if(op.peek()=='/')val.push(v1/v2);
                    op.pop();
                }
                op.push(x);
            }
        }
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            char x=op.pop();
            if(x=='+')val.push(v1+v2);
            else if(x=='-')val.push(v1-v2);
            else if(x=='*')val.push(v1*v2);
            else if(x=='/')val.push(v1/v2);
        }
        System.out.println(val.pop());
    }
    public static void prefix(String s){
        Stack<Character> op=new Stack<>();
        Stack<String> val=new Stack<>();
        for(char x:s.toCharArray()){
            if(Character.isDigit(x))val.push(""+x);
            else if(op.size()==0||x=='('||op.peek()=='(')op.push(x);
            else if(x==')'){
                while(op.peek()!='('){
                        String v2=val.pop();
                        String v1=val.pop();
                        char y=op.peek();
                        val.push(y+v1+v2);
                    op.pop();
              }
              op.pop();
            }
            else{
                if(x=='+'||x=='-'||
                (x=='*'&&(op.peek()=='*'||op.peek()=='/'))||
                (x=='/'&&(op.peek()=='*'||op.peek()=='/'))){
                    String v2=val.pop();
                        String v1=val.pop();
                        char y=op.peek();
                        val.push(y+v1+v2);
                    op.pop();
                }
                op.push(x);
            }
        }
        while(val.size()>1){
            String v2=val.pop();
                        String v1=val.pop();
                        char y=op.pop();
                        val.push(y+v1+v2);
        }
        System.out.println(val.pop());
    }
    public static void postfix(String s){
        Stack<Character> op=new Stack<>();
        Stack<String> val=new Stack<>();
        for(char x:s.toCharArray()){
            if(Character.isDigit(x))val.push(""+x);
            else if(op.size()==0||x=='('||op.peek()=='(')op.push(x);
            else if(x==')'){
                while(op.peek()!='('){
                        String v2=val.pop();
                        String v1=val.pop();
                        char y=op.peek();
                        val.push(v1+v2+y);
                    op.pop();
              }
              op.pop();
            }
            else{
                if(x=='+'||x=='-'||
                (x=='*'&&(op.peek()=='*'||op.peek()=='/'))||
                (x=='/'&&(op.peek()=='*'||op.peek()=='/'))){
                    String v2=val.pop();
                        String v1=val.pop();
                        char y=op.peek();
                       val.push(v1+v2+y);
                    op.pop();
                }
                op.push(x);
            }
        }
        while(val.size()>1){
            String v2=val.pop();
                        String v1=val.pop();
                        char y=op.pop();
                        val.push(v1+v2+y);
        }
        System.out.println(val.pop());
    }
    public static void postFixToInfix(String str) {
        Stack<Integer> val=new Stack<>();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x))val.push(x-'0');
            else{
                int val2=val.pop();
                int val1=val.pop();
                if(x=='+')val.push(val1+val2);
                else if(x=='-')val.push(val1-val2);
                else if(x=='*')val.push(val1*val2);
                else if(x=='/')val.push(val1/val2);
            }
        }
        System.out.println(val.pop());
    }
    public static void preFixToInfix(String str) {
        Stack<Integer> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char x=str.charAt(i);
            if(Character.isDigit(x))val.push(x-'0');
            else{
                int val1=val.pop();
                int val2=val.pop();
                if(x=='+')val.push(val1+val2);
                else if(x=='-')val.push(val1-val2);
                else if(x=='*')val.push(val1*val2);
                else if(x=='/')val.push(val1/val2);
            }
        }
        System.out.println(val.pop());
    }
    public static void prefixToPostfix(String str) {
        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char x=str.charAt(i);
            if(Character.isDigit(x))val.push(""+x);
            else val.push(val.pop()+val.pop()+x);
        }
        System.out.println(val.pop());
    }
    public static void postfixToPrefix (String str) {
        Stack<String> val=new Stack<>();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x))val.push(""+x);
            else{
                String val2=val.pop();
                String val1=val.pop();
                val.push(x+val1+val2);
            } 
        }
        System.out.println(val.pop());
    }
    public static void postfixToInfix (String str) {
        Stack<String> val=new Stack<>();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x))val.push(""+x);
            else{
                String val2=val.pop();
                String val1=val.pop();
                val.push(val1+x+val2);
            } 
        }
        System.out.println(val.pop());
    }
    public static void prefixToInfix (String str) {
        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char x=str.charAt(i);
            if(Character.isDigit(x))val.push(""+x);
            else{
                String val1=val.pop();
                String val2=val.pop();
                val.push(val1+x+val2);
            } 
        }
        System.out.println(val.pop());
    }
    public int celebrity(int mat[][]) {
        //A celebrity is a person who is known to all but does not know anyone at a party
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<mat.length;i++)
            stk.push(i);
        while(stk.size()>1){
            int v2=stk.pop();
            int v1=stk.pop();
            if(mat[v1][v2]==0)stk.push(v1);
            else if(mat[v2][v1]==0)stk.push(v2);
        }
        if(stk.size()==0)return -1;
        int ans=stk.pop();
        for(int j=0;j<mat[0].length;j++){
            if(mat[ans][j]==1)return -1;
        }
        for(int i=0;i<mat.length;i++){
            if(i==ans)continue;
            if(mat[i][ans]==0)return -1;
        }
    return ans;
    }
    public static void main(String[] args) {
       //int arr[]={1,5,8,7,4,3,7};
       //infix 9-5+3*4/6
       //prefix -9/*+5346
       //postfix 953+4*6/-
       prefixToInfix("-9/*+5346");
    }
}
class MyStack1{ 
    public static int arr[];int indx=-1;
    public MyStack1(int size){
        arr=new int[size];
    }
    public void push(int element){
        if(indx<arr.length){
            arr[++indx]=element;
        }else System.out.println("stack full");
    }
    public int capacity(){
        return arr.length;
    }
    public int pop(){
        if(indx>=0&&indx<arr.length)return arr[indx--];
        else System.out.println("can't pop indx is out of stack");
    return -1;
    }
    public void reverse(){
        for(int i=indx;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
    public void insertAt(int indx,int element){
        if(size()==arr.length){
            System.out.println("stack overflow");
            return;
        }
        if(size()==indx){
            push(element);
            return;
        }
        int x=pop();
        insertAt(indx, element);
        push(x);
    }
    public void deleteAt(int indx){
        if(size()==0){
            System.out.println("stack undeflow");
            return;
        }
        if(size()==indx+1){
            pop();
            return;
        }
        int x=pop();
        deleteAt(indx);
        push(x);
    }
    public int peek(){
        return arr[indx];
    }
    public int size(){
        return indx+1;
    }
    public boolean isEmpty(){
        return indx==-1;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        
        for(int i=0;i<=indx;i++){
            sb.append(arr[i]+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
    return sb.toString();
    }
}
class MyStack2 extends MyLinkedList{
    Node t=new Node(100);
    Node head=t.next;int size=0;
    public void push(int x){
       Node temp=new Node(x);
       temp.next=head;
       head=temp;
       size++;
    }
    public int pop(){
        int x=head.data;
        head=head.next;
        size--;
    return x;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int peek(){
        return head.data;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        MyStack1 m=new MyStack1(size);
        for(Node temp=head;temp!=null;temp=temp.next){
            m.push(temp.data);
        } sb.append("[");
        while(m.size()>0){
            sb.append(m.pop()+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
    return sb.toString();
    }
}