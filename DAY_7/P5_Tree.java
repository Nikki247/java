package DAY_7;

class tNode {
    int data;
    tNode left;
    tNode right;

    tNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class binaryTree {
    tNode root;

    public void inOrder(tNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
}

public class P5_Tree {

    public static void main(String[] args) {

        binaryTree tree = new binaryTree();

        tree.root = new tNode(1);
        tree.root.left = new tNode(2);
        tree.root.right = new tNode(3);
        tree.root.left.left = new tNode(4);
        tree.root.left.right = new tNode(5);
        tree.root.right.left = new tNode(7);

        tree.inOrder(tree.root);
    }
}