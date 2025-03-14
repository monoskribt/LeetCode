package Medium;


public class DesignAStackWithIncrementOperation {

    private final int[] stack;
    private int top = -1;

    public DesignAStackWithIncrementOperation(int maxSize) {
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if(top < stack.length - 1) {
            stack[++top] = x;
        }
    }

    public int pop() {
        if(top == -1) {
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, stack.length); i++) {
            stack[i] += val;
        }
    }
}
