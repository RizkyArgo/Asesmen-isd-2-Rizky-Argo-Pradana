public class Main{
    public static void main(String[] args) {
         BurgerDFS graf = new BurgerDFS(11);
        BurgerBFS g = new BurgerBFS(11);

        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(4,5);
        g.addEdge(4,7);
        g.addEdge(5,6);
        g.addEdge(5,8);
        g.addEdge(6,3);
        g.addEdge(7,8);
        g.addEdge(7,9);
        g.addEdge(8,10);
        g.addEdge(10,3);

        graf.addEdge(0,1);
        graf.addEdge(0,4);
        graf.addEdge(1,2);
        graf.addEdge(2,3);
        graf.addEdge(4,5);
        graf.addEdge(4,7);
        graf.addEdge(5,6);
        graf.addEdge(5,8);
        graf.addEdge(6,3);
        graf.addEdge(7,8);
        graf.addEdge(7,9);
        graf.addEdge(8,10);
        graf.addEdge(10,3);
        System.out.println("Langkah yg berdekatan ditampilkan dulu (BFS) : ");
        g.bfs(0);
        
        System.out.println(" ");

        System.out.println("Langkah yg Semakin jauh ditampilkan dulu (DFS) : ");
        graf.dfs(0);
       
    }

        
}
//List langkah:

//preheat oven= 0
//bake bread = 1
//Serve bread = 2
//eat = 3
//preheat pan = 4
//set plate = 5
//add some pickle = 6
//add kraby patty = 7
//serve patty = 8
//add tartar = 9
//pour sauce = 10




