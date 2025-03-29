/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
public class FastFoodOrderQueue {
    
    public static void main(String[] args) {
        Queue orderQueue = new Queue(5);
        
        orderQueue.enqueue(101); //Pesanan ID 101
        orderQueue.enqueue(102);
        orderQueue.enqueue(103);
        
        System.out.println("Pesanan pertama kali yang akan dilayani : " 
                + orderQueue.dequeue());
        System.out.println("Pesanan berikutnya yang akan dilayani : " 
                + orderQueue.dequeue());
    
        //Menambahkan lebih banyak pesanan
        orderQueue.enqueue(104);
        orderQueue.enqueue(105);
        
        
        // Menampilkan pesanan yang sedang menunggu
        System.out.println("Pesanan terdepan saat ini (tanpa dikeluarkan): " 
                + orderQueue.peek());
        
        System.out.println("Menampilkan semua pesanan");
        while (!orderQueue.isEmpty()){
            System.out.println("Mengeluarkan pesanan : " 
                    + orderQueue.dequeue());
        }
    
    }
    
}
