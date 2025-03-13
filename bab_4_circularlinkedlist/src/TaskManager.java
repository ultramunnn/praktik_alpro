/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
public class TaskManager {
    
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();
        
        taskList.add("Konsisten Ngoding");
        taskList.add("Bismillah dapat project cuan");
        taskList.add("Semoga besok lebih baik");
        taskList.add("Jangan MALAS");
        
       taskList.removeTask("Jangan MALAS");
        
        System.out.println("Daftar harianku");
        taskList.printList();
        
    }
    
}
