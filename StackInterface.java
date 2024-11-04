public interface StackInterface<T> 
{
   public void push(T newEntry);
   
   public T pop(); 
   
   public T peek();
   
   public boolean isEmpty();
  
   public void clear();
   
   public T peek2(); // New method for peeking at the second entry
}