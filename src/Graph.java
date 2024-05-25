import java.util.*;
public class Graph<V>{
    private Map<Vertex<V>,List<Edge<V>>> map;
    public Graph(){
        map=new HashMap<>();
    }
    public void addV(Vertex<V> vertex){
        map.put(vertex,new ArrayList<>());
    }
    public void addE(Vertex<V> source,Vertex<V> dest,Double weight){
        Edge<V> edge = new Edge<>(source, dest, weight);
        map.get(source).add(edge);
        source.addAdjacentVertex(dest, weight);
    }
    public List<Edge<V>> getE(Vertex<V> vertex){
        return map.get(vertex);
    }
    public Set<Vertex<V>> getV(){
        return map.keySet();
    }
}
