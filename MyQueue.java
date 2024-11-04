import java.util.LinkedList;

public class MyQueue<T> implements QueueInterface<T> {
    // We'll use a LinkedList as the underlying data structure for our queue
    private LinkedList<T> queue;

    // Constructor to initialize the queue
    public MyQueue() {
        queue = new LinkedList<>();
    }

    // Add an item to the back of the queue
    public void enQueue(T newEntry) {
        queue.addLast(newEntry);
    }

    // Remove and return the item from the front of the queue
    public T deQueue() {
        if (isEmpty()) {
            // If the queue is empty, throw an exception
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Return the item at the front of the queue without removing it
    public T getFront() {
        if (isEmpty()) {
            // If the queue is empty, throw an exception
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Clear all items from the queue
    public void clear() {
        queue.clear();
    }
}