import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    LinkedList<Integer>[] adj;
    int v;
    int e;
    public Main(int nodes){
        v=nodes;
        e=0;
        this.adj=new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        e++;
    }
    public void dfs(int s){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
            }
            for (Integer v:adj[u]){
                if(!visited[v]) {
                    stack.push(v);
                }
            }
        }

    }

















    public void bfs(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while (!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for (Integer v: adj[u]){
                if(!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main g = new Main(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
    }
}