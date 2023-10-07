package com.cydeo.linkedList;

import com.cydeo.linkedList.linkedList.MySinglyLinkedList;
import com.cydeo.linkedList.linkedList.Node;

public class PrintMiddleBruteForce {

    public static void main(String[] args){

        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }

        printMiddle(sll);

    }

    public static void printMiddle(MySinglyLinkedList sll){

        // Create two pointers
        Node a = sll.head;
        Node b = sll.head;
        // Iterate over the linked list
        while (b != sll.tail && b.nextAddress != sll.tail){
            a = a.nextAddress;             // single jump
            b = b.nextAddress.nextAddress; // double jump
        }

        if (b == sll.tail) System.out.println(a.id);        // b is on tail, odd number of nodes
        else System.out.println(a.id+","+a.nextAddress.id); // b is before tail, even number of nodes

    }


}
/*
Problem:
• Find the middle of a linked list in one pass. If the list has an even number of
nodes, there would be two middle nodes.
• Note: Assume that you don’t know the size of the list ahead of time.

Slow/Fast Runner Solution Steps:
1. Create two pointers
2. Single jump with a
3. Double jump with b
4. If b==tail print a,
5. If b.next==tail print a & a.next

 */