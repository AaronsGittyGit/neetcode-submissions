class MinStack {
    private Deque<Integer> stack;
    public MinStack() {
         stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        int getTop = stack.pop();
        stack.push(getTop);
        return getTop;
    }
    
    public int getMin() {
        int min = stack.peek();
        if (stack.size() == 1) {
            return min;
        }
        int currentNum;
        for (int i = 0; i < stack.size(); i++) {
            currentNum = stack.pop();
            if (min > currentNum) {
                min = currentNum;
            }
            stack.add(currentNum);
        }

        return min;
    }
}
