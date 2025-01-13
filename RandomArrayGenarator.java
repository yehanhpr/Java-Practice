
import java.util.Random;

public class RandomArrayGenarator {

    public static void main(String[] args) {

        Random rndObj = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rndObj.nextInt(20000 - 500 + 1) + 500;
        }

        for (int num : array) {
            System.out.println(num);
        }
    }

}
