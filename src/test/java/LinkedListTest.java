import org.junit.Test;

public class LinkedListTest {
    @Test
    public void linkedListTest(){
        /* https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/ */
        LinkedList list = new LinkedList();

        // Insert the values
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();
    }
}
