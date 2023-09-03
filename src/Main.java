public class Main {
    public static void main(String[] args) {
        int[]  arr= {4,-3,-5,9,1,11};

        int[] large = new int[arr.length];
        int[] small = new int[arr.length];
        int smallIndex = 0;
        int largeIndex = 0;

        int m = 1;
        for(int i = 0; i <= arr.length-1; i++)
        {
            if (arr[i] < m)
                large[largeIndex++] = arr[i];
            else if (arr[i] > m )
                small[smallIndex++] = arr[i];
        }
        System.out.print("array: ");
        for (int i = 0; i <= arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("m: " + m);
        System.out.print("smaller: ");
        for(int i = 0; i<=smallIndex-1; i++)
        {
            System.out.print(small[i] + " ");
        }
        System.out.println();
        System.out.print("larger: ");
        for(int i = 0; i<=largeIndex-1; i++)
        {
            System.out.print(large[i] + " ");
        }

    }
}