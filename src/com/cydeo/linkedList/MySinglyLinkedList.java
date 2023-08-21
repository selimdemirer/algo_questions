package com.cydeo.linkedList;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void printNodes() {

        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.println(current.id + "=>");
            }
            current = current.next;
        }

    }

    void add(int data) {

        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void deleteById(int id) {

        if (isEmpty()) System.out.println("List is empty!!!");

        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

    // Assignment -1: indexOf() Method
    /*
      1. Find the indexOf an element and return it.
      2. If not found return -1.
                  int indexOf (int id) {
                  // write your code here
                  ………..
                  return -1;
                  }
*/
    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos = 0;
        // iterate through the list
        Node current = head;// set my current with the starting element;
        while (current != null) {
            if (current.id == id) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }

    // Assignment -2: addFirst(int value) Method
    /*
        1. Implement a method that makes the insertion into first element of LinkedList
                void addFirst (int data){
                // write your code here
                ………..
                }
*/
    void addFirst(int data) {
        // create a new node object from data
        Node node = new Node(data);
        // case 1: list empty
        if (isEmpty()) {
            head = tail = node;
        } else {// case 2 : list is not empty
            node.next = head;
            head = node;
        }
        //increase size
        size++;

    }

    // Assignment -3: Get Kth Item From the Last With Two Pointer Strategy
    /*
        1. You don’t know the size of the singly linked list.
        2. Find the Kth item from last and print it in one pass.
        3. Item already exists in the linked list.
        0 1 2 3 4 5 6 7 null
        p1
        p2
        1. Move p2 k times
        2. Then move both until p2 hits last item

        public int getKthFromLast(int k){
        // write your code here
        return ….;
        }
*/
    int getKthItemFromLast(int k) {
        // create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        // move ptr2 k-1 times

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;
    }

    // Assignment -4: Remove Kth Item From the Last With Two Pointer Strategy
    /*
    1. You don’t know the size of the singly linked list.
    2. Delete the Kth item from last in one pass.
                public void removeKthFromLast(int k) {
                // write your code here….
                }

*/
    void removeKthItemFromLast(int k) {
        // create three pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        // move ptr2 k-1 times

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        // Do delete operation
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else if (ptr1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;

        }

    }

    public void removeKthItemFromLast2(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {

            ptr2 = ptr2.next;

            if (ptr2 == null) System.out.println("Less than k elements");

            else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next != null) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }

        ptr1.next = ptr1.next.next;
        ptr1 = ptr1.next;
        ptr1 = null;


    }
}
