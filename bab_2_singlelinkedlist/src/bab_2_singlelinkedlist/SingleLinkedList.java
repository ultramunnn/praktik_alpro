/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_alpro;

/**
 *
 * @author munir
 */
public class SingleLinkedList {
    
    private Node head;
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public void removeByTitle(String title){
    
         if (head == null) {
            System.out.println("List is empty.");
            return;
        }
         
        if(head.data.equals(title)){
            head = head.next;
            return;
        }
        
        Node current = head;
        Node prev = null;
        
        
        while (current != null && !head.data.equals(title)){
            prev = current;
            current = current.next;
        }
        
        if(current == null){
            System.out.println("Title Not Found");
            return; 
           
        }
        
        
        prev.next = current.next;
        
        
    }
    
}
