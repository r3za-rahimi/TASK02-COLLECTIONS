package org.mapsa.Q34;

public class Node {

    private Node next;
    private int data;


    public Node() {
    }

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }





    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
