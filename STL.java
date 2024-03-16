public class Stack {
    private static final int MAX_SIZE = 100;
    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int val) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow!");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
