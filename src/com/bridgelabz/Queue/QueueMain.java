package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Queue Problem");

        QOprations qOprations=new QOprations();

        qOprations.enqueue(56);
        qOprations.enqueue(30);
        qOprations.enqueue(70);
        System.out.println("Queue Front : " + qOprations.front.key);
        System.out.println("Queue Rear : " + qOprations.rear.key);
    }
}
