import java.util.Stack;

public class StackUser {
    public static void main(String[] args) {
        FundiesStack<String> myStack = new FundiesStack<>();
        myStack.push("homework");
        System.out.println(myStack.peek()); // homework
        myStack.push("email");
        myStack.push("pizza");
        // Finish the pizza.
        myStack.pop();
        System.out.println(myStack.pop());  // email
        System.out.println(myStack.pop());  // homework
        myStack.pop();
    }
}
