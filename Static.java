class StaticExample {
    static int count = 9;

    static void myMeth() {
        System.out.println("display count value: " + count);
    }
}

public class Static {

    public static void main(String[] args) {

        StaticExample.count = 78;
        StaticExample.myMeth();
    }
}
