import java.util.*;
public class Main{
    public static void main(String[] args){
        Graph<String>graph=new Graph<>();
        Vertex<String>taraz=new Vertex<>("taraz");
        Vertex<String>ulanbator=new Vertex<>("ulan bator");
        Vertex<String>michigan=new Vertex<>("michigan");
        graph.addV(taraz);
        graph.addV(ulanbator);
        graph.addV(michigan);
        graph.addE(taraz,ulanbator,4122.7);
        graph.addE(ulanbator,michigan,9680.0);
        graph.addE(taraz,michigan,10046.0);
        Search<String>bfs=new BFS<>();
        List<Vertex<String>>pathBFS=bfs.search(taraz,michigan);
        System.out.println("path of bfs"+pathBFS);
        Search<String>dijkstra=new Dijkstra<>(graph);
        List<Vertex<String>>pathDijkstra=dijkstra.search(taraz, michigan);
        System.out.println("path of dijkstra"+pathDijkstra);
    }
}
