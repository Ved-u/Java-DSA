# 2879. Display the First Three Rows

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/display-the-first-three-rows/
**Tags:** 

## Approach 1 — 2025-12-06 18:21 (pythondata)

*Runtime: 267 ms (faster than 77.8%) · Memory: 66.2 MB*

```pythondata
import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3).copy()
```

## Approach 2 — 2025-12-06 18:23 (pythondata)

*Runtime: 268 ms (faster than 76.0%) · Memory: 66.4 MB*

```pythondata
import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3)
```
