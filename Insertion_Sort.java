
public class Insertion_Sort { // class declaration

    public static void main(String[] args) { // Entry point

        int arr[] = { 23, 5, 67, 43, 2222, 67, 88, 9, };
        int length = arr.length;

        System.out.println();
        System.out.print("unsorted array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println();
        System.out.print("Sorted array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}