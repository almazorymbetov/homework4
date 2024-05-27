import java.util.*;
public class Vertex<V>{
    private V data;
    private Map<Vertex<V>,Double> adjacentVertices;
    public Vertex(V data){
        this.data=data;
        this.adjacentVertices=new HashMap<>();
    }
    public V get(){
        return data;
    }
    public Map<Vertex<V>,Double> getA(){
        return adjacentVertices;
    }
    public void addAdjacentVertex(Vertex<V> destination,Double weight){
        adjacentVertices.put(destination,weight);
    }
    public Map<Vertex<V>, Double> getAdjacentVertex(){
        return adjacentVertices;
    }
    public String toString(){
        return data.toString();
    }
}
