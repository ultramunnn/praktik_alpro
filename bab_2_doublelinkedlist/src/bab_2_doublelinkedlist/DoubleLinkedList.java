/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab_2_doublelinkedlist;

/**
 *
 * @author munir
 */
public class DoubleLinkedList {
    private Node head;
    private Node tail;
    
    
    //Menambahkan node di awal list
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        } else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    
    //Menambahkan node di akhir list
    public void addLast (String data){
        Node newNode = new Node (data);
        if (tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        
    }
    
    //Menampilkan semua elemen dari depan ke belakang
    public void printFoward(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
        
    }
    
    //Menampilkan semua elemen dari belakang ke depan
    public void printBackward(){
        Node current = tail;
        while (current != null){
            System.out.print(current.data + "<->");
            current = current.prev;
        }
        
        System.out.println("null");
        
    }
    
    // Menghapus node berdasarkan nama
    public void removeByName(String name) {
        Node current = head;

        // Cari node yang memiliki data = name
        while (current != null && !current.data.equals(name)) {
            current = current.next;
        }

        // Jika tidak ditemukan
        if (current == null) {
            System.out.println("Node dengan nama \"" + name + "\" tidak ditemukan.");
            return;
        }

        // Jika node yang akan dihapus adalah head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // Jika list menjadi kosong
            }
        }

        // Jika node yang akan dihapus adalah tail
        else if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // Jika list menjadi kosong
            }
        }

        // Jika node berada di tengah
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Node dengan nama \"" + name + "\" telah dihapus.");
    }
}
