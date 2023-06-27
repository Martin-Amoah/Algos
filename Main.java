import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the algorithm type (linear/binary/merge/bubble/selection/quick/insertion):");
        String algorithm = scanner.next();

        if (algorithm.equals("linear")) {
            System.out.println("Enter the key to search for:");
            int key = scanner.nextInt();
            long startTime = System.currentTimeMillis();
            int index = LinearSearch.linearSearch(arr, key);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index " + index);
                System.out.println("Total time taken: " + totalTime + " milliseconds");
            }
        } else if (algorithm.equals("binary")) {
            System.out.println("Enter the key to search for:");
            int key = scanner.nextInt();
            long startTime = System.currentTimeMillis();
            int index = BinarySearch.binarySearch(arr, key);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index " + index);
                System.out.println("Total time taken: " + totalTime + " milliseconds");
            }
        } else if (algorithm.equals("merge")) {
            long startTime = System.currentTimeMillis();
            MergeSort.mergeSort(arr, 0, arr.length - 1);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Total time taken: " + totalTime + " milliseconds");
        } else if (algorithm.equals("bubble")) {
            long startTime = System.currentTimeMillis();
            // implement bubble sort and search for key using linear or binary search
            BubbleSort.bubbleSort(arr);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Total time taken: " + totalTime + " milliseconds");
        } else if (algorithm.equals("selection")) {
            long startTime = System.currentTimeMillis();
            // implement selection sort and search for key using linear or binary search
            SelectionSort.selectionSort(arr);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Total time taken: " + totalTime + " milliseconds");
        } else if (algorithm.equals("quick")) {
            long startTime = System.currentTimeMillis();
            // implement quick sort and search for key using linear or binary search
            QuickSort.quickSort(arr, 0, size - 1);
            long endTime = System.currentTimeMillis();
            System.out.println("Sorted Array: " + arr);
            long totalTime = endTime - startTime;
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Total time taken: " + totalTime + " milliseconds");
        } else if (algorithm.equals("insertion")) {
            long startTime = System.currentTimeMillis();
            // implement insertion sort and search for key using linear or binary search
            InsertionSort.insertionSort(arr);
            long endTime = System.currentTimeMillis();
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            long totalTime = endTime - startTime;
            System.out.println("Total time taken: " + totalTime + " milliseconds");
        } else {
            System.out.println("Invalid algorithm type");
        }

    }
}
