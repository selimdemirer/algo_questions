package com.cydeo.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedListApp {

    public static void main(String[] args) {

        System.out.println("********************1********************");
        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());
        System.out.println("********************2********************");

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
        System.out.println("********************3********************");
        myList.deleteById(3);
        myList.printNodes();
        System.out.println("********************4********************");
        System.out.println("index of 8 : "+myList.indexOf(3));
        System.out.println("********************5********************");
        myList.addFirst(10);
        myList.printNodes();
        System.out.println("********************6********************");
        System.out.println(myList.getKthItemFromLast(3));
        System.out.println("********************7********************");
        myList.removeKthItemFromLast2(3);
        myList.printNodes();

    }
}
