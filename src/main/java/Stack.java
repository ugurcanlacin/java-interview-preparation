public class Stack {
    int size;
    int arr[];
    int top;
    Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element){
        if (!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            // You can create a new array with doubled the size
            // and copy all the elements from old to new array.
            System.out.println("Stack is full...");
        }
    }

    public int pop(){
        if (!isEmpty()){
            int poppedElement = this.arr[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return this.arr[top];
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull(){
        return  (size - 1 == top);
    }
}
