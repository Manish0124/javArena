package isstack.isqueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        queue.display();
        
        System.out.println(queue.remove() );
        queue.insert(56);
        queue.display();
    }
}
