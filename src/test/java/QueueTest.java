import org.junit.Test;

public class QueueTest {
    @Test
    public void queueWithArrayTest(){
        /*https://java2blog.com/implement-queue-using-array-in-java/*/
        QueueWithArray queue = new QueueWithArray(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.dequeue();
        queue.enqueue(43);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
    }

    @Test
    public void queueWithLinkedListTest(){
        /*https://java2blog.com/implement-queue-using-linked-list-in-java/*/
        QueueWithLinkedList queue = new QueueWithLinkedList();
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.dequeue();
        queue.enqueue(43);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
    }
}
