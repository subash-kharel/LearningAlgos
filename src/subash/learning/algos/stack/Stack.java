package subash.learning.algos.stack;

import java.util.EmptyStackException;

public class Stack {

    class Node {
        int data;
        Node next;

    }
    Node head;
    int counter =0;
    public boolean isEmtpy(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        counter++;
    }

    public int peek(){
        if(head == null){
            return Integer.parseInt(null);
        }
        return head.data;
    }

    public int pop(){
        if(head == null){
            throw new EmptyStackException();
        }
        int temp = head.data;
        head = head.next;
        counter--;
        return temp;
    }

    public boolean containsVal(int data){
        Node nodeToIterate = head;
        while(nodeToIterate!=null){
            if(nodeToIterate.data == data){
                return true;
            }
            nodeToIterate = nodeToIterate.next;
        }
        return false;
    }

    public int size(){
        return counter;
    }

    public int peekValAtSpecificIndex(int index){
        if(index >= counter){
            return Integer.parseInt(null);
        }
        Node nodeToIterate = head;

        while(index !=0){
            nodeToIterate = nodeToIterate.next;
            index--;
        }
        return nodeToIterate.data;
    }
}
