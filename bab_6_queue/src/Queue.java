/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        
    }
    
    
    //Menambahkan elemen ke queue
    public void enqueue(int value){
        if(!isFull()){
            if(rear == maxSize -1){ //Circular wrap
                rear = -1;
            }
            queueArray[++rear] = value;
            
            nItems++;
            
        } else {
            System.out.println("Queue sudah penuh");
        }
    }
    
    //Menghapus elemen dari queue
    
    public int dequeue(){
        if(!isEmpty()){
            int temp = queueArray[front++];
            
            if (front == maxSize){
                front = 0; //Circular wrap
            }
            nItems--;
            return temp;
            
        } else{
            System.out.println("Queue kosong");
            return -1;
        }
    }
    
    //melihat elemen paling depan tanpa menghapusnya
    public int peek(){
        if(!isEmpty()){
            return queueArray[front];
        }else{
            System.out.println("Queue kosong");
            return -1;
        }
    }
    
    //mengecek apakah queue kosong
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    
    //mengecek apakah queue penuh
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
