import java.util.Date;

public class Loops 
{
    public static void main(String[] args) 
    {
        int n = 10000;
        long loopA, loopB;

        while(true) 
        {
            long start, stop;

            //Loop A
            start = new Date().getTime();
            loopA(n);
            stop = new Date().getTime();
            loopA = stop - start;

            //Loop B
            start = new Date().getTime();
            loopB(n);
            stop = new Date().getTime();
            loopB = stop - start;

            if(loopB < loopA)
            {
                break;
            }
            n--;
        }

        System.out.println("For n = " +n+ ", Loop B is faster than Loop A.");
    }
    
    public static void loopA(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= 10000; j++) 
            {
                sum += j;
            }
        }
    }
    public static void loopB(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                sum += j;
            }
        }
    }
}