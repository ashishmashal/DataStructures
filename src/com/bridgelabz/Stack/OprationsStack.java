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
