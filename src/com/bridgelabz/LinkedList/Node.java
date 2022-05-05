package com.bridgelabz.LinkedList;

public class Node {
    int data;
    Node address;

    public Node(int data) {
        this.data = data;
        this.address = null;
    }

    @Override
    public String toString() {
        return ("Node" +  "Data" + data + "Address"+ address );
    }
}
