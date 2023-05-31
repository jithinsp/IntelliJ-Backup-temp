public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(34);
        queue.insert(53);
        queue.insert(78);
        queue.insert(9);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
