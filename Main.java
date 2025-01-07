public class Main {

    public Main(int year, String name) {

        String modelname = name;
        int modelyear = year;

        System.out.println("my car model is: " + modelname + " and its year is: " + year);

    }

    public static void main(String[] args) {

        Main obj = new Main(1999, "Mustang");

    }
}
