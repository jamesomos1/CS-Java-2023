import java.util.LinkedList;

public class Queues<T> implements QueueInterface<T> 
{
    private LinkedList<T> queue;

    public Queues() 
    {
        queue = new LinkedList<>();
    }

    public void enQueue(T newEntry)
    {
        queue.addLast(newEntry);
    }

    public T deQueue() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public T getFront() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() 
    {
        return queue.isEmpty();
    }

    public void clear() 
    {
        queue.clear();
    }
}