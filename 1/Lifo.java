package com.company;

public class Lifo {

    private int max;
    private int[] stackArray;
    private int top = -1;

    public Lifo(int max) {
        this.max = max;
        stackArray = new int[max];
    }

    public void Push(int item) {
        if (IsFull()) {
            System.out.println("Lifo is full");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public void Pop() {
        if (IsEmpty()) {
            System.out.println("Lifo is empty");
        } else {
            top--;
        }
    }

    public boolean IsEmpty() {
        return (top == -1);
    }

    public boolean IsFull() {
        return (top == max-1);
    }

    public int Top() {
        return top;
    }

    public void Print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void ShowMaxSize() {
        System.out.println(max);
    }
}
