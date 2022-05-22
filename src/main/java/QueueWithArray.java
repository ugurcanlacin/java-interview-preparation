public class QueueWithArray {
    private int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    QueueWithArray(int queueSize){
        this.capacity = queueSize;
        front = 0;
        rear = -1;
        queueArr = new int[queueSize];
    }

    public void enqueue(int element){
        if (!isFull()){
            if (rear == capacity - 1){
                rear = 0;
            }
            rear++;
            queueArr[rear] = element;
            currentSize++;
            System.out.println(element + " is added to queue...");
        } else {
            System.out.println("Queue is full...");
        }
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return capacity == currentSize;
    }
}
