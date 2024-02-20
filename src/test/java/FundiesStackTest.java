import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class FundiesStackTest {
    private FundiesStack<Integer> intStack;
    private FundiesStack<String> stringStack;

    @BeforeEach
    public void setup() {
        intStack = new FundiesStack<>();
        stringStack = new FundiesStack<>();
    }

    @Test
    public void emptyTrueWhenStackEmpty() {
        assertTrue(intStack.empty());
        assertTrue(stringStack.empty());
    }

    @Test
    public void emptyFalseWhenStackNotEmpty() {
        intStack.push(1);
        assertFalse(intStack.empty());
        stringStack.push("A");
        stringStack.push("B");
        assertFalse(stringStack.empty());
    }

    @Test
    public void popThrowsExceptionWhenStackEmpty() {
        assertThrows(EmptyStackException.class, () -> intStack.pop());
    }

    @Test
    public void peekThrowsExceptionWhenStackEmpty() {
        assertThrows(EmptyStackException.class, () -> intStack.peek());
    }

    @Test
    public void pushAddsItem() {
        assertTrue(intStack.empty());
        intStack.push(1);
        assertFalse(intStack.empty());
    }

    @Test
    public void PopRemovesSameItem() {
        intStack.push(10);
        assertEquals(10, intStack.pop());
        assertTrue(intStack.empty());
    }

    @Test
    public void PeekRetrievesSameItem() {
        intStack.push(11);
        assertEquals(11, intStack.peek());
        assertFalse(intStack.empty());
    }

}