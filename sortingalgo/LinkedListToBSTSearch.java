package sortingalgo;
/*
Lead’s Idea (Clearly Explained)

The original data structure is a LinkedList, where each node contains a set of elements.

Searching directly in a LinkedList results in linear search, which is O(N).

Linear search does not scale well.

So instead of optimizing inside the LinkedList, the idea is to change the data structure.
 */

public class LinkedListToBSTSearch {

    // Node for LinkedList + BST
    static class Node {
        int id;
        String name;
        double salary;

        Node next;        // LinkedList pointer
        Node left, right; // BST pointers

        Node(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    // Insert node into BST (RECURSIVE)
    static Node insertBST(Node root, Node node) {
        if (root == null)
            return node;

        if (node.id < root.id)
            root.left = insertBST(root.left, node);
        else
            root.right = insertBST(root.right, node);

        return root;
    }

    // Convert LinkedList to BST
    static Node convertLinkedListToBST(Node head) {
        Node root = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            // important: break old links
            curr.next = null;
            curr.left = null;
            curr.right = null;

            root = insertBST(root, curr);
            curr = next;
        }
        return root;
    }

    // Binary Search in BST (RECURSIVE)
    static Node search(Node root, int id) {
        if (root == null || root.id == id)
            return root;

        if (id < root.id)
            return search(root.left, id);

        return search(root.right, id);
    }

    // Inorder traversal (for validation)
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.id + " ");
        inorder(root.right);
    }

    // MAIN
    public static void main(String[] args) {

        // Create LinkedList
        Node head = new Node(10, "A", 50000);
        head.next = new Node(5, "B", 40000);
        head.next.next = new Node(20, "C", 80000);
        head.next.next.next = new Node(3, "D", 30000);
        head.next.next.next.next = new Node(7, "E", 45000);
        head.next.next.next.next.next = new Node(15, "F", 70000);
        head.next.next.next.next.next.next = new Node(30, "G", 90000);

        // Convert LinkedList to BST
        Node root = convertLinkedListToBST(head);

        // Validate BST
        System.out.print("Inorder Traversal (Sorted): ");
        inorder(root);
        System.out.println();

        // Search
        int searchId = 7;
        Node result = search(root, searchId);

        if (result != null)
            System.out.println("Found: ID=" + result.id +
                    ", Name=" + result.name +
                    ", Salary=" + result.salary);
        else
            System.out.println("Node not found");
    }
}
