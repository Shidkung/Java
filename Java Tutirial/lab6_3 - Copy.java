public class lab6_3 {
    public static void main(String[] args) {

        Queue queue = new Queue();
        // inserting 20 numbers into queue
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }

        // displaying 20 numbers first in first out basis
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d ", queue.dequeue());
            if ((i + 1) % 5 == 0) System.out.printf("\n");
        }
    }
}
