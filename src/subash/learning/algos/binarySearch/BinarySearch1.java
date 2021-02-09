package subash.learning.algos.binarySearch;

public class BinarySearch1 {
    Node root;

    private static class Node {
        int data;
        Node leftChild, rightChild;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node addInBinarySearchTree(int data) {
        Node currentNode = this.root;
        if (currentNode == null) {
            this.root = new Node(data);
            return this.root;
        }
        while (true) {
            if (data < currentNode.data) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = new Node(data);
                    break;
                } else {
                    currentNode = currentNode.leftChild;
                }
            } else {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = new Node(data);
                    break;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
        }
        return currentNode;
    }
}
