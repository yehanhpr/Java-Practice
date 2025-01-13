public class CreateArray {

    public static void main(String[] args) {

        String[] cars = { "BMW", "VOLVO", "FORD" };

        cars[0] = "BENS";

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println();

            System.out.println(i + 1);

            for (String p : cars) {
                System.out.print(p + " \t");

            }
        }

    }

}
