import java.util.Date;

public class Algorithms 
{
    public static void main(String[] args) 
    {
        System.out.println("n\tA(msec)\tB(msec)\tC(msec)");

        for (int n = 2000; n <= 20000; n += 2000) 
        {
            long start, stop;

            //Algorithm A
            start = new Date().getTime();
            algorithmA(n);
            stop = new Date().getTime();
            long elapsedATime = stop - start;

            //Algorithm B
            start = new Date().getTime();
            algorithmB(n);
            stop = new Date().getTime();
            long elapsedBTime = stop - start;

            //Algorithm C
            start = new Date().getTime();
            algorithmC(n);
            stop = new Date().getTime();
            long elapsedCTime = stop - start;

            System.out.println(n + "\t" + elapsedATime + "\t" + elapsedBTime + "\t" + elapsedCTime);
        }
    }

    public static void algorithmA(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum = sum + 1;
        }
    }

    public static void algorithmB(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                sum = sum + 1;
            }
        }
    }

    public static void algorithmC(int n)
    {
        int sum = n * (n + 1) / 2;
    }
}