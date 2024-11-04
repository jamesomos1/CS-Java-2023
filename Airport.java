import java.util.Random;

public class Airport 
{
    public static void main(String[] args)
     {
        QueueInterface<String> inAir = new Queues<>();
        QueueInterface<String> onGround = new Queues<>();

        Random num = new Random();
        int numPlane = 18;
        for (int i = 0; i < numPlane; i++)
        {
            String plane = "Flight " + num.nextInt(1000);
            if (num.nextBoolean()) 
            {
                inAir.enQueue(plane);
                System.out.println(plane + " has joined the queue in the air.");
            } 
            else 
            {
                onGround.enQueue(plane);
                System.out.println(plane + " has joined the queue on the ground.");
            }
        }

        int numOperations = 11;
        for (int i = 0; i < numOperations; i++) 
        {
            if (!inAir.isEmpty())
            {
                String plane = inAir.deQueue();
                System.out.println(plane + " has successfully landed!");
            } 
            else if (!onGround.isEmpty()) 
            {
                String plane = onGround.deQueue();
                System.out.println(plane + " has successfully taken off!");
            } 
            else 
            {
                System.out.println("No planes need to land or take off!");
            }
            System.out.println("No planes need to land or take off!");
        }
    }
}