public class Vertex<V>{
    private V data;
    private Map<Vertex<V>,Double> adjacentVertices;
    public void addAdjacentVertex(Vertex<V> destination,Double weight){
        adjacentVertices.put(destination,weight);
    }
}
