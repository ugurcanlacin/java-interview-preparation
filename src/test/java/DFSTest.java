import org.junit.Test;

public class DFSTest {
    @Test
    public void dfsRecursiveTest(){
        /*https://java2blog.com/depth-first-search-in-java/*/

        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

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

        DFS dfsUtil = new DFS();
        dfsUtil.dfs(node40);
        // 40 10 30 60 70 20 50
    }

    @Test
    public void dfsStackTest(){
        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

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

        DFS dfsUtil = new DFS();
        dfsUtil.dfsUsingStack(node40);
        // 40 20 50 70 60 30 10
    }
}
