public class MultiArray {

    public static void main(String[] args) {

        int[][] mynum = { { 22, 33, 44 }, { 214 }, { 555, 99, 1, 56, 78 } };

        for (int i = 0; i < mynum.length; i++) {

            System.out.println();

            System.out.println(i + 1 + " row: ");

            for (int j = 0; j < mynum[i].length; j++) {

                System.out.print(mynum[i][j] + " ");
            }
            System.out.println();

        }

    }
}
