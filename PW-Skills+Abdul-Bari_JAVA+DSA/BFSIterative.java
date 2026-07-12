import java.util.*;
public class BFSIterative {
    static class Graph {
        private final List<List<Integer>> adjList;
        public Graph(int vertices) {
            adjList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }
        public void addEdge(int src, int dest) {
            adjList.get(src).add(dest);
            adjList.get(dest).add(src); // For undirected graph
        }
        public void bfs(int start) {
            boolean[] visited = new boolean[adjList.size()];
            Queue<Integer> queue = new LinkedList<>();
            visited[start] = true;
            queue.add(start);
            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");
                for (int neighbor : adjList.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(13);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(5, 9);
        graph.addEdge(5, 10);
        graph.addEdge(4, 7);
        graph.addEdge(4, 8);
        graph.addEdge(7, 11);
        graph.addEdge(7, 12);
        System.out.println("Breadth-First Search (starting from node 0):");
        graph.bfs(1);
    }
}