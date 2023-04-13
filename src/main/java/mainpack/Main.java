package mainpack;

public class Main {
    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addHead("10");
        String s = list.removeFromHead();
        System.out.println(s);
        list.addHead("20");
        list.addTail("30");
        String a = list.removeFromTail();
        System.out.println(a);
        String b = list.removeFromTail();
        System.out.println(b);
        list.addTail("40");
        boolean c = list.contains("41");
        System.out.println(c);
        list = new LinkedList();
        list.contains("11");

    }
}
