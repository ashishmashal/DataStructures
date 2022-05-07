package com.bridgelabz.LinkedList;

import java.util.Scanner;

public class LinkedList {


    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");
        Scanner scanner = new Scanner(System.in);
        int ans;
        CallingMethods callingMethods = new CallingMethods();
        Oprations oprations = new Oprations();

        do {

            System.out.println("Enter a No For Edit the Details");
            System.out.println("""
                     1 =  Adding The data\s
                     2 = Appending The Data\s
                     3 = Insert In Between \s
                     4 = Delete The 1st Node \s 
                     5 = Delete The Last Node \s 
                   
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    callingMethods.adding();
                    oprations.print();
                    break;
                case 2:
                    callingMethods.appending();
                    oprations.print();
                    break;
                case 3:
                    callingMethods.InBetween();
                   // oprations.print();
                    break;
                case 4:
                    callingMethods.deleteNode();
                    break;
                case 5:
                    callingMethods.deleteLastNode();
                    break;

                default:
                    System.out.println("Enter Correct choice");

            }
            System.out.println("\n Do Ypu Want To continue ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }
}
