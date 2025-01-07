import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithm {

    // Merge Sort (Iterative)
    public static void mergeSortIterative(int[] arr) {
        int n = arr.length;
        for (int currSize = 1; currSize <= n - 1; currSize = 2 * currSize) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    // Helper for merging two sorted arrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    // Merge Sort (Recursive)
    public static void mergeSortRecursive(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortRecursive(arr, left, mid);
            mergeSortRecursive(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Quick Sort (Iterative)
    public static void quickSortIterative(int[] arr) {
        int n = arr.length;
        int[] stack = new int[n];
        int top = -1;

        stack[++top] = 0;
        stack[++top] = n - 1;

        while (top >= 0) {
            int high = stack[top--];
            int low = stack[top--];

            int p = partition(arr, low, high);

            if (p - 1 > low) {
                stack[++top] = low;
                stack[++top] = p - 1;
            }

            if (p + 1 > high) {
                stack[++top] = p + 1;
                stack[++top] = high;
            }
        }
    }

    // Quick Sort (Recursive)
    public static void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortRecursive(arr, low, pi - 1);
            quickSortRecursive(arr, pi + 1, high);
        }
    }

    // Helper for partitioning array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Generate random array
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] lengths = random.ints(5, 500, 20001).toArray();

        System.out.println("Merge Sort (Iterative):");

        // Loop through different array lengths
        for (int length : lengths) {
            int[] array = generateRandomArray(length, 0, 100000);
            System.out.println("total elements in array: " + length);

            // Test Merge Sort (Iterative)
            int[] arr1 = Arrays.copyOf(array, array.length);
            long start = System.nanoTime();
            mergeSortIterative(arr1);
            long end = System.nanoTime();
            System.out.printf("time taken is %.6f seconds\n", (end - start) / 1e9);
        }

        System.out.println("\nMerge Sort (Recursive):");

        // Loop through different array lengths
        for (int length : lengths) {
            int[] array = generateRandomArray(length, 0, 100000);
            System.out.println("total elements in array: " + length);

            // Test Merge Sort (Recursive)
            int[] arr2 = Arrays.copyOf(array, array.length);
            long start = System.nanoTime();
            mergeSortRecursive(arr2, 0, arr2.length - 1);
            long end = System.nanoTime();
            System.out.printf("time taken is %.6f seconds\n", (end - start) / 1e9);
        }

        System.out.println("\nQuick Sort (Iterative):");

        // Loop through different array lengths
        for (int length : lengths) {
            int[] array = generateRandomArray(length, 0, 100000);
            System.out.println("total elements in array: " + length);

            // Test Quick Sort (Iterative)
            int[] arr3 = Arrays.copyOf(array, array.length);
            long start = System.nanoTime();
            quickSortIterative(arr3);
            long end = System.nanoTime();
            System.out.printf("time taken is %.6f seconds\n", (end - start) / 1e9);
        }

        System.out.println("\nQuick Sort (Recursive):");

        // Loop through different array lengths
        for (int length : lengths) {
            int[] array = generateRandomArray(length, 0, 100000);
            System.out.println("total elements in array: " + length);

            // Test Quick Sort (Recursive)
            int[] arr4 = Arrays.copyOf(array, array.length);
            long start = System.nanoTime();
            quickSortRecursive(arr4, 0, arr4.length - 1);
            long end = System.nanoTime();
            System.out.printf("time taken is %.6f seconds\n", (end - start) / 1e9);
        }
    }
}
