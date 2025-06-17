import java.util.*;

public class BurgerDFS {
    private int verteks;

    private LinkedList<Integer> adj[];
    private boolean visited[];

    @SuppressWarnings("unchecked")
    public BurgerDFS (int v) {
        verteks=v;
        adj = new LinkedList[verteks];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<Integer>();

        visited = new boolean[verteks];
         for (int i = 0; i < verteks; i++) {
            visited[i]=false;
         }  
    }

     public void addEdge(int source,int dest){
            adj[source].add(dest);
        }

    public void dfs(int sourceVertex) {
        Stack<Integer> stack = new Stack<>();

        stack.push(sourceVertex);

    while (stack.empty() == false) {
        sourceVertex = stack.peek();
        stack.pop();

    if (visited[sourceVertex] == false) {
        System.out.print(sourceVertex + " ");
        visited[sourceVertex] = true;
    }

    Iterator<Integer> itr = adj[sourceVertex].iterator();

    while (itr.hasNext()) {
        int v = itr.next();
        if (!visited[v])
        stack.push(v);
    }
    }
    }
}

