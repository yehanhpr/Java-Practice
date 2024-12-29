public class CreateArray {

    public static void main(String[] args) {

        String[] cars = { "BMW", "VOLVO", "FORD" };

        cars[0] = "BENS";

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.print(i + " ");

            for (String p : cars) {
                System.out.print(p + " ");

            }
        }

    }

}
