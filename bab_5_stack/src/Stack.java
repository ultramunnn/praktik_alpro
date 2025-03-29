/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Konstruktor untuk stack dengan ukuran tertentu
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Menambahkan elemen ke stack
    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;  // Menambahkan elemen dan memajukan top
        } else {
            System.out.println("Stack sudah penuh");
        }
    }

    // Mengambil elemen terakhir dari stack
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];  // Mengambil elemen dan mengurangi top
        } else {
            System.out.println("Stack kosong");
            return -1;  // Return -1 jika stack kosong
        }
    }

    // Melihat elemen teratas dari stack tanpa mengeluarkannya
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];  // Mengembalikan elemen paling atas tanpa menghapusnya
        } else {
            System.out.println("Stack kosong");
            return -1;  // Return -1 jika stack kosong
        }
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return (top == -1);  // Jika top == -1, maka stack kosong
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return (top == maxSize - 1);  // Jika top sudah mencapai maxSize-1, maka stack penuh
    }
}
