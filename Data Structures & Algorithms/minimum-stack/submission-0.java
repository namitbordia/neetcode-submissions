class MinStack {
    private Stack<Integer> s;    // main stack
    private Stack<Integer> s1;   // min history stack
    private int min;

    public MinStack() {
        s = new Stack<>();
        s1 = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        s.push(val);

        if (val <= min) {
            s1.push(min);   // store old min
            min = val;
        }
    }

    public void pop() {
        if (s.isEmpty()) return;

        int top = s.pop();

        if (top == min) {
            min = s1.pop();   // restore previous min
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}
