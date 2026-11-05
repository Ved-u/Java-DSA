# 2446. Determine if Two Events Have Conflict

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/determine-if-two-events-have-conflict/
**Tags:** Array, String

## Approach 1 — 2024-09-05 20:38 (java)

*Runtime: 10 ms (faster than 3.1%) · Memory: 41.5 MB*

```java
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
        // Parse start and end times of both events using LocalTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime e1Start = LocalTime.parse(e1[0], formatter);
        LocalTime e1End = LocalTime.parse(e1[1], formatter);
        LocalTime e2Start = LocalTime.parse(e2[0], formatter);
        LocalTime e2End = LocalTime.parse(e2[1], formatter);
        
        // Check for conflict: Event 1 overlaps with Event 2 if they aren't completely disjoint
        if (e1End.isBefore(e2Start) || e2End.isBefore(e1Start)) {
            return false;
        }
        
        return true;  // There is a conflict if times overlap
    }
}
```

## Approach 2 — 2024-09-06 17:45 (java)

*Runtime: 1 ms (faster than 19.1%) · Memory: 40.9 MB*

```java
class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
    int start1=Integer.parseInt(e1[0].substring(0, 2)+e1[0].substring(3));
    int end1=Integer.parseInt(e1[1].substring(0, 2)+e1[1].substring(3));
    int start2=Integer.parseInt(e2[0].substring(0, 2)+e2[0].substring(3));
    int end2=Integer.parseInt(e2[1].substring(0, 2)+e2[1].substring(3));
        if (end1 < start2 || end2 < start1)  return false;
    return true; 
    }
}
```

## Approach 3 — 2024-09-14 12:09 (java)

*Runtime: 6 ms (faster than 3.1%) · Memory: 40.7 MB*

```java
class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
    int start1=Integer.parseInt(e1[0].substring(0, 2)+e1[0].substring(3));
    int end1=Integer.parseInt(e1[1].substring(0, 2)+e1[1].substring(3));
    int start2=Integer.parseInt(e2[0].substring(0, 2)+e2[0].substring(3));
    int end2=Integer.parseInt(e2[1].substring(0, 2)+e2[1].substring(3));
    System.out.println(start1);
    System.out.println(end1);
    System.out.println(start2);
    System.out.println(end2);
        if (end1 < start2 || end2 < start1)  return false;
    return true; 
    }
}
```

## Approach 4 — 2024-09-14 12:10 (java)

*Runtime: 1 ms (faster than 19.1%) · Memory: 41.4 MB*

```java
class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
    int start1=Integer.parseInt(e1[0].substring(0, 2)+e1[0].substring(3));
    int end1=Integer.parseInt(e1[1].substring(0, 2)+e1[1].substring(3));
    int start2=Integer.parseInt(e2[0].substring(0, 2)+e2[0].substring(3));
    int end2=Integer.parseInt(e2[1].substring(0, 2)+e2[1].substring(3));
        if(end1<start2||end2<start1) return false;
    return true; 
    }
}
```
