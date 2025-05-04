public class InventoryManagement {
    public static void main(String[] args) {
        BinaryTree inventory = new BinaryTree();
        inventory.insert(50, "Item A");
        inventory.insert(30, "Item B");
        inventory.insert(70, "Item C");
        
        System.out.println("Daftar Inventaris (terurut) : ");
        inventory.inorderTransversal();

        // Tes pencarian
        System.out.println("Cari item dengan kode 30: " + inventory.search(30));
        System.out.println("Cari item dengan kode 100: " + inventory.search(100));
        
            // Menghapus item
        System.out.println("\nMenghapus item dengan kode 50:");
        inventory.delete(50);
        inventory.inorderTransversal();

        // Menghapus item lain
        System.out.println("\nMenghapus item dengan kode 30:");
        inventory.delete(30);
        inventory.inorderTransversal();
    }
}
