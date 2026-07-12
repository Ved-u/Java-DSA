import java.util.*;
public class MyHashMap {
    public static void example(int[] sallary,String[] names) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(names[i], sallary[i]);//insert
        }
        System.out.println(map);
        //to traverse the map manually
        for(String x:map.keySet()){
            System.out.printf("Salary of %s is %d \n",x,map.get(x));
        }
    }
    public static void freq(int[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:args){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        System.out.println(map);
        int max=0,ans=0;
        for(HashMap.Entry<Integer,Integer> x : map.entrySet()){
            if(x.getValue()>max){
                max=x.getValue();
                ans=x.getKey();
            }
        }
        System.out.printf("the number %d has highest frequency: %d \n",ans,max);
    }
    public static void maximumZeroSubarraySum(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefSum=0,maxLength=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            if(map.containsKey(prefSum))
                maxLength=Math.max(maxLength,(i-map.get(prefSum)));
            else map.put(prefSum,i);
        }
    }
    public static void maximumNumbersOnTable(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))set.remove(arr[i]);
            else set.add(arr[i]);
            max=Math.max(max,set.size());
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
       maximumNumbersOnTable(new int[]{1,1});
    }
}
class MyHashMapImplementation<K, V>{
    public static final int DEFAULT_Capacity=5;
    public static final double DEFAULT_LOAD_FACTOR=0.75;
    private int n=0;//number of entries
    private LinkedList<Node> buckets[];
    public MyHashMapImplementation(){
        initBuckets(DEFAULT_Capacity);
    }
    private int hashFunction(K key){
        return Math.abs(key.hashCode())%buckets.length;
    }
    private void initBuckets(int N){// N-cpacity/size of buket array
        buckets=new LinkedList[N];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i]=new LinkedList<>();
        }

    }
    private int searchInBucket(K key,LinkedList<Node> ll){//traverses on ll and looks for key if it is found returns it index otherwise -1
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key==key)return i;
        }
        return -1;
    }
    private class Node{
        K key;
        V value;
        public Node(K key,V value){
            this.value=value;
            this.key=key;
        }
    }
    public int size(){//returns number of enrtries in hasmap
        return n;
    }
    public void put(K key,V value){//insertion and updation
        int bi=hashFunction(key);//gererates bucket index 
        LinkedList<Node> currBucket=buckets[bi];
        int ei=searchInBucket(key,currBucket);
        if(ei!=-1){//means key exist and we've to update its value
                currBucket.get(ei).value=value;
        }else{//otherwise create a new node and add it to the linkedlist
            Node t=new Node(key, value);
            n++;
            currBucket.add(t);
        }
        if(n>=buckets.length*DEFAULT_LOAD_FACTOR)rehash();
    }
    public void rehash(){
        System.out.println("rehashing...");
        LinkedList<Node> oldBuckets[]=buckets;
        initBuckets(oldBuckets.length*2);
        n=0;
        for(var bucket:oldBuckets){
            for(var node:bucket){
                put(node.key,node.value);
            }
        }

    }
    public V get(K key){
        int bi=hashFunction(key);
        LinkedList<Node> currBucket=buckets[bi];
        int ei=searchInBucket(key, currBucket);
        if(ei==-1)return null;
     return currBucket.get(ei).value;
    }
    public V remove(K key){
        int bi=hashFunction(key);
        LinkedList<Node> currBucket=buckets[bi];
        int ei=searchInBucket(key, currBucket);
        if(ei==-1)return null;
        n--;
    return currBucket.remove(ei).value;
    }
}