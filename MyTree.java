import java.util.*;
public class MyTree {
    public static void display(Node n) {
        if(n==null)return;
        System.out.print(n.val+"->");
        if(n.left!=null)System.out.print(n.left.val+",");
        if(n.right!=null)System.out.print(n.right.val+" ");
        System.out.println();
        display(n.left);
        display(n.right);
    }
    static int nodes=0;
    public static int countNodes(Node n) {
        if(n==null)return 0;
        nodes++;
        countNodes(n.left);
        countNodes(n.right);
    return nodes;
    }
    public static int size(Node n) {
        if(n==null)return 0;
    return 1+size(n.left)+ size(n.right);
    }
    public static int sum(Node n) {
        if(n==null)return 0;
    return n.val+sum(n.left)+ sum(n.right);
    }
    public static int multiplication(Node n) {
        if(n==null)return 1;
    return n.val*multiplication(n.left)*multiplication(n.right);
    }
    public static int max(Node n) {
        if(n==null)return Integer.MIN_VALUE;
    return Math.max(n.val,Math.max(max(n.left),max(n.right)));
    }
    public static int min(Node n) {
        if(n==null)return Integer.MAX_VALUE;
    return Math.min(n.val,Math.min(min(n.left),min(n.right)));
    }
    public static int height(Node n) {
        if(n==null||(n.left==null&&n.right==null))return 0;
    return 1+Math.max(height(n.left),height(n.right));
    }
    public static void preorder(Node n) {
        if(n==null)return;
        System.out.print(n.val+"->");
        preorder(n.left);
        preorder(n.right);
    }
    public static void inorder(Node n) {
        if(n==null)return;
        inorder(n.left);
        System.out.print(n.val+"->");
        inorder(n.right);
    }
    public static void postorder(Node n) {
        if(n==null)return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.val+"->");
    }
    public static void printNthLevel(Node n,int level) {
        if(n==null)return;
        if(level==1){
            System.out.print(n.val+" ");
        }
        printNthLevel(n.left,level-1);
        printNthLevel(n.right,level-1);
    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.print(temp.val+" ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
    }
    public static void dfs(Node root){
        Stack<Node> stk=new Stack<>();
        if(root!=null)stk.push(root);
        while(!stk.isEmpty()){
            Node temp=stk.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null)stk.push(temp.right);
            if(temp.left!=null)stk.push(temp.left);
        }
    }
    public static void inorder2(Node n){
        Stack<Node> stk = new Stack<>();
        Node current = n;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
    public static void postorder2(Node n) {
        Stack<Node> stk = new Stack<>();
        Node lastVisited = null;
        Node current = n;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.peek();
            if (current.right == null || current.right == lastVisited) {
                System.out.print(current.val + " ");
                stk.pop();
                lastVisited = current;
                current = null;
            } else current = current.right;
        }
    }
    public static void preorder2(Node n) {
        Stack<Node> stk=new Stack<>();
        if(n!=null)stk.push(n);
        while(!stk.isEmpty()){
            Node temp=stk.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null)stk.push(temp.right);
            if(temp.left!=null)stk.push(temp.left);
        }
    }
    public static Node constructTree(String[] arr){
        Node root=new Node(Integer.parseInt(arr[0]));
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        for(int i=1;i<arr.length-1;i+=2){
            Node temp=q.remove();
            Node left=(arr[i]==null)?null:new Node(Integer.parseInt(arr[i]));
            Node right=(arr[i+1]==null)?null:new Node(Integer.parseInt(arr[i+1]));
            temp.left=left;
            temp.right=right;
            if(left!=null)q.add(left);
            if(right!=null)q.add(right);
        }
    return root;
    }
    public static void levelDisaplay(Node root) {
        int height=height(root)+1;
        for(int i=1;i<=height;i++){
            printNthLevel(root, i);
            System.out.println();
        }
    }
    private static void printLeftBoundary(Node root) {
        if(root==null)return;
        if(root.left==null&&root.right==null)return;
        System.out.print(root.val+" ");
        if(root.left!=null)printLeftBoundary(root.left);
        else printLeftBoundary(root.right);
    }
    public static void printBottomBoundary(Node root) {
        if(root==null)return;
        if(root.left==null&&root.right==null)System.out.print(root.val+" ");
        printBottomBoundary(root.left);
        printBottomBoundary(root.right);
    }
    private static void printRightBoundary(Node root) {
        if(root==null)return;
        if(root.left==null&&root.right==null)return;
        if(root.right!=null)printRightBoundary(root.right);
        else printRightBoundary(root.left);
        System.out.print(root.val+" ");
    }
    public static void printBoundary(Node root) {
        if(root==null)return;
        printLeftBoundary(root.left);
        printBottomBoundary(root);
        printRightBoundary(root.right);
    }
    public static void preorder(Node root,List<Integer> ans,int level) {
        if(root==null)return;
        ans.set(level,root.val);
        preorder(root.left,ans,level+1);
        preorder(root.right,ans,level+1);
    }
    public static void rightSideView(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return;
        int height=height(root)+1;
        for(int i=0;i<height;i++){
            ans.add(0);
        }
        preorder(root,ans,0);
        for(Integer x:ans){
            System.out.print(x+" ");
        }
    }
    public static void preorder2(Node root,List<Integer> ans,int level) {
        if(root==null)return;
        ans.set(level,root.val);
        preorder2(root.right,ans,level+1);
        preorder2(root.left,ans,level+1);
    }
    public static void leftSideView(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return;
        int height=height(root)+1;
        for(int i=0;i<height;i++){
            ans.add(0);
        }
        preorder2(root,ans,0);
        for(Integer x:ans){
            System.out.print(x+" ");
        }
    }
    public static void deleteNodeBST(Node root,int val){
        if(root==null||(root.left==null&&root.right==null))return;
        if(root.val<val){
            if(root.left.val==val)root.left=null;
            else deleteNodeBST(root.left,val);
        }else{
            if(root.right.val==val)root.right=null;
            else deleteNodeBST(root.right,val);
        }
    }
    static int pred=-1,succ=-1;
    static Node temp=null;
    static boolean check=false;
    public static void inorderPredSuccBST(Node root,int val) {
        if(root==null)return;
        inorderPredSuccBST(root.left,val);
        if(root.val==val){
            pred=temp.val;
            check=true;
        }else if(check){
            succ=root.val;
            check=false;
        }else temp=root;
        inorderPredSuccBST(root.right,val);
    }
    public static void reverseInorder(Node root) {
        if(root==null)return;
        reverseInorder(root.right);
        System.out.print(root.val+" ");
        reverseInorder(root.left);
    }
    public static void morisInorder(Node root) {
        while(root!=null){
            if(root.left!=null){
                Node pred=root.left;
                while(pred.right!=null&&pred.right!=root)pred=pred.right;
                if(pred.right==null){
                    pred.right=root;
                    root=root.left;
                }else{
                    pred.right=null;
                   System.out.print(root.val+" ");
                    root=root.right;
                }
            }else{
                System.out.print(root.val+" ");
                root=root.right;
            }
        }
        System.out.println();
    }
    public static void morisInorderReverse(Node root) {
        while(root!=null){
            if(root.right!=null){
                Node pred=root.right;
                while(pred.left!=null&&pred.left!=root)pred=pred.left;
                if(pred.left==null){
                    pred.left=root;
                    root=root.right;
                }else{
                    pred.left=null;
                    System.out.print(root.val+" ");
                    root=root.left;
                }
            }else{
                System.out.print(root.val+" ");
                root=root.left;
            }
        }
        System.out.println();
    }
    public static void GenericDFS(GenericNode root) {//preorder 
        System.out.print(root.val+" ");
        for(GenericNode x:root.child){
            GenericDFS(x);
        }
    }
    public static void GenericDFSPostOrder(GenericNode root) {//postorder there is no inorder 
        for(GenericNode x:root.child){
            GenericDFSPostOrder(x);
        }
        System.out.print(root.val+" ");
    }
    public static void GenericDFSPseudoInOrder(GenericNode root) {//pseudo inorder
        int n = root.child.size();
        // Visit the first half of the children
        for (int i = 0; i < n / 2; i++) {
            GenericDFSPseudoInOrder(root.child.get(i));
        }
        // Visit the current node
        System.out.print(root.val + " ");
        // Visit the remaining children
        for (int i = n / 2; i < n; i++) {
            GenericDFSPseudoInOrder(root.child.get(i));
        }
    }
    public static void GenericBFS(GenericNode root){
        Queue<GenericNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            GenericNode t=q.remove();
            System.out.print(t.val+" ");
            for(GenericNode x:t.child){
                q.add(x);
            }
        }
    }
    public static void max(GenericNode root){
        int ans=Integer.MIN_VALUE;
        Queue<GenericNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            GenericNode t=q.remove();
            ans=Math.max(t.val,ans);
            for(GenericNode x:t.child){
                q.add(x);
            }
        }
    System.out.println(ans);
    }
    public static void zigzag(GenericNode root) {
        if (root == null) return;
        boolean check = true;
        Queue<GenericNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<GenericNode> al = new ArrayList<>();
            int size = q.size(); 
            for (int i = 0; i < size; i++) {
                GenericNode current = q.poll();
                al.add(current);
                for (GenericNode child : current.child) {
                    q.add(child);
                }
            }
            if (check) {
                for (GenericNode node : al) {
                    System.out.print(node.val + " ");
                }
            } else {
                for (int i = al.size() - 1; i >= 0; i--) {
                    System.out.print(al.get(i).val + " ");
                }
            }
            System.out.println();
            check = !check;
        }
    }
    public static void main(String args[]){
        GenericNode root=new GenericNode(0);
        root.child.add(new GenericNode(1));
        root.child.add(new GenericNode(2));
        root.child.add(new GenericNode(3));
        root.child.get(0).child.add(new GenericNode(4));
        root.child.get(1).child.add(new GenericNode(5));
        root.child.get(2).child.add(new GenericNode(6));
        zigzag(root);
    }
}
class GenericNode{
    int val;
    public List<GenericNode> child=new ArrayList<>();
    public GenericNode(int val){
        this.val=val;
    }
}
class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val=val;
    }
}