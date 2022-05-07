package com.bridgelabz.LinkedList;
public class CallingMethods {
    Oprations oprations = new Oprations();
    public void adding(){
        oprations.add(70);
        oprations.add(30);
        oprations.add(56);

    }
    public void appending(){
        oprations.appending(56);
        oprations.appending(30);
        oprations.appending(70);
    }
    public void InBetween(){
        oprations.addNode(56);
        oprations.addNode(70);
        System.out.println("Before Adding 30");
        oprations.print();

        oprations.InsertInBetween(30);
        System.out.println("After Adding 30");
        oprations.print();

    }
    public void deleteNode(){
        oprations.pop();
        oprations.print();
    }
    public void deleteLastNode(){
        oprations.removeLastNode();
        oprations.print();
    }

}

