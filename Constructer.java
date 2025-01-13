
public class Constructer {

    int rupz;

    Constructer() {
        rupz = 0;

    }

    Constructer(int x) {
        rupz = x;
    }

    public static void main(String[] args) {
        Constructer rvee = new Constructer();
        Constructer yesh = new Constructer(5000);

        System.out.println(yesh.rupz);
        System.out.println(rvee.rupz);

    }

}
