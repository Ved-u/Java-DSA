# 2888. Reshape Data: Concatenate

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/reshape-data-concatenate/
**Tags:** 

## Approach 1 — 2025-12-06 18:37 (pythondata)

*Runtime: 277 ms (faster than 94.5%) · Memory: 66.9 MB*

```pythondata
import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1,df2])
```
