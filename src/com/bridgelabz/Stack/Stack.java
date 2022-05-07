package com.bridgelabz.Stack;

import com.bridgelabz.LinkedList.CallingMethods;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans;
        CallingMethodsStack callingMethodsStack = new CallingMethodsStack();
        do {

            System.out.println("Enter a No For Edit the Details");
            System.out.println("""
                     1 =  Push Data Into Stack\s
                     2 = Peek From Stack\s
                     3 = Pop From Stack\s                   
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    callingMethodsStack.PushIntoStack();
                    break;
                case 2:
                        callingMethodsStack.PeekFromStack();
                    break;
                case 3:
                    callingMethodsStack.PopFromStack();
                    break;
                default:
                    System.out.println("Enter Correct choice");

            }
            System.out.println("\n Do Ypu Want To continue ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);

    }
}
