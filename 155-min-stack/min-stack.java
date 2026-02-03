class MinStack {

    Stack<Long> minStack;
    long minVal;

    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.push((long) val);
            minVal = val;
        } else if (val < minVal) {
            minStack.push(2L * val - minVal);
            minVal = val;
        } else {
            minStack.push((long) val);
        }
    }

    public void pop() {
        long top = minStack.pop();
        if (top < minVal) {
            minVal = 2 * minVal - top;
        }
    }

    public int top() {
        long top = minStack.peek();
        return top < minVal ? (int) minVal : (int) top;
    }

    public int getMin() {
        return (int) minVal;
    }
}
