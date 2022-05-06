package com.bridgelabz.LinkedList;

class Oprations {
    public static   Node head, tail;
    public int size;

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

    public void appending(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            Node temp=head;
            while (temp.address!=null){
                temp=temp.address;
            }
            temp.address=node;
        }
    }
    //method for
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.address = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
        //Size will count the number of nodes present in the list
        size++;
    }
    public void InsertInBetween(int data) {
        Node node = new Node(data);
        if (head == null) {
            //If list is empty, both head and tail would point to new node
            head = node;
            tail = node;
        } else {
            Node temp, position;
            //Store the mid-position of the list
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            //Node temp will point to head
            temp = head;
            position = null;

            //Traverse through the list till the middle of the list is reached
            for (int i = 0; i < count; i++) {
                //Node current will point to temp
                position = temp;
                //Node temp will point to node next to it.
                temp = temp.address;
            }
            position.address = node;
            node.address = temp;
        }
        size++;
    }
    public void pop(){
        if (head != null){
            Node temp = head;
            head = head.address;
        }
    }
    static Node removeLastNode()
    {
        if (head == null)
            return null;

        if (head.address == null) {
            return null;
        }

        // Find the second last node
        Node second_last = head;
        while (second_last.address.address != null)
            second_last = second_last.address;

        // Change next of second last
        second_last.address = null;

        return head;
    }


    /*
    For printing the element of Linked list Created Print Method
    i.e. public void print();
     */
    public  void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {

            while (temp != null) {
                System.out.print(temp.data + "=>"+  "\t") ;
                temp = temp.address;
            }
        }
    }
}

