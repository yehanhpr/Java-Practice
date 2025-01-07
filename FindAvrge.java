
public class FindAvrge {

    public static void main(String[] args) {
        int[][] myArray = { { 22, 33, 44 }, { 214 }, { 555, 99, 1, 56, 78 } };
        avj(myArray);

    }

    public static void avj(int number[][]) {
        int total = 0;
        int sum = 0;
        int lenth = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println();

            System.out.println("\t" + i + 1 + " row ");

            for (int j = 0; j < number[i].length; j++) {

                System.out.print(number[i][j] + "\t");

                total = total + number[i][j];
                lenth = lenth + number.length;

            }

        }
        sum = sum + total;
        System.out.println();
        System.out.println("sum is: " + sum);
        System.out.println("Avrge is: " + sum / lenth);

    }

}
