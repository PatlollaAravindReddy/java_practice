package leetCode.stack;

import java.util.Stack;

class MyQueue {

    Stack<Integer> io;
    Stack<Integer> op;

    public MyQueue() {
        io = new Stack<>();
        op = new Stack<>();
    }

    public void push(int x) {
        io.push(x);
    }

    public int pop() {
        peek();
        return op.pop();
    }

    public int peek() {
        if(op.empty()) {
            while (!io.empty()) {
                op.push(io.pop());
            }
        }
        return op.peek();
    }

    public boolean empty() {
        return io.isEmpty() && op.isEmpty();
    }
}