public class BinaryTreeTraversal {
    static class Node{
        int value;
        Node left, right;

        Node(int val) {
            value = val;
            left = right = null;
        }
    }

    static void preorder(Node node){
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    static void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Preorder");
        preorder(root);

        System.out.println("\nInorder");
        inorder(root);

        System.out.println("\nPostorder");
        postorder(root);
    }
}
