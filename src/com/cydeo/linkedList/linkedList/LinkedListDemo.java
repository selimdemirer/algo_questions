package com.cydeo.linkedList.linkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.nextAddress = node2;
        node2.nextAddress = node3;
        node3.nextAddress = node4;

        System.out.println("Node1's address is: " + node1 + " Node1's nextAddress address is: " + node1.nextAddress);
        System.out.println("Node2's address is: " + node2 + " Node2's nextAddress address is: " + node2.nextAddress);
        System.out.println("Node3's address is: " + node3 + " Node3's nextAddress address is: " + node3.nextAddress);
        System.out.println("Node4's address is: " + node4 + " Node4's nextAddress address is: " + node4.nextAddress);

        Node current;
        Node head = node1;
        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current = current.nextAddress;
        }




    }

}
