/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author munir
 */
public class CircularLinkedList {

    private Node head;
    private Node tail;
    
    public void add(String data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        } else {
           
            tail.next = newNode;
        }
        
         tail = newNode;
         tail.next = head;
    }
    
    public void printList(){
        if(head != null){
            Node current = head;
            
            do{
                System.out.println(current.data + "->");
                current = current.next;
            } while(current != head);
            
            System.out.println("(head)");
            
         }
    }
    
     // Method untuk menghapus node berdasarkan data
    public boolean removeTask(String data) {
        if (head == null) {
            return false; // List kosong, tidak ada yang bisa dihapus
        }

        Node current = head;
        Node previous = null;

        // Cari node yang akan dihapus
        do {
            if (current.data.equals(data)) {
                // Jika node yang akan dihapus adalah head
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Perbarui tail.next ke head baru

                    // Jika list hanya memiliki satu node
                    if (head == tail) {
                        tail = null;
                        head = null;
                    }
                } else if (current == tail) {
                    // Jika node yang akan dihapus adalah tail
                    tail = previous;
                    tail.next = head;
                } else {
                    // Jika node yang akan dihapus berada di tengah
                    previous.next = current.next;
                }
                return true; // Node berhasil dihapus
            }
            previous = current;
            current = current.next;
        } while (current != head);

        return false; // Node tidak ditemukan
    }
 }
    
   
    

