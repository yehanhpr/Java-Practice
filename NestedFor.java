public class NestedFor {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i = i + 2) {
            System.out.println(i);

            for (int j = 20; j < 30; j = j + 2) {
                System.out.println(j);
            }
        }
    }

}
