import java.util.*;
public class Dijkstra<V>implements Search<V>{
    private Graph<V> Graph;
    public Dijkstra(Graph<V> graph){
        this.Graph=graph;
    }
    public List<Vertex<V>> search(Vertex<V> start,Vertex<V> end){
        Map<Vertex<V>,Double> distances=new HashMap<>();
        Map<Vertex<V>,Vertex<V>> previous=new HashMap<>();
        PriorityQueue<Vertex<V>> pq=new PriorityQueue<>(Comparator.comparing(distances::get));
        Set<Vertex<V>> visited=new HashSet<>();
        for(Vertex<V> vertex:Graph.getV()){
            distances.put(vertex, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);
        distances.put(start,0.0);
        pq.add(start);
        while(!pq.isEmpty()){
            Vertex<V> current=pq.poll();
            if(current.equals(end)){
                return conspath(previous,end);
            }
            if(visited.contains(current)){
                continue;
            }
            visited.add(current);
            for(Map.Entry<Vertex<V>,Double> neighborEntry:current.getAdjacentVertex().entrySet()){
                Vertex<V> neighbor=neighborEntry.getKey();
                Double edgeWeight=neighborEntry.getValue();
                double newDist=distances.get(current)+edgeWeight;
                if(newDist<distances.get(neighbor)){
                    distances.put(neighbor,newDist);
                    previous.put(neighbor,current);
                    pq.add(neighbor);
                }
            }
        }
        return Collections.emptyList();
    }
    private List<Vertex<V>> conspath(Map<Vertex<V>,Vertex<V>> previous,Vertex<V> end){
        List<Vertex<V>> path=new LinkedList<>();
        for(Vertex<V> at=end;at!=null;at=previous.get(at))path.add(at);
        Collections.reverse(path);
        return path;
    }
}
