public class BinaryTree {
    Node root;
    
    BinaryTree(){
        root = null;
    }
    
    // Getter for root, if you need to access it
    public Node getRoot() {
        return root;
    }

    void insert(int itemCode, String itemName){
        root = insertRec(root, itemCode, itemName);
    }
    
    Node insertRec(Node root, int itemCode, String itemName){
        if (root == null) {
            return new Node(itemCode, itemName);  // Memperbaiki syntax pembuatan node baru
        }
        
        if (itemCode < root.itemCode) {
            root.left = insertRec(root.left, itemCode, itemName);
        } else if (itemCode > root.itemCode) {
            root.right = insertRec(root.right, itemCode, itemName);
        }
        
        return root;
    }
    
    void inorderTransversal(){
        inorderRec(root);
    }
    
    void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.println(root.itemCode + " " + root.itemName); // Menampilkan itemCode dan itemName
            inorderRec(root.right);
        }
    }
    
    boolean search(int itemCode){
        return searchRec(root, itemCode);
    }
    
    boolean searchRec(Node root, int itemCode){
        if(root == null) return false;
        if(root.itemCode == itemCode) return true;
        
        return itemCode < root.itemCode ? searchRec(root.left, itemCode) : searchRec(root.right, itemCode);
    }
    
      // Hapus method
    void delete(int itemCode) {
        root = deleteRec(root, itemCode);
    }

    // Recursive method for deleting a node
    Node deleteRec(Node root, int itemCode) {
        if (root == null) {
            return root;
        }

        // If the itemCode to be deleted is smaller than the root's itemCode,
        // it lies in the left subtree
        if (itemCode < root.itemCode) {
            root.left = deleteRec(root.left, itemCode);
        }
        // If the itemCode to be deleted is larger than the root's itemCode,
        // it lies in the right subtree
        else if (itemCode > root.itemCode) {
            root.right = deleteRec(root.right, itemCode);
        }
        // If itemCode is the same as root's itemCode, then this is the node to be deleted
        else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.itemCode = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.itemCode);
        }

        return root;
    }
    
    
     // Method to find the smallest value in a tree
    int minValue(Node root) {
        int minValue = root.itemCode;
        while (root.left != null) {
            minValue = root.left.itemCode;
            root = root.left;
        }
        return minValue;
    }
    
}
