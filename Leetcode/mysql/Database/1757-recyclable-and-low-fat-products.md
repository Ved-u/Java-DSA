# 1757. Recyclable and Low Fat Products

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/recyclable-and-low-fat-products/
**Tags:** Database

## Approach 1 — 2025-10-14 21:50 (mysql)

*Runtime: 431 ms (faster than 100.0%) · Memory: 0B*

```mysql
# Write your MySQL query statement below
SELECT product_id FROM products WHERE low_fats = 'Y' AND recyclable = 'Y';
```
