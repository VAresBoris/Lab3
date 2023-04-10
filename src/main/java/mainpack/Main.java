package mainpack;

public class Main {
    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add("10");
            list.add("20");
            list.add("30");
            list.printAll();
            list.removeFromHead();
            list.printAll();
            list.removeFromTale();
            list.printAll();
    }
}
