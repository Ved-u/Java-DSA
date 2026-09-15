import java.util.*;
public class DFSIterative {
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
        public void dfs(int start){
            boolean[] visited = new boolean[adjList.size()];
            Stack<Integer> stack = new Stack<>();
            stack.push(start);
            while (!stack.isEmpty()) {
                int node = stack.pop();
                if (!visited[node]) {
                    System.out.print(node + " ");
                    visited[node] = true;
                     for (int neighbor : adjList.get(node)) {
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
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
        graph.dfs(1);
    }
}