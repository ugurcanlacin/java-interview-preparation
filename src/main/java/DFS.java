import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    // Recursive DFS
    public void dfs(Node node){
        System.out.print(node.data + " ");
        node.visited = true;
        List<Node> neighbors = node.getNeighbors();
        for (int i = 0; i < neighbors.size(); i++) {
            Node n = neighbors.get(i);
            if (n != null && !n.visited){
                dfs(n);
            }
        }
    }

    // Iterative DFS
    public void dfsUsingStack(Node node){
        Stack<Node> stack = new Stack<Node>();
        stack.add(node);
        while (!stack.isEmpty()){
            Node element = stack.pop();
            if (!element.visited){
                System.out.print(element.data + " ");
                element.visited = true;
            }
            List<Node> neighbors = element.getNeighbors();
            for (int i = 0; i < element.getNeighbors().size(); i++) {
                Node n = neighbors.get(i);
                if (n != null && !n.visited){
                    stack.add(n);
                }
            }
        }
    }
}

class Node{
    int data;
    boolean visited;
    List<Node> neighbors;

    Node(int data){
        this.data = data;
        this.neighbors = new ArrayList<>();
    }
    public void addNeighbor(Node node){
        this.neighbors.add(node);
    }
    public List getNeighbors() {
        return this.neighbors;
    }
}
