# 169. Majority Element

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/majority-element/
**Tags:** Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm

## Approach 1 — 2024-02-29 23:08 (java)

*Runtime: 6 ms (faster than 44.9%) · Memory: 52.8 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
      //  int ans[]=new int[nums.length];
      Arrays.sort(nums);
      int count=0;
      int previous;
      int n=nums.length;
      int ans=0;
        for(int i=0;i<n;i++){
            previous=nums[i];
            if(nums[i]!=previous)count=0;
            count++;
            if(count>n/2){
                ans=nums[i];
                break;
            } 
        }
        return ans;        
    }
}
```

## Approach 2 — 2024-02-29 23:10 (java)

*Runtime: 4 ms (faster than 45.1%) · Memory: 53.2 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
      //  int ans[]=new int[nums.length];
      Arrays.sort(nums);
      return nums[nums.length/2];
    }
}
```

## Approach 3 — 2024-10-21 12:04 (java)

*Runtime: 1 ms (faster than 99.9%) · Memory: 53.2 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count=0,element=nums[0];
        for(int x:nums){
            if(count==0){
                element=x;
                count++;
            }else if(x==element)count++;
            else count--;
        }  
        // int count=0;
        // for(int x:nums)
        //     if(x==element)count++;
    return element;
    }
}
```

## Approach 4 — 2024-10-21 12:06 (java)

*Runtime: 2 ms (faster than 86.5%) · Memory: 52.8 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count=0,element=nums[0];
        for(int x:nums){
            if(count==0){
                element=x;
                count++;
            }else if(x==element)count++;
            else count--;
        }  
         count=0;
        for(int x:nums)
            if(x==element)count++;
    return (count>nums.length/2)?element:-1;
    }
}
```

## Approach 5 — 2024-10-21 12:14 (java)

*Runtime: 2 ms (faster than 86.5%) · Memory: 53.1 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count=0,element=nums[0];
        for(int x:nums){
            if(count==0){
                element=x;
                count++;
            }else if(x==element)count++;
            else count--;
        }  
    return element;
    }
}
```

## Approach 6 — 2025-09-05 15:14 (java)

*Runtime: 14 ms (faster than 29.7%) · Memory: 49.6 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x))map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int ans=0,freq=0;
        for(var x: map.keySet()){
            if(map.get(x)>freq){
                ans=x;
                freq=map.get(x);
            }
        }
        return ans;
    }
}
```

## Approach 7 — 2026-03-22 10:41 (java)

*Runtime: 6 ms (faster than 44.9%) · Memory: 55.7 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
```

## Approach 8 — 2026-03-22 10:50 (java)

*Runtime: 15 ms (faster than 28.7%) · Memory: 52.3 MB*

```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.get(x)==null)map.put(x,1);
            else map.put(x,map.get(x)+1);
        }
        int nb2=nums.length/2;
        for(Integer x:map.keySet()){
            if(map.get(x)>nb2)return x;
        }
        return -1;
    }
}
```
