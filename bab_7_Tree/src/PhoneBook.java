public class PhoneBook {
    public static void main(String[] args) {
        BinarySearchTree phoneBook = new BinarySearchTree();

        // Menambahkan beberapa kontak telepon
        phoneBook.insert(987654321);
        phoneBook.insert(123456789);
        phoneBook.insert(567890123);
        phoneBook.insert(345678901);
        phoneBook.insert(765432109);

        System.out.println("Daftar Kontak (terurut):");
        phoneBook.inorder();  // Menampilkan kontak dalam urutan terurut

        // Tes pencarian
        System.out.println("\nMencari kontak dengan nomor 123456789: " + phoneBook.search(123456789)); // True
        System.out.println("Mencari kontak dengan nomor 111222333: " + phoneBook.search(111222333)); // False

        // Menghapus kontak
        System.out.println("\nMenghapus kontak dengan nomor 123456789:");
        phoneBook.delete(123456789);
        phoneBook.inorder();  // Menampilkan kontak setelah penghapusan
    }
}
