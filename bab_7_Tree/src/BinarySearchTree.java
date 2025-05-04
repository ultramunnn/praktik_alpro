class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Menambahkan kontak telepon
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Penyisipan rekursif
    Node insertRec(Node root, int key) {
        // Jika pohon kosong, buat node baru
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Jika key lebih kecil, masukkan ke subtree kiri
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } 
        // Jika key lebih besar, masukkan ke subtree kanan
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Menampilkan semua kontak telepon secara terurut
    void inorder() {
        inorderRec(root);
    }

    // Inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Mencari kontak berdasarkan nomor telepon
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Pencarian rekursif
    boolean searchRec(Node root, int key) {
        // Basis: jika root null atau key ditemukan
        if (root == null) return false;
        if (root.key == key) return true;

        // Cari di subtree kiri atau kanan
        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    // Menghapus kontak berdasarkan nomor telepon
    void delete(int key) {
        root = deleteRec(root, key);
    }

    // Menghapus kontak secara rekursif
    Node deleteRec(Node root, int key) {
        // Jika pohon kosong
        if (root == null) return root;

        // Cari node yang akan dihapus
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node yang ingin dihapus ditemukan

            // Node dengan satu anak atau tidak ada anak
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node dengan dua anak: ambil inorder successor (terkecil di subtree kanan)
            root.key = minValue(root.right);

            // Hapus inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Temukan nilai terkecil (inorder successor)
    int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }
}
