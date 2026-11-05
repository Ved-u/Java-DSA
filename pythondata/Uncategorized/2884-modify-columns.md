# 2884. Modify Columns

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/modify-columns/
**Tags:** 

## Approach 1 — 2025-12-06 18:29 (pythondata)

*Runtime: 265 ms (faster than 73.7%) · Memory: 66.5 MB*

```pythondata
import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["salary"] = employees["salary"]*2
    return employees
```
