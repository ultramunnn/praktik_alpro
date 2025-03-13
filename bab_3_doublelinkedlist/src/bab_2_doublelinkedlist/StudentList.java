/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab_2_doublelinkedlist;

/**
 *
 * @author munir
 */
public class StudentList {
    
    public static void main(String[] args) {
        
        DoubleLinkedList studentList = new DoubleLinkedList ();
        studentList.addLast("Joni");
        studentList.addLast("Pendik");
        studentList.addLast("Tio");
        
        
        studentList.printFoward();
        studentList.printBackward();
        
        
        studentList.removeByName("Pendik");
        
    
    }
    
}
