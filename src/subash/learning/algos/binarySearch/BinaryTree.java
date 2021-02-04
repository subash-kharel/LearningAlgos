package subash.learning.algos.binarySearch;

public class BinaryTree {

    //7,1,0,3,2,5,4,6,9,8,10
     static class Node{
        Node left,right;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
    Node root;

    public Node addNode(int data){
        Node currentNode = this.root;
        if(currentNode == null) {
            root = new Node(data);
            return root;
        }
        while(true){
            if(data < currentNode.data){
                if(currentNode.left == null){
                    currentNode.left = new Node(data);
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if(currentNode.right == null){
                     currentNode.right = new Node(data);
                     break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
            return currentNode;


    }

    public boolean contains(int value){
        Node currentNode = this.root;
        while(currentNode !=null){
            if(value < currentNode.data){
                currentNode = currentNode.left;
            } else if(value > currentNode.data){
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    //target 12
    public  int findClosestValueInBst(Node tree, int target) {
        Node currentNode = tree;
        int closestValue = tree.data;
        while(currentNode != null){

            if( Math.abs(currentNode.data-target)< Math.abs(closestValue -target)){
                closestValue = currentNode.data;
            }
            if(target < currentNode.data){
                currentNode = currentNode.left;
            } else if(target > currentNode.data){
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
  

        return closestValue;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(10);
        binaryTree.addNode(5);
        binaryTree.addNode(2);
        binaryTree.addNode(5);
        binaryTree.addNode(1);
        binaryTree.addNode(15);
        binaryTree.addNode(13);
        binaryTree.addNode(22);
        binaryTree.addNode(14);
        System.out.println(binaryTree.contains(-1));
        System.out.println(binaryTree.contains(10));
    }


}
