import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        // Creates a PriorityQueue with the default initial capacity(11)
        // that orders its elements according to their natural ordering.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // (1) add()
        // The insertion order is not retained in the PriorityQueue.The elements
        // are stored based on the priority order which is ascending by default.

        pq.add(100);
        pq.add(0);
        pq.add(50);
        pq.add(10);
        pq.add(10);
        pq.add(10);
        pq.add(200);
        pq.add(500);

        System.out.println("Priority Queue: " + pq);

        // (2) peek() : Printing the top element of PriorityQueue
        System.out.println("Top element of PQ: " + pq.peek());

        // poll() : Printing the top element and removing
        // it from the PriorityQueue container.
        System.out.println("Removing top element: " + pq.poll());

        System.out.println(pq.peek());
    }

}