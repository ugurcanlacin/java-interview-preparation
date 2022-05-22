import org.junit.Test;

public class BFSTest {
    @Test
    public void bfsTest(){
        /*https://java2blog.com/breadth-first-search-in-java/*/
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addNeighbor(node10);
        node40.addNeighbor(node20);
        node10.addNeighbor(node30);
        node20.addNeighbor(node10);
        node20.addNeighbor(node30);
        node20.addNeighbor(node60);
        node20.addNeighbor(node50);
        node30.addNeighbor(node60);
        node60.addNeighbor(node70);
        node50.addNeighbor(node70);

        // 40 10 20 30 60 50 70

        BFS bfs = new BFS();
        bfs.bfs(node40);
    }
}
