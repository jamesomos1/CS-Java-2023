public class Algorithm
 {
    public static void main(String[] args) 
    {
        int[] nValues = {2000, 4000, 6000, 8000, 10000, 12000, 14000, 16000, 18000, 20000};

        System.out.println("n\tA(msec) \tB(msec) \tC(msec)");
        for (int n : nValues) 
        {
            long startTime, endTime;

            // Algorithm 1
            startTime = System.currentTimeMillis();
            algorithm1(n);
            endTime = System.currentTimeMillis();
            long algorithm1Time = endTime - startTime;

            // Algorithm 2
            startTime = System.currentTimeMillis();
            algorithm2(n);
            endTime = System.currentTimeMillis();
            long algorithm2Time = endTime - startTime;

            // Algorithm 3
            startTime = System.currentTimeMillis();
            algorithm3(n);
            endTime = System.currentTimeMillis();
            long algorithm3Time = endTime - startTime;

            System.out.println(n + "\t" + algorithm1Time + "\t\t\t" + algorithm2Time + "\t\t\t" + algorithm3Time);
        }

        // Find the value of n for which Loop B is faster than Loop A
        int nForFasterLoop = findNFasterLoop();
        System.out.println("For n = " + nForFasterLoop + ", Loop B is faster than Loop A.");
    }
    
    public static void algorithm1(int n) 
    {
        long sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= 10000; j++) 
            {
                sum += j;
            }
        }
    }

    public static void algorithm2(int n) 
    {
        long sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                sum += j;
            }
        }
    }

    public static void algorithm3(int n) 
    {
        long sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n * n; j++) 
            {
                sum += j;
            }
        }
    }

    public static int findNFasterLoop()
     {
        int n = 1;
        long loopATime, loopBTime;

        while (true)
        {
            // Loop A
            loopATime = measureLoopA(n);

            // Loop B
            loopBTime = measureLoopB(n);

            if (loopBTime < loopATime) 
            {
                return n; // Loop B is faster
            }
            n++;
        }
    }

    public static long measureLoopA(int n) 
    {
        long sum = 0;
        long startTime = System.currentTimeMillis();
        
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= 10000; j++) 
            {
                sum += j;
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long measureLoopB(int n) 
    {
        long sum = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++)
            {
              sum += j;
            }
        }
        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
    }
}