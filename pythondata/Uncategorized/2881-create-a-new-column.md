# 2881. Create a New Column

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/create-a-new-column/
**Tags:** 

## Approach 1 — 2025-12-06 18:42 (pythondata)

*Runtime: 269 ms (faster than 72.7%) · Memory: 66.5 MB*

```pythondata
import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["bonus"] = employees["salary"]*2
    return employees
```
