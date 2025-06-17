import java.util.*;

public class BurgerBFS{
    private int nodes;
    private LinkedList<Integer> adj[];
    private Queue<Integer> vertexQueue;

    public BurgerBFS(int vertex){
        nodes=vertex;
        adj = new LinkedList[nodes];

        for (int i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }

        vertexQueue = new LinkedList<Integer>();
    }
    public void addEdge(int source,int dest){
        adj[source].add(dest);
    }

    public void getAdj() {
        for (LinkedList<Integer> linkedList : adj) {
            System.out.println(linkedList);
        }
    }

    public void bfs(int sumber){
        boolean traversalOrder[] = new boolean[nodes];
        int vertexDikunjungi = 0;
        traversalOrder[sumber] = true;
        vertexQueue.add(sumber);

        while (!vertexQueue.isEmpty()){
            vertexDikunjungi=vertexQueue.poll();
            System.out.print(vertexDikunjungi + " ");
            for (int tetangga : adj[vertexDikunjungi]){
                if (!traversalOrder[tetangga]) {
                    traversalOrder[tetangga]=true;
                    vertexQueue.add(tetangga);
                }
            }
        }
    }
}