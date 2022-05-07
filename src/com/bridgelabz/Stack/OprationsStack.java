package com.bridgelabz.Stack;

public class OprationsStack {
    NodeStack temp = new NodeStack();
    NodeStack top = null;

    OprationsStack() {
    }

    public void push(int x) {
        NodeStack temp = new NodeStack();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
        } else {
            temp.data = x;
            temp.link = this.top;
            this.top = temp;
        }
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }

    public void display() {
        if (this.top == null) {
            System.out.printf("\nStack Underflow");
            System.exit(1);
        } else {
            for(NodeStack temp = this.top; temp != null; temp = temp.link) {
                System.out.printf("%d->", temp.data);
            }
        }

    }
}
