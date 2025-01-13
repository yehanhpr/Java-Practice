
public class MultyArrayWithMethod {

    public static void main(String[] args) {

        int[][] mynum = { { 22, 33, 44 }, { 2, 14, 100 }, { 555, 99, 1 } };
        method(mynum);

    }

    public static void method(int x[][]) {
        for (int i = 0; i < x.length; i++) {

            System.out.println();

            System.out.println(i + 1 + " row ");

            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
