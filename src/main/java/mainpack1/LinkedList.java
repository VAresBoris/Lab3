package mainpack1;

public class LinkedList {
    private Node head;
    private Node tail;


    public void addTail(String value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }

    }

    public void addHead(String value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public String getHead() {
        if (head != null) {
            return head.value;
        }
        return null;
    }

    public String getTail() {
        if (tail != null) {
            return tail.value;
        }
        return null;
    }

    public String removeFromHead() {
        if (head == null) {
            return null;
        }
        String value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
            return value;
        }
        head.prev = null;
        return value;
    }

    public String removeFromTail() {
        if (tail == null) {
            return null;
        }
        String value = tail.value;
        tail = tail.prev;
        if (tail == null){
            head = null;
            return value;
        }
        tail.next = null;
        return value;
    }

    public boolean contains(String value) {
        Node nex = head;
        while (nex != null) {
            if (nex.value == value) {
                return true;
            }
            nex = nex.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addBeforeArray(String[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            String s = array[i];
            addHead(s);
        }
    }

    public void addAfterArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            String s = array[i];
            addTail(s);
        }
    }



    public void printAll() {    // печать
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    private static class Node {
        Node next;
        final String value;
        Node prev;

        public Node(String value) {
            this.value = value;
        }
    }
}



