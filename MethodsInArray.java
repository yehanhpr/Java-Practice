public class MethodsInArray {

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 6 };
        myMethod(num);

        for (int y : num) {
            System.out.println(y);
        }
    }

    public static void myMethod(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 10;
        }
    }
}
