import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public void bfs(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node element = queue.remove();
            if (element != null && !element.visited){
                System.out.print(element.data + " ");
                element.visited = true;
            }
            List<Node> neighbors = element.getNeighbors();
            for(Node neighbor : neighbors){
                if (neighbor != null && !neighbor.visited){
                    queue.add(neighbor);
                }
            }
        }
    }

}
