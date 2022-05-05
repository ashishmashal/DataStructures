package com.bridgelabz.LinkedList;

class Oprations {
    Node head,tail;
    /*
    Created Method For adding Element in Linked List
    i.e public void add(int data).
     */
    public void add(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            Node temp = head;
            this.head = node;
            node.address = temp;
        }
    }
    /*
    For printing the element of Linked list Created Print Method
    i.e. public void print();
     */
    public void print(){
        if(head == null){
            System.out.println("Linked List Is Empty");
        }else{
            Node temp = head;
            while (temp !=null )
            {
                System.out.print(temp.data + "=>");
                temp = temp.address;
            }
        }
    }
}
