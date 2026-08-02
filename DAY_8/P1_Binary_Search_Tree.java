package DAY_8;

class bstNode {
    int data;
    bstNode left;
    bstNode right;

    bstNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class bst {
    bstNode root;

    public bstNode insert(bstNode root, int data) {
        if (root == null) {
            root = new bstNode(data);
        }

        if (data > root.data) {
            root.right = insert(root.right, data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }

        return root;
    }

    void inorder(bstNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    boolean search(bstNode root, int key) {
        if (root == null)
            return false;
        else if (root.data == key)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
}

public class P1_Binary_Search_Tree {
    public static void main() {
        int[] arr = {10, 20, 31, 22, 41};

        bst tree = new bst();

        for (int i : arr) {
            tree.root = tree.insert(tree.root, i);
        }

        tree.inorder(tree.root);

        System.out.println(
                tree.search(tree.root, 31)
                        ? "\n31 Data is present"
                        : "31 Data is absent"
        );

        System.out.println(
                tree.search(tree.root, 15)
                        ? "15 Data is present"
                        : "15 Data is absent"
        );
    }
}