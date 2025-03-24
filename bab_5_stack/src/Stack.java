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
    private int [] stackArray;
    private int top;
    
    
    public Stack (int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    //menambahkan elemen ke stack 
    public void push (int value){
    
    if(!isFull()){
        stackArray[++top] = value;
       
        } else {
            
        System.out.println("Stack sudah penuh");
        
        }
    }
    
    //mengambil elemen dari stack terakhir

    public int pop() {
        
        if (!isEmpty()) {
            
            return stackArray[top--];
    } else {
            
        System.out.println("Stack kosong");
        
            return -1;
    }
}
    
// Melihat elemen teratas dari stack tanpa mengeluarkannya
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
        System.out.println("Stack kosong");
            return -1;
    }   
}
    
    //mengecek apakah stack kosong  
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //mengecek apakah stack penuh
    public boolean isFull(){
        return (top == maxSize -1);
    }
        
    
}
