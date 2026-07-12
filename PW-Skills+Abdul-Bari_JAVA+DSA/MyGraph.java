import java.util.*;
public class MyGraph {
    public static void main(String[] args) {
       Graph g=new Graph(10);
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 3);
       g.addEdge(1, 4);
       g.addEdge(2, 5);
       g.addEdge(2, 6);
       g.addEdge(6, 7);
       g.addEdge(5, 8);
       g.addEdge(8, 9);
       g.bfs(0);
       System.out.println();
       g.dfs(0);
    }
}
class Graph{
    List<List<Integer>> adjecencyList;
    public Graph(int vertices){
        adjecencyList=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjecencyList.add(new ArrayList<>());
        }
    }
    public void addEdge(int src,int destination){
        adjecencyList.get(src).add(destination);
        adjecencyList.get(destination).add(src);
    }
    public void bfs(int start){
        boolean visited[]=new boolean[adjecencyList.size()];
        Queue<Integer> queue=new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int node=queue.poll();
            System.out.print(node+" ");
            for(int x:adjecencyList.get(node)){
               if(!visited[x]){
                    visited[x]=true;
                    queue.add(x);
               }    
            }
        }
    }
    public void dfs(int start){
        boolean visited[]=new boolean[adjecencyList.size()];
        Stack<Integer> stk=new Stack<>();
        stk.push(start);
        while(!stk.isEmpty()){
            int node=stk.pop();
            if(!visited[node]){
                visited[node]=true;
                System.out.print(node+" ");
                for(int x:adjecencyList.get(node)){
                    if(!visited[x])stk.push(x);
                }
            }
        }
    }
}