package linkedlist;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertLast(9);
        list.insert(100, 2);
        list.deleteFirst();
        // System.out.println(list.deleteFirst());

        list.display();
        list.deleteLast();
        System.out.println(list.deleteLast());
        list.display();
    }
}