package com.bridgelabz.Stack;

public class CallingMethodsStack {
    OprationsStack oprationsStack = new OprationsStack();
    public void PushIntoStack(){
        oprationsStack.push(70);
        oprationsStack.push(30);
        oprationsStack.push(56);

        oprationsStack.display();
    }
    public void PopFromStack(){
        oprationsStack.pop();
        oprationsStack.display();
    }

    public void PeekFromStack(){
        System.out.printf("\nTop element is %d\n", oprationsStack.peek());
    }

}
