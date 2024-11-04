public class Sorting 
{
    public static void main(String[] args) 
    {
        int[] array = {32, 47, 82, 28, 11, 55, 70, 69, 23, 96};

        System.out.println("Before:");
        printArray(array);

        sortArray(array);

        System.out.println("After:");
        printArray(array);
    }

    private static void sortArray(int[] arr) 
    {
        int n = arr.length;
        for (int p = 1; p < n; p++) 
        {
            for (int i = 0; i < n - p; i++) 
            {
                if (arr[i] > arr[i + 1]) 
                {
                    int t = arr[i];
                    
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
    }

    private static void printArray(int[] arr)
     {
        for (int v : arr) 
        {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}