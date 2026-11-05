# 4015. Weighted Sum of a Tree

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/weighted-sum-of-a-tree/
**Tags:** Array, Tree, Depth-First Search

## Approach 1 — 2026-08-09 09:40 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 107.8 MB*

```java
class Solution {

    public long weightedSum(int[] parent, int[] nums) {

        int n = parent.length;

        int[] depth = new int[n];
        depth[0] = 1;

        for (int i = 1; i < n; i++) {

            if (depth[i] != 0)
                continue;

            int node = i;

            // Follow parents until we reach a node whose depth is known
            while (depth[node] == 0) {
                node = parent[node];
            }

            // Fill depths backwards
            int d = depth[node];

            node = i;

            while (depth[node] == 0) {
                depth[node] = ++d;
                node = parent[node];
            }
        }

        int h = 0;

        for (int d : depth) {
            h = Math.max(h, d);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (h - depth[i] + 1);
        }

        return ans;
    }
}
```

## Approach 2 — 2026-08-09 09:41 (java)

*Runtime: 4 ms (faster than 100.0%) · Memory: 108 MB*

```java
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] depth = new int[n];
        depth[0] = 1;
        for (int i = 1; i < n; i++) {
            if (depth[i] != 0)continue;
            int node = i;
            while (depth[node] == 0) {
                node = parent[node];
            }
            int d = depth[node];
            node = i;
            while (depth[node] == 0) {
                depth[node] = ++d;
                node = parent[node];
            }
        }
        int h = 0;
        for (int d : depth) {
            h = Math.max(h, d);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (h - depth[i] + 1);
        }
        return ans;
    }
}
```

## Approach 3 — 2026-08-09 09:42 (java)

*Runtime: 51 ms (faster than 65.1%) · Memory: 156 MB*

```java
class Solution {

    public long weightedSum(int[] parent, int[] nums) {

        int n = parent.length;

        List<List<Integer>> children = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            children.get(parent[i]).add(i);
        }

        int[] depth = new int[n];
        depth[0] = 1;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);

        int h = 1;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int child : children.get(node)) {

                depth[child] = depth[node] + 1;
                h = Math.max(h, depth[child]);

                queue.offer(child);
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (h - depth[i] + 1);
        }

        return ans;
    }
}
```
