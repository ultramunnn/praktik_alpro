/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_alpro;

/**
 *
 * @author munir
 */
public class BookList {
    public static void main(String[] args) {
        SingleLinkedList booklist = new SingleLinkedList();
        booklist.addLast("Harry Potter");
        booklist.addLast("Lord of the Rings");
        booklist.addLast("Game of Thrones");
        
        System.out.println("Daftar buku:");
        booklist.printList();
        
        booklist.removeByTitle("Harry Potter");
        
        System.out.println("Daftar buku:");
        booklist.printList();
        
    }
}
