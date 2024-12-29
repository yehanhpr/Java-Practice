import java.util.Random;

public class Sortalgorithm {

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }

    public static void main(String[] args) {
        int size = 1000; // Define the desired size of the array
        int minValue = 500; // Minimum value in the random array
        int maxValue = 20000; // Maximum value in the random array

        int[] randomArray = generateRandomArray(size, minValue, maxValue);

        // Print the first 5 elements of the array to verify
        System.out.println("Random Array: ");
        for (int i = 0; i < Math.min(randomArray.length, 5); i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
