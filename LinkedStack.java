import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T>
 {
    private Node topNode;


    public LinkedStack() 
    {
        topNode = null;
    }
    public void push(T newEntry) 
    {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
    }

    public T pop()
    {
       T top = peek();

       topNode = topNode.getNextNode();
       return top;
    }

    public T peek()
    {
        if (isEmpty())
        throw new EmptyStackException();
        else
        return topNode.getData();
    }

    public T peek2()
    {
        if (isEmpty())
        throw new EmptyStackException();
        else
        return topNode.getData();
    }

    public boolean isEmpty() 
    {
        return topNode == null;
    }

    public void clear() 
    {
        topNode = null;
    }

    private class Node 
    {
        private T data;
        private Node nextNode;

        private Node(T data) 
        {
            this(data, null);
        }

        private Node(T data, Node nextNode) 
        {
            this.data = data;
            this.nextNode = nextNode;
        }

        private T getData() 
        {
            return data;
        }

        private Node getNextNode() 
        {
            return nextNode;
        }
    }
}