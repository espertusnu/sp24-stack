import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class FundiesStack<T> {
    private List<T> values = new ArrayList<>();

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no item,
     * false otherwise
     */
    public boolean empty() {
        return values.isEmpty();
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     */
    public void push(T item) {
        values.add(item);
    }

    /**
     * Looks at the item at the top of this stack
     * without removing it from the stack.
     *
     * @return the item at the top of this stack
     */
    public T peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return values.getLast();
    }

    /**
     * Removes and returns the item at the top of this stack.
     *
     * @return the item at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public T pop() {
        T result = peek();
        values.removeLast();
        return result;
    }
}
