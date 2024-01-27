//Create a Java class called MinStack of Integers that supports standard stack operations 
//(push, pop, top, and isEmpty) and also provides a getMin method that returns the minimum element in the stack.


package labPrograms;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int x) {
        stack.push(x);

        // Update the minStack with the current minimum element
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Remove the element from the top of the stack
    public void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();

            // If the popped element is the current minimum, update minStack
            if (poppedElement == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    // Get the element from the top of the stack without removing it
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Get the minimum element from the stack
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test the MinStack class
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(1);
        minStack.push(4);
        minStack.push(1);
        minStack.push(5);

        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());

        minStack.pop();
        System.out.println("After pop, minimum element: " + minStack.getMin());
    }
}
