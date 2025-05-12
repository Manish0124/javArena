package linkedlist;

public class Main {

    public static void main(String[] args) {

        // LL list = new LL();

        // list.insertFirst(1);
        // list.insertFirst(12);
        // list.insertFirst(13);
        // list.insertFirst(14);
        // list.insertFirst(15);
        // list.insertLast(9);
        // list.insert(100, 2);
        // list.deleteFirst();
        // // System.out.println(list.deleteFirst());

        // // list.display();
        // // list.deleteLast();
        // // System.out.println(list.deleteLast());
        // list.display();
        // // list.delete(1);
        // System.out.println(list.delete(2));
        // list.display();
        // list.find(100);

        //double linked is here

        // DLL list = new DLL();

        // list.insertFirst(12);
        // list.insertFirst(13);
        // list.insertFirst(14);
        // list.insertFirst(15);
        // list.insetLast(99);
        
        // list.insert(14, 65);
        // list.display();

        CLL list = new CLL();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(19);
        list.display();
        list.delete(13);
        list.display();
    }
}