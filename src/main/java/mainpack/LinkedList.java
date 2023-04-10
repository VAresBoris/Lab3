package mainpack;

public class LinkedList {
    private Node head;
    private Node tail;


    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(String value){         //1. добавление в начало списка
        Node node = new Node();
        node.value = value;
        if (head==null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public String peekFromHead() {                   // 2. извлечение значения из начала списка без удаления
        return head != null ? head.value : null;
    }

    public String removeFromHead() {     // 3. извлечение значения из начала списка с удаления
        if(head == null)
            return null;
        String temp = head.value;
        if(head != tail) {
            head = head.next;
        } else {
            head = tail = null;
        }
        return temp;
    }

    public void append(){                          //4. добавление в конец списка
        if (tail != null) {
            tail.next = new Node();
            tail = tail.next;
        } else {
            head = tail = new Node();
        }
    }

    public Object peekFromTail() {
        return tail != null ? tail.value : null;
    }  // 5. извлечение значения из конца списка без удаления


    public String removeFromTale() {   // 6. извлечение значения из конца списка с удалением
        if(tail == null)
            return null;

        String res = tail.value;
        if(head != tail) {
            Node a = head;
            while(a.next != tail)
                a = a.next;
            a.next = null;
            tail = a;
        } else {
            head = tail = null;
        }
        return res;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void printAll() {    // печать
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    private static class Node{
        Node next;
        String value;

        public Node() {
            this.next = null;
            this.value = null;
        }
    }
}



