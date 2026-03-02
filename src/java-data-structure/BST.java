public class BST {
    static class Node{
        int value;
        Node left, right;

        Node(int val) {
            value = val;
            left = right = null;
        }
    }

    Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.value) {
            node.left = insert(node.left, val);
        } else if (val > node.value) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    Node search(Node node, int val) {
        if (node == null || node.value == val) {
            return node;
        }
        if (val < node.value) {
            return search(node.left, val);
        } else {
            return search(node.right, val);
        }
    }

    Node minValueNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    Node delete(Node node, int val) {
        if (node == null) {
            return node;
        }
        if (val < node.value) {
            node.left = delete(node.left, val);
        } else if (val > node.value) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node temp = minValueNode(node.right);
            node.value = temp.value;
            node.right = delete(node.right, temp.value);
        }
        return node;
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            root = tree.insert(root, val);
        }
        System.out.println("Inorder before deletion: ");
        tree.inorder(root);

        root = tree.delete(root, 30);

        System.out.println("\nInorder after deleting 30: ");
        tree.inorder(root);

        System.out.println("Search 70: ");
        System.out.println(tree.search(root, 70).value);
    }
}
