# 3606. Coupon Code Validator

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/coupon-code-validator/
**Tags:** Array, Hash Table, String, Sorting

## Approach 1 — 2026-03-24 23:40 (java)

*Runtime: 6 ms (faster than 85.8%) · Memory: 47.2 MB*

```java
class Solution {
    public List<String> validateCoupons(String[] code, String[] bl, boolean[] act) {
        List<String> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<code.length;i++){
            if(act[i]==false)continue;
            if(bl(bl[i])==false)continue;
            if(code(code[i])==false)continue;
            if(map.get(bl[i])==null)map.put(bl[i],new ArrayList<>());
            map.get(bl[i]).add(code[i]);
        }
        sortAddd(ans,map.get("electronics"));
        sortAddd(ans,map.get("grocery"));
        sortAddd(ans,map.get("pharmacy"));
        sortAddd(ans,map.get("restaurant"));
        return ans;
    }
    void sortAddd(List<String> ans,List<String> map){
        if(map==null)return;
        Collections.sort(map);
        for(String x:map){
            ans.add(x);
        }
    }
    boolean code(String s){
        if(s==null||s.equals(""))return false;
        for(char x:s.toCharArray()){
            if(Character.isLetterOrDigit(x)||x=='_')continue;
            else return false;
        }
        return true;
    }
    boolean bl(String s){
        if(s.equals("electronics")||s.equals("grocery")||s.equals("pharmacy")||s.equals("restaurant"))return true;
        return false;
    }
}
```
