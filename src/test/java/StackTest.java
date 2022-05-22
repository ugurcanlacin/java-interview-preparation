import org.junit.Test;

public class StackTest {
    @Test
    public void stackTest(){
        /*https://java2blog.com/implement-stack-using-array-in-java/*/
        Stack stack = new Stack(10);
        stack.pop();
        System.out.println("=================");
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(40);
        System.out.println("=================");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("=================");
    }
}
