import java.util.Random;

public class RandomArraySum {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] array = new int[10];
        int sum = 0;
        float avj = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20000 - 500 + 1) + 500;

            System.out.println(i + 1 + " element: " + array[i]);
        }

        for (int x : array) {
            sum = sum + x;
        }

        System.out.println("sum of the all elements is: " + sum);

        System.out.println("array.length = " + array.length);

        System.out.println("Avarge is: " + sum / array.length);
    }
}
