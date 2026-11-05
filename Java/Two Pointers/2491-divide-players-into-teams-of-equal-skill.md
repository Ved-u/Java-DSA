# 2491. Divide Players Into Teams of Equal Skill

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/
**Tags:** Array, Hash Table, Two Pointers, Sorting

## Approach 1 — 2024-08-20 19:48 (java)

*Runtime: 16 ms (faster than 91.4%) · Memory: 58.3 MB*

```java
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans=0;
        int left=0,right=skill.length-1;
        int ratio=skill[left]+skill[right];
        while(left<right){
            if(skill[left]+skill[right]!=ratio)return -1;
            ans+=skill[left]*skill[right];
            left++;right--;
        }
    return ans;
    }
}
```
