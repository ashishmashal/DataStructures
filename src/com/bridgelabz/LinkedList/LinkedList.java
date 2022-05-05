package com.bridgelabz.LinkedList;

public class LinkedList {


    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");

        Node thirdNode = new Node(56);
        Node secondNode = new Node(30);
        Node firstNode = new Node(70);
        firstNode.address = secondNode;
        secondNode.address = thirdNode;
        Node temp = firstNode;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.address;
        }
    }
}
